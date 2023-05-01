package Model;

public class Passaro extends Animais {
	private Integer anilha;

	public Passaro() {
		
	}
	public Passaro(Integer id, String nome, Integer idade, String raca, String cor, String sexo, Integer anilha) {
		super(id, nome, idade, raca, cor, sexo);
		this.anilha = anilha;
	}

	public Integer getAnilha() {
		return anilha;
	}

	public void setAnilha(Integer anilha) {
		this.anilha = anilha;
	}
}
