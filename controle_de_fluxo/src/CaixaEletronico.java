
import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valorDeSaque, saldo, novoSaldo;
        String opcao = "S";
        saldo = 100.00;

        while (true) {
            if (saldo > 0) {
                System.out.print("Digite o valor que deseja sacar: ");
                valorDeSaque = scanner.nextDouble();

                novoSaldo = sacarValor(saldo, valorDeSaque);
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

    public static double sacarValor(double saldo, double valorDeSaque) {
        double novoSaldo = 0;

        if (saldo >= valorDeSaque) {
            novoSaldo = saldo - valorDeSaque;
            System.out.println("Valor " + valorDeSaque + " sacado com sucesso!");
            System.out.println("Saldo restante é de R$" + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente, seu saldo atual é de R$" + saldo);
            novoSaldo = saldo;
        }
        return novoSaldo;
    }
}
