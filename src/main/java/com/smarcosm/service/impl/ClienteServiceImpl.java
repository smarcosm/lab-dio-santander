package com.smarcosm.service.impl;

import com.smarcosm.model.Cliente;
import com.smarcosm.model.ClienteRepository;
import com.smarcosm.model.Endereco;
import com.smarcosm.model.EnderecoRepository;
import com.smarcosm.service.ClienteService;
import com.smarcosm.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    @Override
    public Iterable<Cliente> buscarTodos() {

        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            return cliente.get();
        } else {
            throw new RuntimeException("Cliente não encontrado com id: " + id);
        }
    }


    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            if (novoEndereco != null) {
                enderecoRepository.save(novoEndereco);
                return novoEndereco;
            } else {
                throw new RuntimeException("Não foi possível criar um novo endereço com o CEP: " + cep);
            }
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        } else {
            throw new RuntimeException("Cliente não encontrado com id: " + id);
        }
    }

    @Override
    public void deletar(Long id) {
            clienteRepository.deleteById(id);

    }
}