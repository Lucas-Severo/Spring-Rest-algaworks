<div align="center">
  <h1>Spring Rest Algaworks</h1>
</div>

<div align="center">
Repositório referente ao projeto desenvolvido durante o workshop SpringRest da algaworks
</div>

## Objetivo:
Desenvolver uma Rest API para cadastro de ordens de serviços para clientes.

## Requisitos:
Para utilizar este projeto é necessário:
- Java 11
- MySql
- IDE de sua preferência (No workshop foi utilizado o Spring Tool Suite)

## Configuração:
Após a instalação do mysql altere as configurações do [Application.properties](https://github.com/Lucas-Severo/Spring-Rest-algaworks/blob/master/src/main/resources/application.properties) de acordo com a sua configuração.

## Execução:
Após ter todo o ambiente de desenvolvimento preparado é só abrir o projeto em sua IDE e executar.

## Endpoits:
Para utilizar a API está configurado os seguintes endpoints:

- Clientes:
```
Cadastrar - /clientes - Post
Listar clientes - /clientes - Get
Buscar cliente - /clientes/{clienteId} - Get
Atualizar - /clientes/{clienteId} - Put
Excluir - /clientes/{clienteId} - Delete
```

- Ordem de Serviço:
```
Adicionar - /ordens-servico - Post
Listar ordens de serviço - /ordens-servico - Get
Buscar ordem de serviço - /ordens-servico/{ordemServicoId} - Get
Finalizar ordem de serviço - /ordens-servico/{ordemServicoId}/finalizacao - Put
```

- Comentário:
```
Adicionar - /ordens-servico/{ordemServicoId}/comentarios - Post
Listar - /ordens-servico/{ordemServicoId}/comentarios - Get
```


