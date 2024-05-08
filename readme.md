# Challenge DIO

## Simulação Bancária em Java

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

Certifique-se de testar o programa com esses exemplos e com outros casos possíveis.
