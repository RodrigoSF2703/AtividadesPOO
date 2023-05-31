package Controller;

import Model.Pizza;
import java.util.ArrayList;

public class PizzaController {
	private ArrayList<Pizza> pizzas;

    public PizzaController() {
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void removerPizza(Pizza pizza) {
        pizzas.remove(pizza);
    }
}
