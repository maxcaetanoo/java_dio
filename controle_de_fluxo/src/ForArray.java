public class ForArray {
    public static void main(String[] args) {
        String jogos[] = { "Mortal Kombat", "Crash", "Mario", "Zelda", "Pokemon" };

        System.out.println("\nSegue abaixo uma lista enumerada dos jogos favoritos de Max: \n");
        for (int indice = 0; indice < jogos.length; indice++) {
            System.out.println(indice + 1 + " - " + jogos[indice]);
        }
    }
}
