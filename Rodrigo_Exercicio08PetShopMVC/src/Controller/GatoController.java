package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import Controller.GatoController.BotaoBehavior;
import Model.Gato;
import View.CadGatoView;

public class GatoController {
	CadGatoView cadGato;
	List <Gato> listaGato= new ArrayList<Gato>();
	
	public GatoController(CadGatoView cadastroGato){
	    cadGato = cadastroGato;
	    cadastroGato.setBotaoBehavior(new BotaoBehavior());
	}
	 class BotaoBehavior implements ActionListener{

		 @Override
		 public void actionPerformed(ActionEvent e) {
			 Gato gato = new Gato();
			 gato.setId(Integer.parseInt(cadGato.getId()));
			 gato.setNome(cadGato.getName());
			 gato.setIdade(Integer.parseInt(cadGato.getIdade()));
			 gato.setSexo(cadGato.getSexo());
			 gato.setPorte(cadGato.getPorte());
			 gato.setPeso(Double.parseDouble(cadGato.getPeso()));
	    	 listaGato.add(gato);
		    }

		  }
		  
		  public void listarGatoCadastradas(List<Gato> listaGato) {
			  for (Gato g:listaGato) {
				  System.out.println("Id do Gato: "+g.getId());
				  System.out.println("Nome: "+g.getNome());
				  System.out.println("idade: "+g.getIdade());
				  System.out.println("Raça: "+g.getRaca());
				  System.out.println("Cor: "+g.getCor());
				  System.out.println("Sexo: "+g.getSexo());
				  System.out.println("Porte: "+g.getPorte());
				  System.out.println("Peso: "+g.getPeso());
			  }
		  }
}
