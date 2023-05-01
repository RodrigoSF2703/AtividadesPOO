package classes;

import java.util.Date;

public class Pizza extends ItemVenda{
	private String sabor;
    private String tipoMassa;
    private String tipoBorda;
    private String tipoMolho;

    public Pizza(double precoVenda, Date dataValidade, double peso,
                 String sabor, String tipoMassa, String tipoBorda, String tipoMolho) {
        super(precoVenda, dataValidade, peso);
        this.sabor = sabor;
        this.tipoMassa = tipoMassa;
        this.tipoBorda = tipoBorda;
        this.tipoMolho = tipoMolho;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTipoMassa() {
        return tipoMassa;
    }

    public String getTipoBorda() {
        return tipoBorda;
    }

    public String getTipoMolho() {
        return tipoMolho;
    }

    public String getDescricao() {
        return "Pizza de " + sabor + " - " + tipoMassa + " - " +
                tipoBorda + " - " + tipoMolho;
    }
}
