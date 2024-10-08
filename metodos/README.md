# Métodos

## Assuntos

Os asuntos sobre metodos se baseiam na resposta das seguintes perguntas:

* Qual a proposta principal do método?
* Qual o retorno esperado ao executar um método?
* Quais os parâmetros necessários para a execução de um método?
* Os métodos podem apresentar exceções?
* Qual a visibilidade do método?

_Mas o que seria um metodo?_
Todas as ações das aplicações são consideradas como métodos.

    Como já vimos anteriormenete uma Classe é definida por atributos e métodos.
    Os atributos são em sua grande maioria Variáveis dos mais diversos típos.
    Já os métodos correspondem a Funções e Sub-rotinas disponiveis dentro da classe.

__Vamos usar como exemplo um carro__

O seus atributos seriam:

* Modelo;
* Cor;
* Ano de fabricação;
* Kilometragem;

E seus métodos seriam:

* Acelerar;
* Freiar;

__Convenções para a criação de métodos__

1. Devem ser nomeados com verbos.
_ex: pular, correr, voltar_
2. Devem ser nomeados com padrão camelCase.
_ex: subirEscadas, rolarNoChao, voltarParaNivelAnterior._

__Ex:__

    public int somar (int numero1, int numero2) {
        resultado = numero1 + numero2;
    }

_Obs: Os métodos só podem tem uma responsabilidade, caso tenham mais de uma será necessário refatorar, e não existem métodos __Globais__ em Java, os métodos devem ser definidos para uso na classe em que foram definidos._

__Como sabemos a melhor forma de definir métodos?__
Para definirmos métodos basta seguir a convenção abaixo:

* __Qual a proposta do método?__ Ao responder essa pergunta será possivel definir o método.
* __Qual o tipo de retorno esperado ao executar o método?__ Ao responder essa pergunta você será capaz de definir se o metodo terá ou não algum tipo de retorno.

_Obs: Caso o método não retorne nenhum valor ele deve ser representado pela palava-chave __void__._

__Os metodos podem necessitar de parâmetros para o funcionamento adequado__
Os parâmetros sempre ficam contidos entre parênteses '( )' e servem para passar valores externos para dentro dos métodos.

__Os metodos costuman apresentar exceções__
Talvez seja necessário prevêr e tratar possiveis exceções de um método para que não venha apresentar problemas no funcionamento do programa.

__Os metodos podem ser visiveis em vários ambitos__
Podendo ser visivel em todo o programa, através de pacotes, herança ou apenas dentro do contexto da classe.
