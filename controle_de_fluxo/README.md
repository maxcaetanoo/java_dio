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

### Condições encadeadas

Podemos além do if e do else ter muito mais condições para comprar mais outras situações, por um exemplo caso a primeira condição não seja verdadeira testamos se a terceira condição é verdadeira, ou a querta para só então chegarmos no else onde todas eram falsas.
**Ex:**

    double media = 6.5;

    if (media < 7) //essa é a primeira condição a ser testada
        System.out.println("Aluno reprovado");
    else if (media >= 5) //essa é a condição que só é chamada se a primeira for falsa
        System.out.println("Aluno ficou em recuperação");
    else //essa é a ultima condição caso nada tenha sido verdadeiro
        System.out.println("Aluno aprovado");

### Condições ternarias encadeadas

Em operadores vimos a condição ternaria composta por *?:* agora temos também as condições ternarias encadeadas que comparam mais de uma condição.
**Ex:**

    double media = 6;

    String situação = media >=7 ? "Aprovado" : media >=5 ? "Recuperação" : "Reprovado";

Pode parecer um pouco confuso no inicio, mas essa condicional reduz bastante nossa codficação e nos trás o mesmo resultado de uma condicional encadeada como a que foi apresentada acima.

### Switch case

Além das estruturas condicionais apresentadas anteriormente temos também a *Switch* que executa blocos de código caso a variavel seja igual ao *case* e para evitar que mais algum bloco seja executado adcionamos o *break* para encerrar o bloco atual e sair do switch.
**Ex:**

    int opcao = 1;

    System.out.println("Caixa eletronico");
    System.out.println("1 - Depositar");
    System.out.println("2 - Sacar");
    System.out.println("3 - Sair");
    
    Switch (opcao){
        case 1:{
            System.out.println("Efetuando depósito");
            break;
        }
        case 2:{
            System.out.println("Efetuando saque");
            break;
        }
        case 3:{
            System.out.println("Efetuando encerrando");
            break;
        }
        default: {
            System.out.println("Opção não encontrada");
        }
    }

## Estruturas de repetição

Laços de repetição, loops ou estruturas de repetição como são nomeados, são comandos que permitem a iteração de blocos de código, permitindo assim a repetição do mesmo trecho de código sob determinadas condições.
**Os laços de repetição são representados pelas seguintes estruturas:**

* **For** *(para)*
* **While** *(enquanto)*
* **Do While** *(faça enquanto)*

### For

O comando **for** *(do português 'para')* permite que uma variável contadora seja testada e incrementada a cada iteração. O comando for recebe uma *variável contadora*, uma *condição* e o *valor de incremento*.
**Ex:**

    for ('blocoDeInicializacao', 'blocoDeCondicao', 'blocoDeIncremento'){
        //Bloco de código que será executado a cada loop até que a expressão se torne falsa.
    }

Também podemos usar o controle de fluxo **For** para percorrer *arrays* e *coleções*.
**Ex:**

    String jogos[] = { "Mortal Kombat", "Crash", "Mario", "Zelda", "Pokemon" };

    System.out.println("\nSegue abaixo uma lista enumerada dos jogos favoritos de Max: \n");
    
    for (int indice = 0; indice < jogos.length; indice++) {
        System.out.println(indice + 1 + " - " + jogos[indice]);
    }

***Obs: Em Arrays a contagem de elementos sempre inicia em 0.***

### For Each

O **For Each** é o tipo de interação totalmente direcionado aos elementos de *arrays* e *coleções*.
**Ex:**

    String jogos[] = { "Mortal Kombat", "Crash", "Mario", "Zelda", "Pokemon" };

    System.out.println("\nSegue abaixo uma lista dos jogos favoritos de Max: \n");
    
    for (String jogo : jogos) {
        System.out.println(jogo);
    }

Nesse exemplo conseguimos percorrer os objetos do array sem precisar identificar sus indices.

### Break e Continue

