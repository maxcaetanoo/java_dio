public class Somar {
    public static void main(String[] args) {
        int numero1, numero2, numero3, soma;

        // recebendo os argumentos
        numero1 = Integer.parseInt(args[0]);
        numero2 = Integer.parseInt(args[1]);
        numero3 = Integer.parseInt(args[2]);

        // aqui efetuamos a soma do valores recebidos como argumentos
        soma = numero1 + numero2 + numero3;

        // e imprimimos na tela do usuário
        System.out.println("A soma equivale a: " + soma);
    }
}
