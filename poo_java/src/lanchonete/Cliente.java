package lanchonete;

public class Cliente {
	public void fazerPedido(Atendente atendente) {
		atendente.anotarPedido();
	}
	
	public void efetuarPagamento(Atendente atendente) {
		atendente.receberPagamento();
	}
}
