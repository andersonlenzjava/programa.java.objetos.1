package curso.java.objetos.one;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClassePrincipal {

	public static void main(String[] args) {

		/* Criação de um objeto na memória com o endereço dentro da variável aluno1 */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno 1");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento");
		String cpf = JOptionPane.showInputDialog("Qual o numero do CPF");

		String disciplina1 = JOptionPane.showInputDialog("Qual o nome da disciplina 1");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1");
		String disciplina2 = JOptionPane.showInputDialog("Qual o nome da disciplina 2");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2");
		String disciplina3 = JOptionPane.showInputDialog("Qual o nome da disciplina 3");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3");
		String disciplina4 = JOptionPane.showInputDialog("Qual o nome da disciplina 4");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroCpf(cpf);
		aluno1.setDataMatricula("03/09/1992");

		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
//		aluno1.setNota4(Double.parseDouble(nota4));

		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);

		Aluno aluno2 = new Aluno();
		String nome2 = JOptionPane.showInputDialog("Qual o nome do aluno 2");
		String cpf2 = JOptionPane.showInputDialog("Qual o cpf do aluno 2");
		aluno2.setNome(nome2);
		aluno2.setNumeroCpf(cpf2);
// Conversão de string para double, e de uma string para inteiro //
//--------------------------------------------------------------------------------------------//		
		System.out.println("Idade do aluno 1: " + aluno1.getNome());
		System.out.println("Idade do aluno 1: " + aluno1.getIdade());
		System.out.println("Idade do aluno 1: " + aluno1.getDataNascimento());
		System.out.println("Idade do aluno 1: " + aluno1.getNumeroCpf());
		System.out.println("Data da matricula aluno 1: " + aluno1.getDataMatricula());
		System.out.println("-----------------------------------------------------------------");

//		aluno1.setNota1(88);
//		aluno1.setNota2(90);
//		aluno1.setNota3(55);
//		aluno1.setNota4(83);

		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");
		}
		// depende do numero de váriaveis que são implementadas na classe aluno

		System.out.println("-----------------------------------------------------------------");

		System.out.println("O nome do aluno 2 é : " + nome2);

		System.out.println("A média do aluno 1 é igual a : " + aluno1.getMediaNota());

		System.out.println("-----------------------------------------------------------------");

		System.out.println("Resultado = " + aluno1.getAlunoAprovado());

		/* Com operador ternário */
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

		System.out.println("-----------------------------------------------------------------");
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2() + "\n");
//--------------------------------------------------------------------------------------------//	
		System.out.println(aluno1); // imprime tudo os dados do objeto para checagem rapida, la na frente vai ser
									// feito uma seleção//
	}

}
