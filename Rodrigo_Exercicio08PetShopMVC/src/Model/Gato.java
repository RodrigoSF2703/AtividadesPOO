package Model;

public class Gato extends Animais{
	private String porte;
	private Double peso;
	
	public Gato() {

	}
	public Gato(Integer id, String nome, Integer idade, String raca, String cor, String sexo, String porte, double peso) {
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
