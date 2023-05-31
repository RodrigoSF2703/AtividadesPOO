package Model;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String codigo, String nome, String cpf, String endereco, double salario, String cargo) {
        super(codigo, nome, cpf, endereco);
        this.salario = salario;
        this.cargo = cargo;
    }

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
