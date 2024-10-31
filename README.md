# Controle de IPVA - Sistema de Consulta de Vencimento

Este projeto é um programa em Java desenvolvido para o escritório de Despachante Vale Card. O programa auxilia os clientes a consultar o mês de vencimento do IPVA de seus veículos com base no número final da placa. Esse sistema facilita a consulta e garante que os clientes estejam informados sobre o prazo de pagamento do IPVA.

## Funcionalidades

O programa realiza as seguintes operações:
1. Solicita ao cliente o número final da placa do veículo (0 a 9).
2. Informa o mês de vencimento do IPVA conforme tabela de prazos abaixo:
   - **Placa Final 1**: Pagamento até 30/04
   - **Placa Final 2**: Pagamento até 31/05
   - **Placa Final 3**: Pagamento até 30/06
   - **Placa Final 4**: Pagamento até 31/07
   - **Placa Final 5**: Pagamento até 31/08
   - **Placa Final 6**: Pagamento até 30/09
   - **Placa Final 7**: Pagamento até 31/10
   - **Placa Final 8**: Pagamento até 30/11
   - **Placa Final 9 ou 0**: Pagamento até 31/12
3. Exibe uma mensagem de erro caso o número final da placa esteja fora do intervalo de 0 a 9.

## Exemplo de Execução

```shell
Digite o numero final da placa do veiculo (0 a 9): 4
Pagamento do IPVA ate 31/07
```

Caso o valor seja inválido:
```shell
Digite o numero final da placa do veiculo (0 a 9): 11
Valor digitado esta incorreto. Digite um numero entre 0 e 9.
```

## Estrutura do Projeto

O projeto consiste em um único arquivo Java:

- **ControleIPVA.java**: Este arquivo contém toda a lógica do programa, desde a entrada do número final da placa até a exibição do prazo de pagamento ou mensagem de erro.

## Como Executar

1. Certifique-se de que o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) está instalado em seu ambiente.
2. Clone este repositório:

   ```shell
   git clone https://github.com/seu_usuario/ControleIPVA.git
   ```

3. Navegue até o diretório do projeto:

   ```shell
   cd ControleIPVA
   ```

4. Compile o arquivo Java:

   ```shell
   javac ControleIPVA.java
   ```

5. Execute o programa:

   ```shell
   java ControleIPVA
   ```

## Estrutura do Código

O código utiliza uma estrutura simples com um `switch` para verificar o número final da placa e definir o prazo de pagamento correspondente. Cada etapa do processo está comentada para facilitar a compreensão.

## Critérios de Avaliação

Este projeto atende aos seguintes critérios:
- **Organização do código**: código estruturado e comentado.
- **Uso de lógica condicional**: aplicação de `switch` para controlar a verificação do número final da placa.
- **Clareza e simplicidade**: fácil entendimento da lógica de consulta de vencimento.

## Autor

Desenvolvido por [@beatrisAS](https://github.com/beatrisAS).
