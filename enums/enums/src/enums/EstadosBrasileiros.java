package enums;

public enum EstadosBrasileiros {
	ALAGOAS("AL", "Alagoas", 27),
	BAHIA("BA", "Bahia", 29),
	CEARA("CE", "Ceará", 23),
	PARAIBA("PB", "Paraíba", 25),
	PERNAMBUCO("PE", "Pernambuco", 26);
	
	private String sigla;
	private String nome;
	private int ibge;
	
	private EstadosBrasileiros(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public int getIbge() {
		return ibge;
	}
	
	public String nomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
