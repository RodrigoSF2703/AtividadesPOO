package pacote;

import java.util.Date;

public class Aluno extends Pessoa {
	private int matricula;

	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String cpf, Date data_nascimento, int matricula) {
		super(nome, cpf, data_nascimento);
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}	
	public float tirarCopias(float numerocopias) {
		
		return (float) (numerocopias *  0.05);
	}
}
