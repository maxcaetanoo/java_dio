import java.util.Locale;
import java.util.Scanner;

public class EnquantoEuQuiser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String opcao;
        int contador = 0;

        while (true) {
            contador++;
            System.out.println("O laço repetiu " + contador + "X");

            System.out.println("Deseja continuar? [S/N]");
            opcao = scanner.next();

            if (opcao.toUpperCase().equals("N")) {
                break;
            }
        }
    }
}
