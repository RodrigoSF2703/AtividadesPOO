package Controller;

import Model.Molho;
import java.util.ArrayList;

public class MolhoController {
    private ArrayList<Molho> molhos;

    public MolhoController() {
        this.molhos = new ArrayList<>();
    }

    public void adicionarMolho(Molho molho) {
        molhos.add(molho);
    }

    public void removerMolho(Molho molho) {
        molhos.remove(molho);
    }
}
