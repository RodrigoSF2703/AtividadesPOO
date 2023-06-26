package Models;

public class Passaro extends Animal {
    

	private int anilha;
    
    // Construtores, getters e setters aqui
	public Passaro(int id, String nome, int anilha) {
		super(id, nome);
		this.anilha = anilha;
	}
	public Passaro(int id, String nome, int idade, String raca, String cor, String sexo, int anilha) {
		super(id, nome, idade, raca, cor, sexo);
		this.anilha = anilha;
	}

	public int getAnilha() {
		return anilha;
	}

	public void setAnilha(int anilha) {
		this.anilha = anilha;
	}
	
}
