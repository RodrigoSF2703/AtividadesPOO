package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import Controller.ProprietarioController.BotaoBehavior;
import Model.Proprietario;
import View.CadProprietarioView;

public class ProprietarioController {
	CadProprietarioView cadProprietario;
	List <Proprietario> listaProprietario= new ArrayList<Proprietario>();
	
	public ProprietarioController(CadProprietarioView cadastroProprietario){
	    cadProprietario = cadastroProprietario;
	    cadastroProprietario.setBotaoBehavior(new BotaoBehavior());
	}
	 class BotaoBehavior implements ActionListener{

		 @Override
		 public void actionPerformed(ActionEvent e) {
			 Proprietario proprietario = new Proprietario();
			 proprietario.setCpf(cadProprietario.getCpf());
			 proprietario.setNome(cadProprietario.getNome());
			 proprietario.setEndereco(cadProprietario.getEndereco());
			 proprietario.setTelefone(cadProprietario.getTelefone());
	    	 listaProprietario.add(proprietario);
		 }

	}
		  
		  public void listarProprietarioCadastradas(List<Proprietario> listaProprietario) {
			  for (Proprietario p:listaProprietario) {
				  System.out.println("CPF do Proprietario: "+p.getCpf());
				  System.out.println("Nome: "+p.getNome());
				  System.out.println("Endereço: "+p.getEndereco());
				  System.out.println("Telefone: "+p.getTelefone());
			  }
		  }
}
