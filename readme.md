# Challenge DIO

## 1º Challenge Simulação Bancária em Java

## Descrição

Este é um programa simples em Java para simular operações bancárias básicas. A aplicação permite ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

## Funcionamento

O programa exibe um menu com as seguintes opções:
- Depositar
- Sacar
- Consultar Saldo
- Encerrar

O usuário escolhe uma dessas opções digitando o número correspondente. Utilizando um switch, o programa realiza a operação escolhida pelo usuário conforme a descrição abaixo:

- Se o usuário escolher:
    - 1: O programa solicita o valor a ser depositado e atualiza o saldo.
    - 2: O programa solicita o valor a ser sacado e verifica se há saldo suficiente.
    - 3: O programa exibe o saldo atual da conta.
    - 0: O programa encerra.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas:

| Entrada           | Saída                                        |
|-------------------|----------------------------------------------|
| 1<br>50<br>2<br>100<br>0 | Saldo atual: 50.0<br>Saldo insuficiente.<br>Programa encerrado. |
| 3<br>1<br>550<br>0 | Saldo atual: 0.0<br>Saldo atual: 550.0<br>Programa encerrado. |
| 1<br>1000<br>2<br>500<br>0 | Saldo atual: 1000.0<br>Saldo atual: 500.0<br>Programa encerrado. |

----

## 2º Challenge Verificador de Número de Conta Bancária 

## Descrição

Este é um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

## Funcionamento

O programa solicitará ao usuário que digite o número da conta bancária. Em seguida, ele utilizará um bloco `try-catch` para verificar se o número da conta possui exatamente 8 dígitos. Se o número da conta tiver 8 dígitos, o programa informará que é um número válido. Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (`IllegalArgumentException`) e informará que o número da conta é inválido.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar o programa com esses exemplos e com outros casos possíveis.

| Entrada    | Saída                                      |
|------------|--------------------------------------------|
| 01020304   | Numero de conta valido.                     |
| 1234568    | Erro: Numero de conta invalido. Digite exatamente 8 digitos. |
| 3231       | Erro: Numero de conta invalido. Digite exatamente 8 digitos. |

## Execução

Para executar o programa, compile o arquivo Java `VerificadorNumeroConta.java` e execute-o. Você será solicitado a inserir o número da conta bancária e receberá a saída correspondente.

----

# 3º Chanllenge Verificador de Elegibilidade para Conta Bancária

## Descrição

Este é um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.

## Funcionamento

O programa solicitará ao usuário que digite sua idade. Utilizando apenas um bloco `if` e `else`, o programa verificará se a idade do cliente é igual ou superior a 18 anos. Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária. Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar o programa com esses exemplos e com outros casos possíveis.

| Entrada    | Saída                                      |
|------------|--------------------------------------------|
| 17         | Voce nao esta elegivel para criar uma conta bancaria. |
| 26         | Voce esta elegivel para criar uma conta bancaria. |
| 18         | Voce esta elegivel para criar uma conta bancaria. |

## Execução

Para executar o programa, compile o arquivo Java `VerificadorElegibilidadeConta.java` e execute-o. Você será solicitado a inserir a idade e receberá a saída correspondente.


# 4º Challenge Verificador de Limite de Cheque Especial

Este é um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial.

## Entrada

O programa solicita ao usuário que informe o saldo atual da conta bancária e o valor de um saque desejado.

## Saída

- Se o saque não ultrapassar o saldo disponível na conta, o programa informará que a transação foi realizada com sucesso.
- Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).
  - Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
  - Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.

## Exemplos

| Entrada | Saída |
|---------|-------|
| 1000<br>100 | Transação realizada com sucesso. |
| 2500<br>2750 | Transação realizada com sucesso utilizando o cheque especial. |
| 300<br>1500 | Transação não realizada. Limite do cheque especial excedido. |

Certifique-se de testar o programa com esses exemplos e com outros casos possíveis.

----