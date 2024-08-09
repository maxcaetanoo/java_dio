package lanchonete;

public class Cozinheiro {
	// metodo publico
	public void adcionarLancheNoBalcao() {
		System.out.println("Adcionando hamburguer simples no balcão");
	}
	
	//metodo publico
	public void adcionarBebidaNoBalcao() {
		System.out.println("Adcionando suco de fruta fresca no balcão");
	}
	
	//metodo publico
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
}
