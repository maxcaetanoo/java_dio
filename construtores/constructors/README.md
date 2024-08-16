# Construtores

Construtores são uma forma de garantirmos que as caracteristicas excenciais de uma classe sejam inseridas logo assim que a mesma for criada.
Podemos por um exemplo pensar em uma classe que vai cadastrar um funcionário, mas o que seria necessário para que tenhamos um funcionario cadastrado?

Consigo pensar em 3 características excenciais:

**Nome**
**Função**
**CPF**

Tendo isso me mente precisamos que ao criar um novo funcionário tenhamos o seu nome, cpf e função definidos no cadastro para evitarmos que o funcionário seja mandado para uma função diferente.

Mas para que possamos fazer isso, temos que ter algumas regrinhas em mente.

Para criarmos um construtor precisamos definir um metodo que tenha exatamente o mesmo nome da classe e precisamos passar apenas o que seria excencial nada além disso.
**Ex:**

	class Funcionario{
		private String nome;
		private String funcao;
		private String CPF;
		private String email;		
		private int idade;
		
		public Funcionario(String nome, String funcao, String CPF){
			this.nome = nome;
			this.funcao = funcao;
			this.CPF = CPF;
		}
		
		//Codigo não relevante no momento, mas se trata de getters e setters.
	}