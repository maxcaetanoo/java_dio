package lanchonete.atendimento.cozinha;

public class Almocharife {
	
	private void controlarEntradaDeAlimentos() {
		String frutas = "5 caixas de frutas";
		String verduras = "10 caixas de verduras";
		String carnes = "100 unidades de carne de hamburguer";
		String molhos = "1 caixa de molhos especiais";
		
		System.out.println("Anotar recebimento de alimentos para o estoque.");
		System.out.println(frutas +"\n"+ verduras +"\n"+ carnes +"\n"+ molhos+"\n\n");
	}
	
	private void controlarSaidaDeAlimentos() {
		System.out.println("Anotar alimentos retirados para uso.");
	}

	void trocarGas() {
		System.out.println("Almocharife trocando o gas.\n\n");		
	}

	void pegarIngredientes(int ingredientes) {
		String suco = "Suco = Maracujá, goiaba";
		String hamburguer = "Hamburguer = Pão, carne, alface, tomate, molho especial";
		
		if (ingredientes == 3) {
			controlarSaidaDeAlimentos();
			System.out.println("Separando ingredientes para combo");
			System.out.println(hamburguer +"\n" + suco);
		} else if (ingredientes == 2) {
			controlarSaidaDeAlimentos();
			System.out.println("Separando ingredientes para suco");
			System.out.println(suco);
		} else {
			controlarSaidaDeAlimentos();
			System.out.println("Separando ingredientes para hamburguer");
			System.out.println(hamburguer);
		}
	}

	public void iniciarControleDeEntradas() {
		System.out.println("Iniciando controle de entradas.");
		controlarEntradaDeAlimentos();	
	}
}
