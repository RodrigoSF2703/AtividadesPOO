package classes;

import java.util.Date;

public abstract class ItemVenda {
	private double precoVenda;
    private Date dataValidade;
    private double peso;

    public ItemVenda(double precoVenda, Date dataValidade, double peso) {
        this.precoVenda = precoVenda;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public double getPeso() {
        return peso;
    }

    public abstract String getDescricao();
}
