package pacote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Aluno aluno = new Aluno("Rodrigo", "134.355.234-65", formato.parse("15/03/2001"), 1);
		Professor professor = new Professor("Ramom", "234.233.452-43", formato.parse("15/04/1986"), "Portugues", 1030);
		Funcionario funcionario = new Funcionario("Dascan", "256.563.462-45", formato.parse("15/05/1999"), "Ferreiro", 1500,  formato.parse("05/04/2018"));

		System.out.println("Informações do Aluno:");
		System.out.println("Nome: " +aluno.getNome());
		System.out.println("CPF: " +aluno.getCpf());
		System.out.println("Data de Nascimento: " +aluno.getData_nascimento());
		System.out.println("Matricula: " +aluno.getMatricula());
		System.out.println("Preço de 1000 copias: " +aluno.tirarCopias(1000));
		
		System.out.println("\nInformações do Professor:");
		System.out.println("Nome: " +professor.getNome());
		System.out.println("CPF: " +professor.getCpf());
		System.out.println("Data de Nascimento: " +professor.getData_nascimento());
		System.out.println("Matricula: " +professor.getDisciplina());
		System.out.println("Salario: " +professor.getSalario());
		System.out.println("Preço de 1000 copias: " + professor.tirarCopias(1000));
		
		System.out.println("\nInformações do Funcionario:");
		System.out.println("Nome: " +funcionario.getNome());
		System.out.println("CPF: " +funcionario.getCpf());
		System.out.println("Data de Nascimento: " +funcionario.getData_nascimento());
		System.out.println("Cargo: " +funcionario.getCargo());
		System.out.println("Salario: " +funcionario.getSalario());
		System.out.println("Data de Admissão: " +funcionario.getData_admissao());
		System.out.println("Preço de 1000 copias: " + funcionario.tirarCopias(1000));
		
	}

}