O **break** nos permite encerrar todas as iterações após sua execução e sair do loop, já o **continue** nos permite apenas pular para o proximo loop ignorando o loop atual.
**Ex:**

    String jogos[] = { "Mortal Kombat", "Crash", "Mario", "Zelda", "Pokemon", "YU GI OH", "Clash Royal" };

    System.out.println("\nSegue abaixo uma lista dos jogos favoritos de Max: \n");

    for (String jogo : jogos) {
        if ("YU GI OH".equals(jogo)) {
            break; // caso o jogo seja YU GI OH o loop é encerrado
        } else if (!"Zelda".equals(jogo)) {
            System.out.println(jogo); // exibe todos os jogos exceto Zelda.
        } else {
            continue; // caso o jogo seja Zelda e não seja YU GI OH pula para o próximo loop.
        }
    }

### While

O laço **While** *(do portugês 'enquanto')* executa blocos de código enquanto uma condição for verdadeira, caso a mesma já inicie falsa o laço While não será executado nenhuma vez.
É importante sempre lembrar de que a condição deve ser possivel de se tornar falsa, caso não acabaremos com um loop infinito.
**Ex:**

    while (condicaoBoleana) {
        //bloco de código
    }

**Ex:**

    import java.util.Locale;
    import java.util.Scanner;

    public class EnquantoEuQuiser {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            String opcao;
            int contador = 0;

            while (true) {
                contador++;
                System.out.println("O laço repetiu " + contador + "X");

                System.out.println("Deseja continuar? [S/N]");
                opcao = scanner.next();

                if (opcao.toUpperCase().equals("N")) {
                    break;
                }
            }
        }
    }

Esse loop irá continuar enquanto o usuário não responder "N".

### Do While

O **Do While** *(do Portugês 'faça enquanto')* executa um bloco de código e depois verifica se a condição foi verdadeira ou falsa caso seja falsa encerra com no mínimo uma execução diferentemente do **While** que ao ser falsa a condicional o bloco de código não será executado nenhuma vez.
**Ex:**

    do {
        //bloco de código
    } while (condicaoBoleana);

## Estruturas excepcionais

Ao executar um código em Java diversos tipos de erros podem acontecer, como erros relacionados à codificação, entradas erradas ou outros imprevistos.

Quando ocorre algum tipo de erro em Java o mesmo exibe uma mensagem de **Exceção** informando onde ocorreu o problema e o seu tipo.

No Java um erro é algo que quebra a aplicação e encerra a mesma, mas as exceções são normalmente erros de interpretação como uma divisão por 0 ou outros tipos que podem gerar um fluxo inesperado.

Nome|Causa|
---|---|
java.lang.NullPointerException|Quando tentamos obter alguma informação de uma variável nula.
java.lang.ArithmeticException | Quando tentamos dividir um valor por zero.
java.sql.SQLException | Quando existe algum erro, relacionado a interação com banco de dados.
java.io.FileNotFoundException | Quando tentamos ler ou escrever, em um arquivo que não existe.

**Tratamento de erros**

**Try** - Define um bloco de código que será testado quanto a erros em seu processo de execução.
**Catch** - Define um bloco de código a ser executado caso ocorra erro no bloco *Try*.
**Finally** - Define um bloco de código que será executado independentemente de uma exeção ter ou não acontecido.

### Execeções personalizadas

Também é possível criar exceções personalizadas apra facilitar o tratamento de erros.
**Ex:**

    plublic class ExcecaoPersonalizada extends Exception{
        //Essa seria a nossa exceção personalizada e poderia ser usada para casos específicos em trechos específicos de código para facilitar nossa correção.
    }

Basicamente as exceptions personalizadas são criadas como classes diferentes que extendem a classe ***Exception***.

*Obs: Também é possivel passar uma mensagem de erro personalizada em classes de erros já existentes.*
**Ex:**

    throw new IllegalArgumentException("Argumento incorreto.");
