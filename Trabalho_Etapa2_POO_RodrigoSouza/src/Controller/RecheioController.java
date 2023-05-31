package Controller;

import Model.Recheio;
import java.util.ArrayList;

public class RecheioController {
    private ArrayList<Recheio> recheios;

    public RecheioController() {
        this.recheios = new ArrayList<>();
    }

    public void adicionarRecheio(Recheio recheio) {
        recheios.add(recheio);
    }

    public void removerRecheio(Recheio recheio) {
        recheios.remove(recheio);
    }
}
