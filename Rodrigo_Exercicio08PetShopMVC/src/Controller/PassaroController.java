package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import Controller.GatoController.BotaoBehavior;
import Model.Passaro;
import View.CadPassaroView;

public class PassaroController {
	CadPassaroView cadPassaro;
	List <Passaro> listaPassaro= new ArrayList<Passaro>();
	
	public PassaroController(CadPassaroView cadastroPassaro){
	    cadPassaro = cadastroPassaro;
	    cadastroPassaro.setBotaoBehavior(new BotaoBehavior());
	}
	 class BotaoBehavior implements ActionListener{

		 @Override
		 public void actionPerformed(ActionEvent e) {
			 Passaro passaro = new Passaro();
			 passaro.setId(Integer.parseInt(cadPassaro.getId()));
			 passaro.setNome(cadPassaro.getName());
			 passaro.setIdade(Integer.parseInt(cadPassaro.getIdade()));
			 passaro.setSexo(cadPassaro.getSexo());
			 passaro.setAnilha(Integer.parseInt(cadPassaro.getAnilha()));
	    	 listaPassaro.add(passaro);
		    }

		  }
		  
		  public void listarPassaroCadastradas(List<Passaro> listaPassaro) {
			  for (Passaro p:listaPassaro) {
				  System.out.println("Id do Passaro: "+p.getId());
				  System.out.println("Nome: "+p.getNome());
				  System.out.println("idade: "+p.getIdade());
				  System.out.println("Raça: "+p.getRaca());
				  System.out.println("Cor: "+p.getCor());
				  System.out.println("Sexo: "+p.getSexo());
				  System.out.println("Porte: "+p.getAnilha());
			  }
		  }
}
