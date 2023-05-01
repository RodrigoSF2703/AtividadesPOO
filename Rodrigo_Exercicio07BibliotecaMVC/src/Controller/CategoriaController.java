package Controller;

import View.CadCategoriaView;
import Model.Categoria;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoriaController {
	CadCategoriaView cadCategoria;
	List <Categoria> listaCategoria= new ArrayList<Categoria>();
	
	public CategoriaController(CadCategoriaView cadastroCategoria){
	    cadCategoria= cadastroCategoria;
	    cadastroCategoria.setBotaoBehavior(new BotaoBehavior());
	}
	class BotaoBehavior implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Categoria categoria = new Categoria();
	      String id = cadCategoria.getId();
	      String nomeCategoria= cadCategoria.getNome();
	      
	      categoria.setIdCategoria(id);
	      categoria.setNome(nomeCategoria);
	      
	      listaCategoria.add(categoria);
	      
	      listarCategoriasCadastradas(listaCategoria);
	    }

	  }
	  
	  public void listarCategoriasCadastradas(List<Categoria> listaCategoria) {
		  for (Categoria c:listaCategoria) {
			  System.out.println("Id da Categoria: "+c.getIdCategoria());
			  System.out.println("Nome: "+c.getNome());
		  }
	  }
}
