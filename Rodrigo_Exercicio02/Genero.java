package Atividade02Exercicio;

public class Genero {
	private String nome;
	private int id_genero;
	
	public Genero() {
		
	}
	public Genero(int id_genero, String nome) {
		this.id_genero = id_genero;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return  getNome();
	}
	public int getId_genero() {
		return id_genero;
	}
	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}
}
