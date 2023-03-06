package pacote;

import java.util.Date;

public class Funcionario extends Pessoa {
	private String cargo;
	private Date data_admissao;
	private float salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, Date data_nascimento, String cargo, float salario, Date data_admissao) {
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.data_admissao = data_admissao;
	}	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
