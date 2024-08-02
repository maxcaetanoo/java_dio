
import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valorParaSaque, saldo, novoSaldo;
        String opcao = "S";
        saldo = 100.00;

        while (true) {
            if (saldo > 0) {
                System.out.print("Digite o valor que deseja sacar: ");
                valorParaSaque = scanner.nextDouble();

                novoSaldo = sacarValor(saldo, valorParaSaque);
                saldo = novoSaldo;

                System.out.println("Deseja continuar? [S/N]");
                opcao = scanner.next();

                if ("N".equals(opcao.toUpperCase())) {
                    break;
                }
            } else {
                break;
            }
        }
    }

    public static double sacarValor(double saldo, double valorParaSaque) {
        double novoSaldo = 0;

        if (saldo >= valorParaSaque) {
            novoSaldo = saldo - valorParaSaque;
            System.out.println("Valor " + valorParaSaque + " sacado com sucesso!");
            System.out.println("Saldo restante é de R$" + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente, seu saldo atual é de R$" + saldo);
            novoSaldo = saldo;
        }
        return novoSaldo;
    }
}
