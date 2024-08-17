package constructors.empresa.funcionarios;

public class Funcionario {
	private String nome;
	private String funcao;
	private String CPF;
	private int idade;
	private int fone;
	
	// Construtor apenas para nome, função e CPF.
	public Funcionario(String nome, String funcao, String CPF) {
		this.nome = nome;
		this.funcao = funcao;
		this.CPF = CPF;
	}
	
	// Construtor apenas com o nome e a função para o caso de freelancer
	public Funcionario(String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}
	
	// Construtor sem parâmetros para caso seja necessário em algum local da aplicação
	public Funcionario() {
	}

	// Getters para todos os atributos.
	public String getNome() {
		return nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public String getCPF() {
		return CPF;
	}
	public int getIdade() {
		return idade;
	}
	public int getFone() {
		return fone;
	}
	
	// Setters para idade e fone que não são excenciais para o fuincionamento da classe e podem ser adcionados depois.
	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}
	public void setFone(int novoFone) {
		fone = novoFone;
	}

}
