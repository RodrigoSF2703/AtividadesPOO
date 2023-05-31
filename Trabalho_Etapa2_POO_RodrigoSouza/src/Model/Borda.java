package Model;

public class Borda {
	private String nome;
    private double valor;
    private String recheio;

    public Borda(String nome, double valor, String recheio) {
        this.nome = nome;
        this.valor = valor;
        this.recheio = recheio;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
}
