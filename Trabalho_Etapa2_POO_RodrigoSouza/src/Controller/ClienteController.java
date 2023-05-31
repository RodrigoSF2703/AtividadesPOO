package Controller;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private ArrayList<Cliente> clientes;

    public ClienteController() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente encontrarClientePorCodigo(String codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigo)) {
                return cliente;
            }
        }
        return null;
    }
}
