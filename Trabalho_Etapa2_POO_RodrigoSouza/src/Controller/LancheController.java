package Controller;

import java.util.ArrayList;

import Model.Lanche;

public class LancheController {
	private ArrayList<Lanche> lanches;

    public LancheController() {
        this.lanches = new ArrayList<>();
    }

    public void adicionarLanche(Lanche lanche) {
        lanches.add(lanche);
    }

    public void removerLanche(Lanche lanche) {
        lanches.remove(lanche);
    }
}
