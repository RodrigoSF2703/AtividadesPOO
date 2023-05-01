package Atividade02Exercicio;

import java.util.Date;

public class Livro {
	private int id_livro;
	private String nome, autor;
	private Date ano_publicacao;
	private String genero;
	
	public Livro() {
		
	}
	public Livro(int id_livro, String nome, String autor, Date ano_publicacao, String genero) {
		this.id_livro = id_livro;
		this.nome = nome;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.genero = genero;
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
	public int getId_livro() {
		return id_livro;
	}
	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return "ID: " + getId_livro() + "\nNome do Livro: " + getNome() + "\nNome do Autor: " + getAutor() + "\nData de Publicacao: " + getAno_publicacao() + "\nGenero: " + getGenero() + "\n";
	}
	
}
