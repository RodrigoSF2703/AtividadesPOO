package Model;

import java.util.Date;

public class Prato {
	private String id, nome;
    private double precoVenda, peso;
    private Date dataValida;

    public Prato(String id, String nome, double precoVenda, Date dataValida, double peso) {
        this.id = id;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.dataValida = dataValida;
        this.peso = peso;
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

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Date getDataValida() {
		return dataValida;
	}

	public void setDataValida(Date dataValida) {
		this.dataValida = dataValida;
	}
}
