package Controller;

import Model.Borda;
import java.util.ArrayList;
import java.util.List;

public class BordaController {
    private ArrayList<Borda> bordas;

    public BordaController() {
        this.bordas = new ArrayList<>();
    }

    public void adicionarBorda(Borda borda) {
        bordas.add(borda);
    }

    public void removerBorda(Borda borda) {
        bordas.remove(borda);
    }
    public List<Borda> getBordas() {
        return bordas;
    }
    public Borda encontrarBordaPorNome(String nome) {
        for (Borda borda : bordas) {
            if (borda.getNome().equals(nome)) {
                return borda;
            }
        }
        return null;
    }
}
