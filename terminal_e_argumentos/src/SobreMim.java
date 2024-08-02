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
