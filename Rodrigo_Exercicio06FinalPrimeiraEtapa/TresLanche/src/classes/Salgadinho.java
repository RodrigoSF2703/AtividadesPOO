package classes;

import java.util.Date;

public class Salgadinho extends ItemVenda{
	private String tipo;
    private String massa;
    private String recheio;

    public Salgadinho(String nome, double preco, Date dataValidade, double peso, String tipo, String massa, String recheio) {
        super(preco, dataValidade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    @Override
    public String getDescricao() {
        return "Salgadinho: " + recheio + " - " + massa;
    }
}
