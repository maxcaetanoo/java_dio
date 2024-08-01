# Java Documentation

## Objetivos

O objetivo é apresnetar mais sobre a documentação em Java e explorar como adcionar comentários em nosso arquivos.
Os assuntos são:

* Documentação oficial da linguagem
* Tags
* Tipos de comnetários
* JavaDoc

### Documentação oficial

Uma das principais características da linguagem java desde seu surgimento foi sua rica documentação, conforme site oficial podemos compreender e explorar os recursos organizados por classes e pacotes bem especificos sem nem mesmo escrever uma linha de código pois.

### Tags

A documentação java é composta por tags que representam dados relevantes apra a compreenção da proposta de uma classe e o conjunto de seus métodos e atributos.

___Tag___ | ___Descrição___|
---| ---|
@autor | Autor/Criador.|
@version | Versão do recurso disponibilizado.|
@since | Versão/Data de inicio da disponibilização do recurso. |
@param | Descrição dos parâmetros dos métodos criados. |
@return | Definição do tipo de retorno de um método. |
@throws | De o método lança algum tipo de exceção. |

### Tipos de comentários

* Linha única
    > //comentários simples de uma linha começam com as barras duplas.
* Mutiplas linhas
    > /*os comentarios de multiplas linhas começam por barra + arterisco
      *continuam a partir dos próximos asteriscos
      *e se encerram com asterisco + barra.
      */
* Documentação
    > /**Ja a documentação começa por barra + dois asteriscos
      *continua igual comentários de múltiplas linhas
      *e pode conter tags como @autor nome_do_autor
      *encerrando igual os comentários de múltiplas linhas
      */

### JavaDoc

O JavaDoc é um gerador de docuemntação criado pela __Sun Microsistems__ para documentar a __API__ dos programas em __Java__ a partir do código-fonte. O resultado é expresso em __HTML__.

Para usar o JavaDoc basta digitar em seu terminal:
> javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d <../diretório> src/*.java
