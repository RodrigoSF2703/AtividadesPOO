package exercicio04;

public class Gato extends Animal{
	
	private String porte;
	private double peso;

	
	public Gato(String nome, String raca, String cor, String sexo, int idade, String porte, double peso, Proprietario proprietario) {
		super(nome, raca, cor, sexo, idade, proprietario);
		this.porte = porte;
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	

}
