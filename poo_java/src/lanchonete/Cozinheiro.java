package lanchonete;

public class Cozinheiro {
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
	
	public void prepararLanche() {
		System.out.println("Lanche tipo hamburguer sendo preparado...");
	}
	
	public void prepararSuco() {
		System.out.println("Suco de frutas frescas sendo preparado...");
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	
	public void separarIngredientesParaLanche() {
		System.out.println("Separando pão, carne, alface, tomate e molho especial");
	}
	
	public void separarIngredientesParaSuco() {
		System.out.println("Separando fruta fresca, água e açucar");
	}
	
	public void separarIngredientesParaCombo() {
		separarIngredientesParaLanche();
		separarIngredientesParaSuco();
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
		almocharife.pegarIngredientes();
	}
	
	public void pedirParaAdcionarLancheNoBalcao(Atendente atendente) {
		atendente.adcionarLancheNoBalcao();
	}

	public void pedirParaAdcionarBebidaNoBalcao(Atendente atendente) {
		atendente.adcionarBebidaNoBalcao();
	}

	public void pedirParaAdcionarComboNoBalcao(Atendente atendente) {
		atendente.adcionarLancheNoBalcao();
		atendente.adcionarBebidaNoBalcao();
	}
}
