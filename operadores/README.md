# operadores

## Assuntos

Projeto tem o intuito de abordar os operadores que são síbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.
__São eles:__

* Atribuição
* Aritméticos
* Unarios
* Relacionais
* Lógicos
* Ternários

## Atribuição

O operador de atribuição é representado pelo simbolo de igualdade _(=)_ e ele é responsavel por atribuir ou sobreescrever um valor a uma determinada variavel.

__Ex:__ String Hora_atual = "08:21"

## Aritméticos

Os operadores aritméticos são responsavesi por realizarem operações matematicas entre valores numéricos, e são eles:

* _(+)_ Adição
* _(-)_ Subtração
* _(*)_ Multiplicação
* _(/)_ Divisão
* _(%)_ Módulo

__Ex:__
    int soma = 23 + 12  //Isso equivale a 35
    double subtracao = 10 - 9.5 //Isso equivale a 0.5
    int multiplicacao = 11 * 2 //Isso equivale a 22
    int divisao = 12 / 3 //Isso equivale a 4
    int modulo = 18 % 3 //Isso equivale a resto 0

_Obs: O operador __+__ quando usado em strings realizará a concatenação de strings_
__Ex:__ String nomeCompleto = "Humberto" + " Antonio"

## Unários

O operadores unários sãu usados em conjunto com operadores aritméticos e tem como objetivo realizar operações básicas como incrementar, decrementar e ou inverter valores numéricos e boleanos.

* _(+)_ Positivo, inverte valores negativos para positivos.
* _(-)_ Negativo, inverte valores positivos para negativos.
* _(++)_ Incremento, incrementa mais uma unidade ao valor.
* _(--)_ Decremento, decrementa mais uma unidade ao valor.
* _(!)_ Negação, nega o valor da expreção booleana.

_Obs: Incremento ou decremento podem ser efetuados previamente ou posteriormente de acordo com a posição dos sinais __(++)__ ou __(--)__._
__Ex:__
    int numero = 5;
    System.out.println(++numero); // Previo, incrementa mais 1 antes de executar o print
    System.out.println(numero++); // Posterior, realiza o incremento após executar o print
    System.out.println(numero); // Como podemos ver o posterior so foi apresentado aqui.
