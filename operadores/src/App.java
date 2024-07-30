public class App {
    public static void main(String[] args) throws Exception {
        // Concatenação
        String nomeCompleto = "Max" + "Caetano";
        System.out.println(nomeCompleto);

        // Inversão de valores
        int numero = 5;
        System.out.println(-numero); // Valor invertido
        System.out.println(numero); // Valor ainda continua o mesmo de antes da inversão caso não seja ramazenado em
                                    // uma variavel

        // Incremento previo e posterior
        System.out.println(++numero); // Previo, incrementa mais 1 antes de executar o print
        System.out.println(numero++); // Posterior, realiza o incremento após executar o print
        System.out.println(numero); // Como podemos ver o posterior so foi apresentado aqui.

        // Inversão de valores
        boolean ehVerdade = true;

        System.out.println(!ehVerdade); // Mesmo o valor sendo true aqui será apresentado como false pois ele foi
                                        // invertido. durante a exibição

        // Ternários
        int nota = 7;
        String aprovacao = nota >= 7 ? "Aprovado" : "Reprovado"; // testa se a nota é maior ou igual a 7 caso sim
                                                                 // aprovado caso não reprovado
        System.out.println(aprovacao);

        // Relacionais
        int numeroUm = 20;
        int numeroDois = 12;

        boolean relacionamento = numeroUm == numeroDois;
        System.out.println("O primeiro numero é igual ao segundo? " + relacionamento);

        relacionamento = numeroUm != numeroDois;
        System.out.println("O primeiro numero é diferente do segundo? " + relacionamento);

        relacionamento = numeroUm > numeroDois;
        System.out.println("O primeiro numero é maior que o segundo? " + relacionamento);

        relacionamento = numeroUm < numeroDois;
        System.out.println("O primeiro numero é menor que o segundo? " + relacionamento);

        // Lógicos
        boolean val1 = true;
        boolean val2 = false;

        if (val1 && val2) {
            System.out.println("É verdadeiro"); // Essa condição só é exibida se ambos forem true.
        } else {
            System.out.println("É falso"); // Essa condição é exibida caso algum ou ambos não sejam true.
        }
    }
}
