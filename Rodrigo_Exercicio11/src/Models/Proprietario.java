package Models;

import java.util.List;
import java.util.ArrayList;

public class Proprietario {
    
	private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Animal> animais;
    
    public Proprietario(String cpf, String nome, String endereco, String telefone) {
    	super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
    }
    
    public Proprietario(String cpf, String nome, String endereco, String telefone, Animal animais) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.animais = new ArrayList<>();
	}
    
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void adicionarAnimal(Animal animal) {
	    animais.add(animal);
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

    
}
