package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Cachorro;
import View.CadCachorroView;


public class CachorroController {
	CadCachorroView cadCachorro;
	List <Cachorro> listaCachorro= new ArrayList<Cachorro>();
	
	public CachorroController(CadCachorroView cadastroCachorro){
	    cadCachorro = cadastroCachorro;
	    cadastroCachorro.setBotaoBehavior(new BotaoBehavior());
	}
	 class BotaoBehavior implements ActionListener{

		 @Override
		 public void actionPerformed(ActionEvent e) {
			 Cachorro cachorro = new Cachorro();
			 cachorro.setId(Integer.parseInt(cadCachorro.getId()));
			 cachorro.setNome(cadCachorro.getName());
			 cachorro.setIdade(Integer.parseInt(cadCachorro.getIdade()));
			 cachorro.setSexo(cadCachorro.getSexo());
			 cachorro.setPorte(cadCachorro.getPorte());
			 cachorro.setPeso(Double.parseDouble(cadCachorro.getPeso()));
	    	 listaCachorro.add(cachorro);
		    }

		  }
		  
		  public void listarCachorroCadastradas(List<Cachorro> listaCachorro) {
			  for (Cachorro c:listaCachorro) {
				  System.out.println("Id do Cachorro: "+c.getId());
				  System.out.println("Nome: "+c.getNome());
				  System.out.println("idade: "+c.getIdade());
				  System.out.println("Raça: "+c.getRaca());
				  System.out.println("Cor: "+c.getCor());
				  System.out.println("Sexo: "+c.getSexo());
				  System.out.println("Porte: "+c.getPorte());
				  System.out.println("Peso: "+c.getPeso());
			  }
		  }
		    
}
