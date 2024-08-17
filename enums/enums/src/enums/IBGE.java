package enums;

public class IBGE {
	public static void main(String[] args) {
		for (EstadosBrasileiros estados: EstadosBrasileiros.values()) {
			System.out.println(estados.getIbge() +": " + estados.getSigla() + " - " + estados.getNome());
		}
		
		EstadosBrasileiros estado = EstadosBrasileiros.PERNAMBUCO;
		
		System.out.println("\n\nEu sou de " + estado.nomeMaiusculo());
	}
}
