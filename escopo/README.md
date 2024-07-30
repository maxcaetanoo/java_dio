# Escopo de projeto Java

## Sobre o Escopo

O Escopo de um projeto refere-se à localização mais adequada para a criação de nossos algoritmos.
Os tipos de escopo são:

* Escopo de classe
* Escopo de método
* Escopo de fluxo

_Obs: O escopo pode ser entendido como onde uma determinada variavel pode ser acessada_
Em java o escopo de variaveis vai de acordo com o bloco onde ela foi declarada.

__Como funciona isso?__
Uma variável é criada no seu primeiro acesso, se tornando inacessivel após o interpretador sair do bloco de execução ao qual ela pertence.

Caso uma variavel seja criada dentro do escopo de um _método_ ela só poderá ser acessada através desse método e ficará isolada do restante da classe.
