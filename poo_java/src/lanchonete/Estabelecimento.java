package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almocharife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento{
	public static void main(String[] args) {
		Almocharife almocharife = new Almocharife();
		Atendente atendente = new Atendente();
		Cliente cliente = new Cliente();
		Cozinheiro cozinheiro = new Cozinheiro();
		
		almocharife.iniciarControleDeEntradas();
		cliente.fazerPedido(atendente, cozinheiro, almocharife, cliente);
		cozinheiro.pedirParaTrocarGas(almocharife);
		cliente.fazerPedido(atendente, cozinheiro, almocharife, cliente);
		cliente.fazerPedido(atendente, cozinheiro, almocharife, cliente);
		cozinheiro.pedirParaTrocarGas(atendente);		
		cliente.fazerPedido(atendente, cozinheiro, almocharife, cliente);
	}

}
