package Model;

public class Categoria {
	
	private String idCategoria;
	private String nome;
	
	public Categoria() {	
		
	}
	public Categoria(String nome, String idCategoria) {
		this.idCategoria = idCategoria;
		this.nome = nome;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
