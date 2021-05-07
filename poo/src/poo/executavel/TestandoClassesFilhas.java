package poo.executavel;

import poo.classes.Diretor;
import poo.classes.Secretario;
import poo.classes.aluno;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		aluno aluno = new aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("456456456456");
		diretor.setNome("Egídio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("456452123278");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário é = " + aluno.salario());
		System.out.println("Salário é = " + diretor.salario());
		System.out.println("Salário é = " + secretario.salario());
		
	}
}
