package Model;

public class RelPropAnimal {
	private String cpf;
	private Integer id, idade;
	
	public RelPropAnimal() {
		
	}
	
	public RelPropAnimal(String cpf, Integer id, Integer idade) {
		super();
		this.cpf = cpf;
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
