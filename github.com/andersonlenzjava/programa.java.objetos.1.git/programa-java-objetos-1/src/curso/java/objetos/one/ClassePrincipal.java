package curso.java.objetos.one;

import cursojava.classes.Aluno;

public class ClassePrincipal {

	public static void main(String[] args) {

		/* Criação de um objeto na memória com o endereço dentro da variável aluno1 */
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno("Jose", 55);

		aluno1.setDataMatricula("03/09/1992");

		System.out.println("Data da matricula aluno1: " + aluno1.getDataMatricula());

		aluno2.setDataMatricula("05/05/20");

		System.out.println("Data matricula aluno2: " + aluno2.getDataMatricula());
		
		System.out.println("-----------------------------------------------------------------");
		
		aluno1.setNota1(88);
		aluno1.setNota2(90);
		aluno1.setNota3(55);
		aluno1.setNota4(83);
		
		System.out.println("A média do aluno 1 é igual a : " + aluno1.getMediaNota());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		/*Com operador ternário */
		System.out.println("-----------------------------------------------------------------");	
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}
