package Controller;

import View.CadLivroView;
import Model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class LivroController {
	CadLivroView cadLivro;
	List <Livro> listaLivro = new ArrayList<Livro>();
	
	public LivroController(CadLivroView cadastroLivro){
	    cadLivro = cadastroLivro;
	    cadastroLivro.setBotaoBehavior(new BotaoBehavior());
	  }
	class BotaoBehavior implements ActionListener{
		@Override
	    public void actionPerformed(ActionEvent e) {
	      Livro livro = new Livro();
	      String id = cadLivro.getId();
	      String nomeLivro = cadLivro.getNome();
	      String autorLivro = cadLivro.getAutor();
	      String dataPublicacao = cadLivro.getData();
	      
	      livro.setIdLivro(id);
	      livro.setNome(nomeLivro);
	      livro.setAutor(autorLivro);
	      Date data = new Date();
	      livro.setAno_publicacao(data);
	      listaLivro.add(livro);
	      
	      listarLivrosCadastrados(listaLivro);
	    }
	}
		public void listarLivrosCadastrados(List<Livro> listaLivros) {
			  for (Livro l:listaLivros) {
				  System.out.println("Id do Livro: "+l.getIdLivro());
				  System.out.println("Nome: "+l.getNome());
				  System.out.println("Autor: "+l.getAutor());
				  System.out.println("Data de Publicação: "+l.getAno_publicacao());

			  }
		  }
}
