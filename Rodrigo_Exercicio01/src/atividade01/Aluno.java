package atividade01;

import java.util.Date;

public class Aluno {
	
	private String nome;
	private String email;
	private Integer cpf;
	private Date datanascimento;
	
	//Construtor Vazio
	public Aluno() {
		super();
	}

	//Construtor com parâmetros
	public Aluno(String nome, String email, Integer cpf, Date datanascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.datanascimento = datanascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Integer idadeAluno(Aluno aluno) {
		Integer idade = 0;
		idade = new Date().getYear() - aluno.getDatanascimento().getYear();
		return idade;
	}
}
