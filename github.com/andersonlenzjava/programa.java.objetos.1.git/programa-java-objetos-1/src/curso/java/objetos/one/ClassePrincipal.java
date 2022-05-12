package curso.java.objetos.one;

import cursojava.classes.Aluno;

public class ClassePrincipal {

	public static void main(String[] args) {

		/* Criação de um objeto na memória com o endereço dentro da variável aluno1 */
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();	
		Aluno aluno3 = new Aluno("Jose", 55);
		
		aluno1.setDataMatricula("03/09/1992");
		
		System.out.println("Data da matricula: " + aluno1.getDataMatricula());
	}

}
