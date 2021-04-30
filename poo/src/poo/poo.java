package poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import poo.classes.Disciplina;
import poo.classes.aluno;
import poo.constantes.StatusAluno;

public class poo {
	
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
		
		List<aluno> alunos = new ArrayList<aluno>();
		
		
		/*É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<aluno>> maps = new HashMap<String,List<aluno>>();
		for(int qtd = 1; qtd <= 5; qtd++) {
			
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + qtd +"?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de Nascimento ?");	
		String rg = JOptionPane.showInputDialog("Qual o número do RG ?");
		String cpf = JOptionPane.showInputDialog("Qual o número do CPF ?");	
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe ?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data de Matrícula ?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola ?");
		String serie = JOptionPane.showInputDialog("Qual a série matriculada ?");*/
		

		
		/* new aluno() é uma instância (Criação de Objeto)*/ 
		/* aluno1 é uma referencia para o objeto aluno*/
		aluno aluno1 = new aluno();/*Aqui será o João*/
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);*/
		
		for(int pos = 1; pos <= 1; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Qual é o Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual é a Nota da disciplina " + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) { /* Opção SIM e Zero*/
			
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;/*Soma + 1 */
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
				}
		/*System.out.println("----------------Aluno 1 --------------------------");
		System.out.println("Nome é - " + aluno1.getNome());
		System.out.println("Idade é - " + aluno1.getIdade());	
		System.out.println("Nascimento é - " + aluno1.getDataNascimento());
		System.out.println("Registro Geral é - " + aluno1.getRegistroGeral());
		System.out.println("CPF é - " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe é - " + aluno1.getNomeMae());	
		System.out.println("Nome do pai é - " + aluno1.getNomePai());
		System.out.println("Data da matrícula é - " + aluno1.getDataMatricula());
		System.out.println("Série Matriculada é - " + aluno1.getSerieMatriculado());
		System.out.println("Nome da escola é - " + aluno1.getNomeEscola());
		System.out.println("Média das notas é - " + aluno1.getMediaNota());
		System.out.println("Resultado - " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 - " + aluno1.getAlunoAprovado2());*/
		
			alunos.add(aluno1);
			
			maps.put(StatusAluno.APROVADO, new ArrayList<aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<aluno>());
		}
		for (aluno aluno : alunos) {/*Separei em Listas*/
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else 
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else 
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}	
		System.out.println("---------------------------------Lista dos Alunos Aprovados------------------------------------------------------");
		for (aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("Média = " + aluno.getMediaNota());
			
		}
		System.out.println("---------------------------------Lista dos Alunos em Recuperação------------------------------------------------------");
		for (aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("Média = " + aluno.getMediaNota());
			
		}
		System.out.println("---------------------------------Lista dos Alunos Reprovados------------------------------------------------------");
		for (aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("Média = " + aluno.getMediaNota());
			
		}
	}
  }
}
