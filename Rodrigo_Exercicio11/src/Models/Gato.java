package Models;

public class Gato extends Animal {
    
	private String porte;
    private double peso;
    
    // Construtores, getters e setters aqui
    public Gato(int id, String nome, String porte, double peso) {
		super(id, nome);
		this.porte = porte;
		this.peso = peso;
	}
    
    public Gato(int id, String nome, int idade, String raca, String cor, String sexo, String porte, double peso) {
		super(id, nome, idade, raca, cor, sexo);
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
