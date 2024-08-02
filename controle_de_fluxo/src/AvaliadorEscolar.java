
import java.util.Locale;
import java.util.Scanner;

public class AvaliadorEscolar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            double nota1, nota2, nota3, media;
            String opcao;

            while (true) {
                System.out.print("Digite a primeira nota do aluno: ");
                nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota do aluno: ");
                nota2 = scanner.nextDouble();

                System.out.print("Digite a terceira nota do aluno: ");
                nota3 = scanner.nextDouble();

                media = (nota1 + nota2 + nota3) / 3;

                if (media >= 7)
                    System.out.println("Aluno aprovado com média " + media);
                else if (media >= 5)
                    System.out.println("Aluno ficou em recuperação com média " + media);
                else
                    System.err.println("Aluno reprovado com média " + media);

                System.out.println("Deseja verificar outro aluno? [S/N]");
                opcao = scanner.next();

                if ("N".equals(opcao.toUpperCase())) {
                    break;
                }
            }
        }
    }
}
