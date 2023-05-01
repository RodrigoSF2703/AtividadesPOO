package atividade01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Aluno aluno = new Aluno(); //Criando um objeto carro
		int aux = 0, aux2 = 0, aux3 = 0;
		
		//Criando o objeto com construtor com parâmetros
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date datanascimento = formato.parse("23/12/2000");
		Aluno aluno1 = new Aluno("Rodrigo", "drigo2012@gmail.com", 12353, datanascimento);
		Date datanascimento1 = formato.parse("25/11/2001");
		Aluno aluno2 = new Aluno("Jermano", "jermano2012@gmail.com", 12434, datanascimento1);
		Date datanascimento2 = formato.parse("25/12/2021");
		Aluno aluno3 = new Aluno("Jose", "jose2012@gmail.com", 1542145, datanascimento2);
		
		System.out.println("\nInformações do 1º Aluno:");
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("CPF: "+aluno1.getCpf());
		System.out.println("E-mail: "+aluno1.getEmail());
		System.out.println("Data de Nascimento: "+aluno1.getDatanascimento());
		
		System.out.println("\nInformações do 2º Aluno:");
		System.out.println("Nome: "+aluno2.getNome());
		System.out.println("CPF: "+aluno2.getCpf());
		System.out.println("E-mail: "+aluno2.getEmail());
		System.out.println("Data de Nascimento: "+aluno2.getDatanascimento());
		
		System.out.println("\nInformações do 3º Aluno:");
		System.out.println("Nome: "+aluno3.getNome());
		System.out.println("CPF: "+aluno3.getCpf());
		System.out.println("E-mail: "+aluno3.getEmail());
		System.out.println("Data de Nascimento: "+aluno3.getDatanascimento());
		
		aux = aluno.idadeAluno(aluno1);
		aux2 = aluno.idadeAluno(aluno2);
		aux3 = aluno.idadeAluno(aluno3);

		if (aux > aux2) {
			if (aux > aux3) {
				System.out.println("\nAluno mais velho:");
				System.out.println("Nome: "+aluno1.getNome());
				System.out.println("Idade: "+aux);
			}
			else {
				System.out.println("\nAluno mais velho:");
				System.out.println("Nome: "+aluno3.getNome());
				System.out.println("Idade: "+aux3);
			}
		}
		else if (aux2 > aux3) {
			System.out.println("\nAluno mais velho:");
			System.out.println("Nome: "+aluno2.getNome());
			System.out.println("Idade: "+aux2);
		}
		else {
			System.out.println("\nAluno mais velho:");
			System.out.println("Nome: "+aluno3.getNome());
			System.out.println("Idade: "+aux3);
		}
	}

}
