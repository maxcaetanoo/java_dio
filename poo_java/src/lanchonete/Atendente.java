package lanchonete;

public class Atendente {
	public void anotarPedido() {
		System.out.println("Anotando pedido do cliente");		
	}
	
	public void pedirParaPrepararLanche(Cozinheiro cozinheiro) {
		cozinheiro.prepararLanche();
	}
	
	public void pedirParaPrepararBebida(Cozinheiro cozinheiro) {
		cozinheiro.prepararSuco();
	}
	
	public void pedirParaPrepararCombo(Cozinheiro cozinheiro) {
		cozinheiro.prepararCombo();
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
