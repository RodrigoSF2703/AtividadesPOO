package Controller;

import Model.Prato;
import java.util.ArrayList;

public class PratoController {
    private ArrayList<Prato> pratos;

    public PratoController() {
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void removerPrato(Prato prato) {
        pratos.remove(prato);
    }
    public ArrayList<Prato> getPratos() {
        return pratos;
    }
    public Prato encontrarPratoPorId(String id) {
        for (Prato prato : pratos) {
            if (prato.getId().equals(id)) {
                return prato;
            }
        }
        return null;
    }
}
