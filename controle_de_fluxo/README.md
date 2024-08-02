# Controle de Fluxo

## Objetivos

Apresentar os controles de fluxo e seus diferenciais de implementação alem de explorar os seus tipos, condicional, excepcional e de repetição em uma aplicação Java.
**Assuntos abordados**

* Estruturas condicionais: *if-else* e *switch-case*
* Estruturas de repetição: *for*, *while* e *do-while*
* Estruturas de exceções: *try-catch-finally* e *throw*

**O que é controle de fluxo?**

É a habilidade de ajustar a maneira como um programa executas suas tarefas, por meio de comandos especiais essas tarefas podem ser executadas seletivamente, repetidamente ou excepicionalmente.

## Estruturas condicionais

A estrutura condicional possibilita a ecolha de um grupo de ações quando um determinado requisito é ou não atendido.
As estruturas condicionais podem ser **Simples** ou **Compostas**.

### Condicionais simples

As condicionais simples ocorrem quando temos apenas uma validação que caso seja positiva será executado um bloco de código.
**Ex:**

    double saldo = 25;
    double valoDeSaque = 10;

    //O bloco de código dentro do if só será executado caso a condição seja verdadeira
    if (saldo >= valorDeSaque) {
        novoSaldo = saldo - valorDeSaque;
        System.out.println("Valor " + valorDeSaque + " sacado com sucesso!");
        System.out.println("Saldo restante é de R$" + novoSaldo);
    }

    System.out.println("O saldo atual é de: " + saldo);

### Condicionais compostas

As condicionais compostas ocorrem quando temos duas validações ou mais, caso seja verdadeira será executado um bloco de código, caso não passa para o próximo bloco nomeado de *else* que só é executado se for falso.
**Ex:**

    double media = 6.5;

    if (media < 7)
        System.out.println("Aluno reprovado");
    else
        System.out.println("Aluno aprovado");

*Obs: Caso o bloco de código tenha mais de uma instrução é obrigatório o uso de chaves indicativas de inicio e fim do **if** ou **else***
