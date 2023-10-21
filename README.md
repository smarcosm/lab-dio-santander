# Desafio: Explorando Padrões de Projeto na Prática com Java

Este é um projeto desafio do módulo "Explorando Padrões de Projeto na Prática com Java" que faz parte do Santander Bootcamp 2023 - Backend Java realizado pela DIO - Digital Innovation One. O objetivo deste projeto é demonstrar o uso prático de Padrões de Projeto em uma aplicação Spring Boot.

## Descrição

Este projeto explora o conceito de Padrões de Projeto na prática. Ele inclui exemplos de como implementar e usar vários padrões de projeto em uma aplicação Spring Boot.

## Configuração e Execução

1. Clone o repositório para a sua máquina local.
2. Navegue até o diretório do projeto.
3. Execute o comando `mvn clean install` para construir o projeto.
4. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.

## Padrões de Projeto Utilizados

Este projeto utiliza os seguintes padrões de projeto:

- **Padrão Singleton**: Este padrão garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
- **Padrão Strategy**: Este padrão permite que o algoritmo de uma operação seja selecionado em tempo de execução.
- **Padrão Facade**: Este padrão fornece uma interface unificada para um conjunto de interfaces em um subsistema. A fachada define uma interface de nível superior que torna o subsistema mais fácil de usar.
- **Padrão Controller**: Este padrão é usado para manipular as solicitações HTTP e retornar uma resposta. Veja `com.smarcosm.controller`.
- **Padrão Service**: Este padrão é usado para encapsular a lógica de negócios da aplicação. Veja `com.smarcosm.service.impl`.
- **Padrão Model (ou Entity)**: Este padrão é usado para mapear as tabelas do banco de dados para objetos Java. Veja `com.smarcosm.model`.
- **Padrão Feign Client**: Este padrão é usado para declarar um cliente Feign que faz chamadas HTTP para um serviço externo de maneira declarativa. Veja `com.smarcosm.service`.

## Documentação da API

A documentação da API foi gerada usando o SpringDoc OpenAPI Starter WebMVC UI - Swagger.

## Dependências

Este projeto utiliza as seguintes dependências:

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Cloud Starter OpenFeign
- H2 Database
- Spring Boot Starter Test
- SpringDoc OpenAPI Starter WebMVC UI

Para mais detalhes, consulte o arquivo `pom.xml`.

## Contribuição

Sinta-se à vontade para contribuir com este projeto. Todas as contribuições são bem-vindas!

