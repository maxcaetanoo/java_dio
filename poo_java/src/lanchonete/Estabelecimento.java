package lanchonete;

public class Estabelecimento{
	public static void main(String[] args) {
		Almocharife almocharife = new Almocharife();
		Atendente atendente = new Atendente();
		Cliente cliente = new Cliente();
		Cozinheiro cozinheiro = new Cozinheiro();
		
		almocharife.controlarEntradaDeAlimentos();
		cliente.fazerPedido(atendente, cozinheiro, almocharife);
	}

}
