# Terminal e Argumentos

Nossos códigos em java nem sempre serão executados por uma __IDE__ e para que possam ser executados por um exemplo para nossos clientes de outras formas precisamos criar executaveis que serão executados nos seus dispositivos.

## Terminal

Para executarmos um arquivo java precisamos identificar seu respectivo diretório e confirmar se na pasta bin existe o arquivo compilado que teria o nome __<nome_da_classe>.class__.

Acessando o diretório:
> no linux      /home/seu_nome/nome_do_diretório/nome_do_projeto_java/bin
> no windows    C:\Users\Seu_Nome\Nome_do_diretório\Nome_do_projeto_java\bin

Verificando se existe o arquivo .class
> no linux      ls *.class
> no windows    dir*.class

Caso não existam arquivos compilados podemos executar o seginte comando para compilar
*Obs: Esse comando só irá funcionar corretamente caso esteja no diretório /bin*
> javac ../src/<nome_da_classe>.java -d .

Depois executamos o comando java
> java <nome_da_classe>

## Argumentos

Em uma classe java com o método *__main__* quando a executamos, a mesma nos permite passar um array do tipo string *[ ]* com argumentos.

__Ex:__
> java <nome_da_classe> *<argumento_1>* *<argumento_2>*

Supondo que a classe __Somar__ efetua uma soma entre 3 números podemos passar da seginte forma:
> java Somar 10 20 30

Mas para isso funcionar precisamos que nossa classe esteja construida da seguinte forma:

    public class Somar {
        public static void main(String[] args) {
            int numero1, numero2, numero3, soma;

            // recebendo os argumentos e convertendo para inteiros
            numero1 = Integer.valueOf(args[0]);
            numero2 = Integer.valueOf(args[1]);
            numero3 = Integer.valueOf(args[2]);

            // aqui efetuamos a soma do valores recebidos como argumentos
            soma = numero1 + numero2 + numero3;

            // e imprimimos na tela do usuário
            System.out.println("A soma equivale a: " + soma);
        }
    }

## Inputs (entrada de dados)

### Scaner

O Scaner no permite deixar nossas entradas de dados mais seguras evitando uma entrada com dados inadequados para a variavel.

__Ex:__

    import java.util.Locale;
    import java.util.Scanner;

    public class SobreMim {
        public static void main(String[] args) {
            // Criando objeto scanner para receber dados do usuário
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            mensagem(nome, sobreNome, idade, altura);
        }

        public static void mensagem(String nome, String sobreNome, int idade, double altura) {
            String nomeCompleto = nome + " " + sobreNome;
            System.out.println("Olá, me chamo " + nomeCompleto);
            System.out.println("Tenho " + idade + " anos de idade");
            System.out.println("E minha altura é " + altura + "m .");
        }
    }
