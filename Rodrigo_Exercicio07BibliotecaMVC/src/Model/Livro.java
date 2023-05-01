package Model;

import java.util.Date;

public class Livro {
	private String idLivro;
	private String nome, autor;
	private Date ano_publicacao;
	
	public Livro() {
		
	}
	public Livro(String idLivro, String nome, String autor, Date ano_publicacao) {
		this.idLivro = idLivro;
		this.nome = nome;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
	}

	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
}
