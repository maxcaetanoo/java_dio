package get_and_set.escola;

import get_and_set.escola.alunos.Aluno;

public class Escola {
	public static void main(String[] args) {
		Aluno novoAluno = new Aluno();
		
		novoAluno.setIdade(27);
		novoAluno.setNome("Max");
		
		cadastroDeAluno(novoAluno);
	}
	
	static void cadastroDeAluno(Aluno aluno) {
		System.out.println("Aluno "+ aluno.getNome() + " com idade " + aluno.getIdade() + " cadastrado com sucesso.");
	}
}
