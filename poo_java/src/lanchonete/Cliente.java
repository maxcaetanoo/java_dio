package lanchonete;
import java.util.Random;

public class Cliente {
	public void fazerPedido(Atendente atendente, Cozinheiro cozinheiro, Almocharife almocharife) {
		Random random = new Random();
		int pedido = random.nextInt(3);
		atendente.anotarPedido(pedido, cozinheiro, almocharife);
	}
	
	public void efetuarPagamento(Atendente atendente) {
		atendente.receberPagamento();
	}
}
