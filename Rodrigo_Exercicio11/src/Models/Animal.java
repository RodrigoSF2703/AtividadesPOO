package Models;

public abstract class Animal {
    
	private int id;
    private String nome;
    private int idade;
    private String raca;
    private String cor;
    private String sexo;
    	
    public Animal(int id, String nome) {
    	this.id = id;
		this.nome = nome;
    }
    
    public Animal(int id, String nome, int idade, String raca, String cor, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
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