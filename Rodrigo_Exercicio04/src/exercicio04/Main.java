package exercicio04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void listarAnimaisPorIdade() {
	    List<Animal> animais = new ArrayList<>();
	    for (Proprietario proprietario : Proprietario.getProprietarios()) {
	        animais.addAll(proprietario.getAnimais());
	    }
	    animais.sort(Comparator.comparing(Animal::getIdade));
	    	
	    	for (Animal animal : animais) {
	    		System.out.println("Nome do proprietário: " + animal.getProprietario().getNome());
	    		System.out.println("Nome do animal: " + animal.getNome());
	    		System.out.println("Idade do animal: " + animal.getIdade());
	    		System.out.println("Raça do animal: " + animal.getRaca());
	    		System.out.println("Cor do animal: " + animal.getCor());
	    		System.out.println("Sexo do animal: " + animal.getSexo());
	    		System.out.println("Tipo do animal: " + animal.getClass().getSimpleName());
	    		System.out.println("--------------------------------------\n");
	    	}
	}
	
	public static void main(String[] args) {

        Proprietario proprietario1 = new Proprietario("João");
        Proprietario proprietario2 = new Proprietario("Maria");
        Proprietario proprietario3 = new Proprietario("Ana");
        
        Cao meuCao = new Cao("Bolinha", "Poodle", "Branco", "Macho", 5, "Pequeno", 3.5, proprietario2);
        Passaro passaro = new Passaro("Twitter", "VaiSaber", "Azul", "Macho", 7, 2, proprietario1);
        Gato meugato = new Gato("Almondega", "Vagabunda", "Pardo", "Macho", 6, "Medio", 3.4, proprietario2);	
        Gato yumi = new Gato("Yumi", "Rainha", "Cinza", "Femea", 4, "Medio", 8, proprietario1);		
        
        proprietario1.cadastrarAnimal(yumi);
        proprietario2.cadastrarAnimal(meugato);
        proprietario3.cadastrarAnimal(meuCao);
        proprietario1.cadastrarAnimal(passaro);


        // Imprime os animais de um determinado proprietário
        System.out.println("\nAnimais de " + proprietario1.getNome() + ":");
        for (Animal animal : proprietario1.getAnimais()) {
            System.out.println(animal.getNome());
        }
        
        // Imprime todos os animais e seus proprietários
        System.out.println("\nTodos os animais e seus proprietários:");
        for (Proprietario proprietario : Proprietario.getProprietarios()) {
            for (Animal animal : proprietario.getAnimais()) {
                System.out.println(animal.getNome() + " - " + proprietario.getNome());
            }
        }
        
        System.out.println("\n");
        listarAnimaisPorIdade();
        
        
        
        
	}
}
