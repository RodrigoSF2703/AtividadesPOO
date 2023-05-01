package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
	
	private String nome;
    private List<Animal> animais;

    private static List<Proprietario> proprietarios = new ArrayList<>();
    
    public Proprietario(String nome) {
        this.nome = nome;
        this.animais = new ArrayList<>();
        proprietarios.add(this);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }
	
	public static List<Proprietario> getProprietarios() {
	    return proprietarios;
	}
}
