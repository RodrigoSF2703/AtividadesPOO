package Model;

public class LivroCategoria {
	private int idLivro, idCategoria;
	
	public LivroCategoria() {

	}
	public LivroCategoria(int idLivro, int idCategoria) {
		super();
		this.idCategoria = idCategoria;
	}
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}	
}
