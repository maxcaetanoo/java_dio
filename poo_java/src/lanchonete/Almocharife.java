package lanchonete;

public class Almocharife {
	
	public void controlarEntradaDeAlimentos() {
		System.out.println("Anotar recebimento de alimentos para o estoque.");
	}
	
	public void controlarSaidaDeAlimentos() {
		System.out.println("Anotar alimentos retirados para uso.");
	}

	public void trocarGas() {
		System.out.println("Trocando o gas.");		
	}

	public void pegarIngredientes(int ingredientes) {
		String suco = "Suco = Maracujá, goiaba";
		String hamburguer = "Hamburguer = Pão, carne, alface, tomate, molho especial";
		
		if (ingredientes == 3) {
			System.out.println("Separando ingredientes para combo");
			System.out.println(hamburguer +"\n" + suco);
		} else if (ingredientes == 2) {
			System.out.println("Separando ingredientes para hamburguer");
			System.out.println(hamburguer);
		} else {
			System.out.println("Separando ingredientes para suco");
			System.out.println(suco);
		}
	}
}
