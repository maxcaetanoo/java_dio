package lanchonete.atendimento;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almocharife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Atendente {
	public void anotarPedido(int pedido, Atendente atendente, Cozinheiro cozinheiro, Almocharife almocharife, Cliente cliente) {
		if (pedido == 3) {
			System.out.println("Anotando pedido do cliente");
			pedirParaPrepararCombo(atendente, cozinheiro, almocharife, cliente);
		} else if (pedido == 2) {
			System.out.println("Anotando pedido do cliente");
			pedirParaPrepararBebida(atendente, cozinheiro, almocharife, cliente);
		} else {
			System.out.println("Anotando pedido do cliente");
			pedirParaPrepararLanche(atendente, cozinheiro, almocharife, cliente);
		}
	}
	
	public void pedirParaPrepararLanche(Atendente atendente, Cozinheiro cozinheiro, Almocharife almocharife, Cliente cliente) {
		cozinheiro.prepararLanche(almocharife, atendente, cliente);
	}
	
	public void pedirParaPrepararBebida(Atendente atendente, Cozinheiro cozinheiro, Almocharife almocharife, Cliente cliente) {
		cozinheiro.prepararSuco(almocharife, atendente, cliente);
	}
	
	public void pedirParaPrepararCombo(Atendente atendente, Cozinheiro cozinheiro, Almocharife almocharife, Cliente cliente) {
		cozinheiro.prepararCombo(almocharife, atendente, cliente);
	}

	public void trocarGas() {
		System.out.println("Atendente trocando o gás\n\n");		
	}

	public void adcionarLancheNoBalcao(Cliente cliente, Atendente atendente) {
		System.out.println("Adcionando hamburguer simples no balcão");
		cliente.efetuarPagamento(atendente);
	}

	public void adcionarBebidaNoBalcao(Cliente cliente, Atendente atendente) {
		System.out.println("Adcionando suco de fruta fresca no balcão");
		cliente.efetuarPagamento(atendente);
	}

	public void receberPagamento() {
		System.out.println("Recebendo pagamento e efetuando conferencia do valor.\n");		
	}

}
