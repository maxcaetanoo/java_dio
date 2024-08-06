
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        String nome = coletarDados("\nDigite seu nome: ", "String");
        String sobreNome = coletarDados("\nDigite seu sobrenome: ", "String");
        int idade = Integer.parseInt(coletarDados("\nDigite sua idade: ", "int"));
        double altura = Double.parseDouble(coletarDados("\nDigite sua altura: ", "double"));

        mensagemDeApresentacao(nome, sobreNome, idade, altura);
    }

    public static String coletarDados(String mensagem, String convercao) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(mensagem);
        String valor = null;

        switch (convercao) {
            case "double":
                try {
                    double convertido = scanner.nextDouble();
                    valor = String.valueOf(convertido);
                } catch (InputMismatchException excecao) {
                    System.out.println("\nO campo altura precisa ser numérico e conter (.) no lugar de (,)\n\n");
                }
                break;
            case "int":
                try {
                    int convertido = scanner.nextInt();
                    valor = String.valueOf(convertido);
                } catch (InputMismatchException excecao) {
                    System.out.println("\nO campo idade precisa ser numérico\n\n");
                }
                break;
            default:
                valor = scanner.next();
        }
        return valor;
    }

    private static void mensagemDeApresentacao(String nome, String sobreNome, int idade, double altura) {
        String nomeCompleto = nome + " " + sobreNome;
        System.out.println("\nOlá me chamo " + nomeCompleto + "\n" + "minha idade é " + idade + " anos\n" + "e tenho "
                + altura + "m de altura.");
    }
}
