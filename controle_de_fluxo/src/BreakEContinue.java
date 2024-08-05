public class BreakEContinue {
    public static void main(String[] args) {
        String jogos[] = { "Mortal Kombat", "Crash", "Mario", "Zelda", "Pokemon", "YU GI OH", "Clash Royal" };

        System.out.println("\nSegue abaixo uma lista dos jogos favoritos de Max: \n");

        for (String jogo : jogos) {
            if ("YU GI OH".equals(jogo)) {
                break; // caso o jogo seja YU GI OH o loop é encerrado
            } else if (!"Zelda".equals(jogo)) {
                System.out.println(jogo); // exibe todos os jogos exceto Zelda.
            } else {
                continue; // caso o jogo seja Zelda e não seja YU GI OH pula para o próximo loop.
            }
        }
    }
}
