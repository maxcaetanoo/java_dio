package lanchonete;
import java.util.concurrent.TimeUnit;

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
	
	public void prepararLanche(Almocharife almocharife) {
		System.out.println("Lanche tipo hamburguer sendo preparado...");
		pedirIngredientesParaHamburguer(almocharife);
		tempoLanche();
		lavarIngredientesLanche();
		tempoLanche();
		cortarIngredientesParaHamburguer();
		tempoLanche();
	}
	
	public void prepararSuco(Almocharife almocharife) {
		System.out.println("Suco de frutas frescas sendo preparado...");
		pedirIngredientesParaBebida(almocharife);
		tempoBebida();
		lavarIngredientesSuco();
		tempoBebida();
		cortarFrutasParaSuco();
		tempoBebida();
	}
	
	public void prepararCombo(Almocharife almocharife) {
		prepararLanche(almocharife);
		prepararSuco(almocharife);
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
	
	public void lavarIngredientesLanche() {
		System.out.println("Lavando tomates e alface");
	}
	
	public void lavarIngredientesSuco() {
		System.out.println("Lavando fruta freca");
	}
	
	public void fritarIngedienteParaHamburguer() {
		System.out.println("Fritando carne de Hamburguer");
	}
	
	public void cortarIngredientesParaHamburguer() {
		System.out.println("Cortando, tomate, pão e alface");
	}
	
	public void cortarFrutasParaSuco() {
		System.out.println("Cortando goiaba, abrindo maracujá");
	}
	
	public void pedirParaTrocarGas(Atendente atendente) {
		atendente.trocarGas();
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
