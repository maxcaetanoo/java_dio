# Enum

É um tipo de classe especial onde os seus objetos são previamente criados e imutaveis, e além disso estarão disponiveis para toda a aplicação
São exemplos de Enums
**Ex:**

**Grau de Escolaridade:** Fundamental, Médio, Superior.
**Estado Civil:** Solteiro, Casado, Divorciado, Viuvo.

Vamos pensar em uma classe com os graus de escolaridade

	public enum Escolaridade{
		// Objetos já predefinidos
		FUNDAMENTAL1("Anos iniciais", "1 ao 5"),
		FUNDAMENTAL2("Anos finais", "6 ao 9"),
		MEDIO("Unico", "1º ao 3º grau"),
		SUPERIOR("Unico", "1º ao 8º semestres")
		
		// Métodos da classe
		private String classificacao;
		private String periodos;
		
		// Construtor privado da classe
		private Escolaridade(String classificacao, String periodos){
			this.classificacao = classificacao;
			this.periodos = periodos;
		}
		
		// Getters
	}