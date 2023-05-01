package pacote;

import java.util.Date;

public abstract class Pessoa {

	private String nome, cpf;
	private Date data_nascimento;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String cpf, Date data_nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	public float tirarCopias(float numerocopias) {
		
		return (float) (numerocopias *  0.10);
		
	}
}
