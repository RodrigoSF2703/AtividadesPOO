package Model;

public class Cachorro extends Animais{
	private String porte;
	private Double peso;
	
	public Cachorro() {

	}
	public Cachorro(Integer id, String nome, Integer idade, String raca, String cor, String sexo, String porte, Double peso) {
		super(id,nome, idade, raca, cor, sexo);
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
