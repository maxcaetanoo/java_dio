package lanchonete;

public class Atendente {
	public void anotarPedido(int pedido, Cozinheiro cozinheiro, Almocharife almocharife) {
		if (pedido == 3) {
			System.out.println("Anotando pedido do cliente");
			pedirParaPrepararCombo(cozinheiro, almocharife);
		} else if (pedido == 2) {
			System.out.println("Anotando pedido do cliente");
			pedirParaPrepararBebida(cozinheiro, almocharife);
		} else {
			System.out.println("Anotando pedido do cliente");
			pedirParaPrepararLanche(cozinheiro, almocharife);
		}
	}
	
	public void pedirParaPrepararLanche(Cozinheiro cozinheiro, Almocharife almocharife) {
		cozinheiro.prepararLanche(almocharife);
	}
	
	public void pedirParaPrepararBebida(Cozinheiro cozinheiro, Almocharife almocharife) {
		cozinheiro.prepararSuco(almocharife);
	}
	
	public void pedirParaPrepararCombo(Cozinheiro cozinheiro, Almocharife almocharife) {
		cozinheiro.prepararCombo(almocharife);
	}

	public void trocarGas() {
		System.out.println("Trocando o gás");		
	}

	public void adcionarLancheNoBalcao() {
		System.out.println("Adcionando hamburguer simples no balcão");		
	}

	public void adcionarBebidaNoBalcao() {
		System.out.println("Adcionando suco de fruta fresca no balcão");		
	}

	public void receberPagamento() {
		System.out.println("Recebendo pagamento e efetuando conferencia do valor.");		
	}

}
