package Model;

import java.util.Date;

public class Salgadinho extends Prato {
    private String recheio;
    private String massa;
    private String tipo;

    public Salgadinho(String id, String nome, double precoVenda, Date dataValida, double peso, String recheio, String massa, String tipo) {
        super(id, nome, precoVenda, dataValida, peso);
        this.recheio = recheio;
        this.massa = massa;
        this.tipo = tipo;
    }

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
