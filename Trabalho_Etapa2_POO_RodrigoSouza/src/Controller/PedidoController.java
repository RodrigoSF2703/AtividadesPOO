package Controller;

import Model.Pedido;
import java.util.ArrayList;

public class PedidoController {
    private ArrayList<Pedido> pedidos;

    public PedidoController() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }
}
