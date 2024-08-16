package constructors.empresa;

import constructors.empresa.funcionarios.Funcionario;

public class Empresa {
	public static void main(String[] args) {
		// Cadastrando o novo funcionario já com o seu respectivo nome, funcao e CPF.
		Funcionario jose = new Funcionario("José", "Porteiro", "01234567890");
		
		System.out.println("Cadastro de funcionario: " + jose.getNome() + "\nFunção: " + jose.getFuncao() + "\nCPF: " + jose.getCPF() + "\n\n\n");
		
		// Adcionando o restante dos atributos do fuincionário José.
		jose.setIdade(34);
		jose.setFone(99999999);
		
		
		System.out.println("Cadastro de funcionario: " + jose.getNome() + "\nFunção: " + jose.getFuncao() + "\nCPF: " + jose.getCPF() +"\nIdade: " + jose.getIdade() + "\nFone: " + jose.getFone());
		
	}
}
