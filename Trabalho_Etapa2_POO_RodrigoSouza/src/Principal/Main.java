package Principal;

import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.PratoController;
import Controller.PedidoController;
import Controller.LancheController;
import Controller.MolhoController;
import Controller.RecheioController;
import View.ClienteView;
import View.FuncionarioView;
import View.PratoView;
import View.PedidoView;
import View.LancheView;
import View.MolhoView;
import View.RecheioView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteController clienteController = new ClienteController();
        FuncionarioController funcionarioController = new FuncionarioController();
        PratoController pratoController = new PratoController();
        PedidoController pedidoController = new PedidoController();
        LancheController lancheController = new LancheController();
        MolhoController molhoController = new MolhoController();
        RecheioController recheioController = new RecheioController();

        ClienteView clienteView = new ClienteView(clienteController);
        FuncionarioView funcionarioView = new FuncionarioView(funcionarioController);
        PratoView pratoView = new PratoView(pratoController);
        PedidoView pedidoView = new PedidoView(pedidoController);
        LancheView lancheView = new LancheView(lancheController);
        MolhoView molhoView = new MolhoView(molhoController);
        RecheioView recheioView = new RecheioView(recheioController);
    }
}