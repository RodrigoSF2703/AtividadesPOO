package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.RelPropAnimal;
import View.CadRelPropAnimalView;

public class RelPropAnimalController {
	CadRelPropAnimalView cadRelPropAnimal;
	static List <RelPropAnimal> listaRelPropAnimals = new ArrayList<RelPropAnimal>();
	
	public RelPropAnimalController(CadRelPropAnimalView cadastroRelPropAnimal){
	    cadRelPropAnimal = cadastroRelPropAnimal;
	    cadastroRelPropAnimal.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{
		  // Não consegui fazer
	  }
}
