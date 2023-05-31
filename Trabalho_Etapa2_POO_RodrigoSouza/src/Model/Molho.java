package Model;

public class Molho {
	private String id, nome;
    private double valor;

    public Molho(String id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
