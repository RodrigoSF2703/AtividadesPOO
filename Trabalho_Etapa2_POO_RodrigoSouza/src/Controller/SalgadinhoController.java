package Controller;

import Model.Salgadinho;
import java.util.ArrayList;

public class SalgadinhoController {
    private ArrayList<Salgadinho> salgadinhos;

    public SalgadinhoController() {
        this.salgadinhos = new ArrayList<>();
    }

    public void adicionarSalgadinho(Salgadinho salgadinho) {
        salgadinhos.add(salgadinho);
    }

    public void removerSalgadinho(Salgadinho salgadinho) {
        salgadinhos.remove(salgadinho);
    }
}
