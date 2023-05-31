package Model;

import java.util.ArrayList;
import java.util.Date;

public class Pizza extends Prato {
    private Molho molho;
    private ArrayList<Recheio> recheios;
    private Borda borda;

    public Pizza(String id, String nome, double precoVenda, Date dataValida, double peso, Molho molho, ArrayList<Recheio> recheios, Borda borda) {
        super(id, nome, precoVenda, dataValida, peso);
        this.molho = molho;
        this.recheios = recheios;
        this.borda = borda;
    }

	public Molho getMolho() {
		return molho;
	}

	public void setMolho(Molho molho) {
		this.molho = molho;
	}

	public ArrayList<Recheio> getRecheios() {
		return recheios;
	}

	public void setRecheios(ArrayList<Recheio> recheios) {
		this.recheios = recheios;
	}

	public Borda getBorda() {
		return borda;
	}

	public void setBorda(Borda borda) {
		this.borda = borda;
	}

}
