package lanchonete.area.cliente;
import java.util.Random;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almocharife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Cliente {
	public void fazerPedido(Atendente atendente, Cozinheiro cozinheiro, Almocharife almocharife, Cliente cliente) {
		Random random = new Random();
		int pedido = random.nextInt(3);
		atendente.anotarPedido(pedido, atendente, cozinheiro, almocharife, cliente);
	}
	
	public void receberPedido() {
		System.out.println("Recebendo pedido no balcão");
		
	}
	
	public void efetuarPagamento(Atendente atendente) {
		atendente.receberPagamento();
	}
}
