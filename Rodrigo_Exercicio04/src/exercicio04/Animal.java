package exercicio04;

public abstract class Animal  {

	private String nome, raca, cor, sexo;
	private int idade;
	private Proprietario proprietario;
	
	public Animal(String nome, String raca, String cor, String sexo, int idade, Proprietario proprietario) {
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
		this.idade = idade;
		this.proprietario = proprietario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
	
}
