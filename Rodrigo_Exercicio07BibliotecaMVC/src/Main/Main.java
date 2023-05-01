package Main;

import Controller.CategoriaController;
import Controller.LivroController;
import Model.Categoria;
import Model.Livro;
import View.CadCategoriaView;
import View.CadLivroView;

public class Main {

	public static void main(String[] args) {
		
			CadLivroView cadLivro = new CadLivroView();
			new LivroController(cadLivro);
			
			CadCategoriaView cadCategoria = new CadCategoriaView();
			new CategoriaController(cadCategoria);
		}

}
