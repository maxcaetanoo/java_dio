# projeto sobre típos e variáveis

## Típos

Projeto tem o intuito de abordar os tipos no java e como podem ser atribuídos nas variáveis para o recebimento de valores

__No java existem 8 tipos primitivos que são:__

    int, byte, short, long, float, double, boolean e char - Os tipos não são considerados objetos e por isso representam valores brutos.

    Eles se encontram armazenados na pilha de memoria. (Memory stack)

_Tabela de tipos primitivos inteiros:_

tipo | memoria | valor minimo | valor máximo |
---|---|---|---|
byte| 1 byte | -128| 127
short| 2 bytes | -32.768 | 32.767
int | 4 bytes | -2.147.483.648| 2.147.483.647
long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807

_Tabela de tipos primitivos com ponto flutuante:_

tipo | memoria | valor minimo | valor máximo | precisão|
---|---|---|---|---|
float| 4 byte | -3,4028E + 38| 3,4028E + 38 | 6 – 7 dígitos
double| 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos

__Obs:__ O tipo float deve ser valorado sempre com a letra "F" ao final e o long com a letra "L", exemplo:

    float pi = 3.14F;
    long cpf = 98765432109L;

## Variáveis

_A declaração de variáveis é feita a partir de sua estrutura padrão:_

    <Tipo> <nomeVariavel> = <atribuicaoDeValorOpcional>;

A linguagem Java é altamente tipada e alterações de tipos devem ser feitas com muita cautela já que os valores podem ultrapassar o valor permitido do tipo e com isso podemos gerar erros no código.

__Obs:__ A própria linguagem nos informa quando tentamos atribuir uma variavel de possivel valor maior do que o permitido pelo tipo selecionado como seria o caso de um _byte_ recebendo um _int_, o byte não poderia conter o valor de um int já que o mesmo suporta valores de -2.147.483.648 até 2.147.483.647 e o byte apenas valores de -128 até 127.

## Constantes

_A declaração de constantes é feita a partir de sua estrutura padrão:_

    final <Tipo> <NOME_CONSTANTE> = <atribuicaoDeValorObrigatoria>;

É importante resaltar que sempre é necessário declarar a constante em caixa alta para respeitar a convenção.
