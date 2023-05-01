package classes;

import java.util.Date;
import java.util.List;

public class Lanche extends ItemVenda{
	private String tipoPao;
    private String recheio;
    private List<String> molhos;

    public Lanche(String nome, double preco, Date dataValidade, double peso, String tipoPao, String recheio, List<String> molhos) {
        super(preco, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molhos = molhos;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public List<String> getMolhos() {
        return molhos;
    }

    public void setMolhos(List<String> molhos) {
        this.molhos = molhos;
    }
    @Override
    public String getDescricao() {
        return "Lanche: " + recheio + " - " + tipoPao + " - " + molhos.toString();
    }
}
