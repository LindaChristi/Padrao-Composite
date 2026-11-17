
# Padrão de Projeto Composite

Exercício desenvolvido para a disciplina de **Arquitetura e Projeto de Software**.

**Autora:** Linda Freitas.

## Descrição

Este projeto apresenta um exemplo de utilização do padrão de projeto estrutural Composite.

A aplicação simula um controle de estoque, organizando produtos em categorias.

Os exemplos utilizados são:

- Madeiras;
- Ferramentas;
- Materiais de construção.

O padrão Composite permite organizar objetos individuais e grupos de objetos em uma estrutura hierárquica.

## Execução

Para executar o projeto, basta abrir na IDE e executar os testes unitários da classe `EstoqueTest`.

## Testes

O projeto possui testes unitários utilizando JUnit, verificando:

- A exibição do conteúdo do estoque;
- A exceção quando o estoque não possui conteúdo.

## Diagrama

O diagrama de classes UML está disponível na pasta `images`, com o nome `diagrama_composite.jpg`.

## Estrutura

- `ItemEstoque`: classe abstrata.
- `Estoque`: classe responsável pelo conteúdo principal.
- `Produto`: representa um produto individual.
- `Categoria`: representa um agrupamento de produtos e outras categorias.
- `EstoqueTest`: contém os testes unitários.

## Referência

Disciplina: Arquitetura e Projeto de Software.

Autora: Linda Freitas.
