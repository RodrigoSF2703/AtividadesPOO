package classes;

import java.util.List;

public class Cardapio {
	private List<Pizza> pizzas;
    private List<Lanche> lanches;
    private List<Salgadinho> salgadinhos;

    public Cardapio(List<Pizza> pizzas, List<Lanche> lanches, List<Salgadinho> salgadinhos) {
        this.pizzas = pizzas;
        this.lanches = lanches;
        this.salgadinhos = salgadinhos;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(List<Lanche> lanches) {
        this.lanches = lanches;
    }

    public List<Salgadinho> getSalgadinhos() {
        return salgadinhos;
    }

    public void setSalgadinhos(List<Salgadinho> salgadinhos) {
        this.salgadinhos = salgadinhos;
    }
}
