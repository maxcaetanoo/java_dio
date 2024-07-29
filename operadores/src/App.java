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
    }
}
