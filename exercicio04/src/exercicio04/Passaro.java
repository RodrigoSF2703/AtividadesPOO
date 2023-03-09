package exercicio04;

public class Passaro extends Animal{
	
	private int numero_anilha;
	
	public Passaro(String nome, String raca, String cor, String sexo, int idade, int numero_anilha, Proprietario proprietario) {
		super(nome, raca, cor, sexo, idade, proprietario);
		this.numero_anilha = numero_anilha;
	}

	public int getNumero_anilha() {
		return numero_anilha;
	}

	public void setNumero_anilha(int numero_anilha) {
		this.numero_anilha = numero_anilha;
	}
}
