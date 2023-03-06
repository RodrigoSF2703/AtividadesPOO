package pacote;

import java.util.Date;

public class Professor extends Pessoa{
	
	private String disciplina;

	private float salario;
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String cpf, Date data_nascimento, String disciplina, float salario) {
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
