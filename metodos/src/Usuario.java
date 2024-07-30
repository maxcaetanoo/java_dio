public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("A TV está ligada? " + smartTV.ligada);
        System.out.println("O canal atual é: " + smartTV.canal);
        System.out.println("O volume atual é: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Nova Ação - A TV está ligada? " + smartTV.ligada);

        smartTV.selecionarCanal(12);
        System.out.println("Nova Ação - O canal atual é: " + smartTV.canal);

        smartTV.proximoCanal();
        System.out.println("Nova Ação - O canal atual é: " + smartTV.canal);

        smartTV.canalAnterior();
        System.out.println("Nova Ação - O canal atual é: " + smartTV.canal);

        smartTV.desligar();
        System.out.println("Nova Ação - A TV está ligada? " + smartTV.ligada);
    }
}
