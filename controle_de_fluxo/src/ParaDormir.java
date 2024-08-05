public class ParaDormir {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            String mensagem = carneirinhos == 1 ? carneirinhos + " Carneirinho"
                    : carneirinhos + " Carneirinhos";
            System.out.println(mensagem);
        }
        System.err.println("Zzzzzzz....");
    }
}
