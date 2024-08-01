# Palavras Reservadas em Java

## Assunto

As palavras reservadas em java são no total 52 inclunido tipos primitivos e todas iniciam em letra minuscula sendo identificadas por cores diferentes em maior parte das IDEs.

__Segue abaixo a lista das palavras reservadas de acordo com suas finalidades__

___

### Controle de pacotes

|__Nome__| __Finalidade__|
|---|---|
|__import__ |Importa pacotes ou classes para dentro de um código.|
|__package__ | Especifica a que pacote todas as classes de uma arquivo pertencem. |

___

### Modificadores de acesso

|__Nome__| __Finalidade__|
|---|---|
|__public__ | Especifica o acesso apra qualquer classe.|
|__private__ | Especifica o acesso apenas para a classe onvo foi criado.|
|__protected__| Especifica o acesso por classes no mesmo pacote ou sub classes.|

___

### Tipos primitivos

|__Nome__| __Finalidade__|
|---|---|
|__boolean__ | Define o tipo de uma variavel para receber valores como verdadeiro ou falso. |
|__byte__ | Define o tipo de uma variavel para receber valores inteiros de 8 bits. |
|__char__ | Define o tipod e uma variavel para receber valores tipo caracter unicode de 16 bits.|
|__double__ | Define o tipo de uma variavel para receber valores ponto flutuante de 64 bits. |
|__float__ | Define o tipo de uma variavel para receber valores ponto flutuante de 32 bits. |
|__int__ | Define o tipo de uma variavel para receber valores inteiros de 32 bits. |
|__long__ | Define o tipo de uma variavel para receber valores inteiros de 64 bits. |
|__short__ | Define o tipo de uma variavel para receber valores inteiros de 32 bits. |
|__void__ | Define que um método não tem retorno de valor. |

___

### Modificadores de variáveis, classes ou métodos

|__Nome__| __Finalidade__|
|---|---|
|__abstract__ | Define classe que não pode ser instanciada ou método que precisa ser implementado por uma sub classe não abstrata. |
|__class__ | Define uma classe. |
|__extends__ | Define a extenção de uma superclass por uma subclass.|
|__final__ | Impossibilita uma classe de ser extendida, um método ser reescrito ou uma variavel de ser reinicializada. |
|__implements__ | Indica as interfaces que uma classe irá implementar. |
|__interface__ | Especifica uma interface. |
|__native__ | Indica que um método está escrito eum uma linguagem dependente de plataforma como o _C_. |
|__new__ | Cria uma nova instancia de objeto chamando seu construtor. |
|__static__ | Faz um método ou variavel pertencer a uma classe ao inves de às instâncias. |
|__strictfp__ | Usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante para todas as expressões. |
|__syncronized__ | Indica que um método só pode ser acessado por uma thread de cada vez. |
|__transient__ | Impede a serialização de campos. |
|__volatile__ | Indica que uma variável pode ser alterada durante o uso de threads. |

___

### Controle de fluxo dentro de um bloco de código

|__Nome__| __Finalidade__|
|---|---|
|__break__ | Encerra o bloco de código sem passar pelos próximos passos da sequência. |
|__case__ | Executo um bloco de código dependendo do teste do switch. |
|__continue__ | Pula a execução do código que viria logo após essa linha e vai apra a próxima passagem do loop. |
|__default__ | Executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro. |
|__do__ | Executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente. |
|__else__ | Executa um bloco de código alternativo caso o teste "if" seja falso. |
|__for__ | Usado para realizar um loop condicional de um bloco de código.|
|__if__ | Usado para realizar um teste lógico de verdadeiro ou falso. |
|__instanceof__ | Determina se um objeto é uma instância de determinada classe, superclasse ou interface. |
|__return__ | Retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável). |
|__switch__ | Indica a variável a ser comparada nas expressões case. |
|__while__ | Executa um bloco de código repetidamente enquanto a condição for verdadeira. |

___

### Tratamento de erros

|__Nome__| __Finalidade__|
|---|---|
|__assert__ | Testa uma expressão condicional, para verificar uma suposição do programador. |
|__catch__ | Declara o bloco de código usado para tratar uma exceção. |
|__finally__ | Bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção. |
|__throw__ | Usado para passar uma exceção para o método que o chamou. |
|__throws__ | Indica que um método pode passar uma exceção para o método que o chamou. |
|__try__ | Bloco de código que tentará ser executado, mas que pode causar uma exceção. |

___

### Variáveis de referência

|__Nome__| __Finalidade__|
|---|---|
|__super__ | Refere-se a superclasse imediata. |
|__this__ | Refere-se a instância atual do objeto. |

___

### Palavras reservadas não utilizadas

|__Nome__| __Finalidade__|
|---|---|
|__const__ | Não utilize para declarar constantes, use public static final. |
|__goto__ | Não implementada na linguagem Java, por ser considerada prejudicial. |
