package lanchonete.atendimento.cozinha;
import java.util.concurrent.TimeUnit;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void tempoLanche() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void tempoBebida() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void prepararLanche(Almocharife almocharife, Atendente atendente, Cliente cliente) {
		System.out.println("Lanche tipo hamburguer sendo preparado...");
		pedirIngredientesParaHamburguer(almocharife);
		tempoLanche();
		lavarIngredientesLanche();
		tempoLanche();
		cortarIngredientesParaHamburguer();
		tempoLanche();
		fritarIngedienteParaHamburguer();
		tempoLanche();
		pedirParaPorHamburguerNoBalcao(atendente, cliente);
	}
	
	public void prepararSuco(Almocharife almocharife, Atendente atendente, Cliente cliente) {
		System.out.println("Suco de frutas frescas sendo preparado...");
		pedirIngredientesParaBebida(almocharife);
		tempoBebida();
		lavarIngredientesSuco();
		tempoBebida();
		cortarFrutasParaSuco();
		tempoBebida();
		pedirParaPorSucoNoBalcao(atendente, cliente);
	}
	
	public void prepararCombo(Almocharife almocharife, Atendente atendente, Cliente cliente) {
		prepararLanche(almocharife, atendente, cliente);
		prepararSuco(almocharife, atendente, cliente);
	}
	
	public void adcionarLancheNoBalcao() {
		System.out.println("Adcionando hamburguer simples no balcão");
	}

	public void adcionarBebidaNoBalcao() {
		System.out.println("Adcionando suco de fruta fresca no balcão");
	}

	public void adcionarComboNoBalcao() {
		adcionarLancheNoBalcao();
		adcionarBebidaNoBalcao();
	}
	
	private void lavarIngredientesLanche() {
		System.out.println("Lavando tomates e alface");
	}
	
	private void lavarIngredientesSuco() {
		System.out.println("Lavando fruta fresca");
	}
	
	private void fritarIngedienteParaHamburguer() {
		System.out.println("Fritando carne de Hamburguer");
	}
	
	private void cortarIngredientesParaHamburguer() {
		System.out.println("Cortando, tomate, pão e alface");
	}
	
	private void cortarFrutasParaSuco() {
		System.out.println("Cortando goiaba, abrindo maracujá");
	}
	
	public void pedirParaTrocarGas(Atendente atendente) {
		atendente.trocarGas();
	}
	
	public void pedirParaPorHamburguerNoBalcao(Atendente atendente, Cliente cliente) {
		atendente.adcionarLancheNoBalcao(cliente, atendente);
	}
	
	public void pedirParaPorSucoNoBalcao(Atendente atendente, Cliente cliente) {
		atendente.adcionarBebidaNoBalcao(cliente, atendente);
	}
	
	public void pedirParaTrocarGas(Almocharife almocharife) {
		almocharife.trocarGas();
	}
	
	public void pedirIngredientesParaHamburguer(Almocharife almocharife) {
		almocharife.pegarIngredientes(1);
	}
	
	public void pedirIngredientesParaBebida(Almocharife almocharife) {
		almocharife.pegarIngredientes(2);
	}
	
	public void pedirIngredientesParaCombo(Almocharife almocharife) {
		almocharife.pegarIngredientes(3);
	}
	
}
