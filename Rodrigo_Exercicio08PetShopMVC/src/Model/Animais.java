package Model;

public class Animais {
	private Integer id, idade;
	private String nome, raca, cor, sexo;
	
	public Animais() {
		
	}
	
	public Animais(Integer id, String nome, Integer idade, String raca, String cor, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
