# Getters e Setters

Os ***Getters*** e ***Setters*** são responsaveis por retornar e atribuir valores respectivamente para uma classe assim mantendo os padrões de visibilidade do projeto como privados.

**Ex:**

	public class Aluno{
		private String nome;
		private int idade;
		
		public String getNome(){
			return nome;
		}
		
		public void setNome(String novoNome){
			nome = novoNome;
		}
		
		public int getIdade(){
			return idade;
		}
		
		public void setIdade(int novaIdade){
			idade = novaIdade;
		}
	}

Nesse bloco de código podemos ver uma classe com seus atributos privados de nome e idade, mas criamos o **getNome()** para podermos retornar o nome do objeto e **setNome()** para atribuir um valor ao nome do objeto construido, e fazemos o mesmo para a idade.
No nosso método *main* nós usamos os getters e setters para acessar indiretamente os atributos nome e idade da classe aluno.
