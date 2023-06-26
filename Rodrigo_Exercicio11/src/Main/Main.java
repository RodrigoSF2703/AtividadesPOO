package Main;

import DAO.AnimalDAO;
import DAO.ProprietarioDAO;
import Models.Cao;
import Models.Gato;
import Models.Passaro;
import Models.Proprietario;
import Models.Animal;
import View.RelatorioPDFView;

public class Main {
    public static void main(String[] args) {
        cadastrarProprietarios();
        cadastrarAnimais();
        associarAnimaisAProprietarios();
        gerarRelatorio();
    }

    private static void cadastrarProprietarios() {
        ProprietarioDAO.cadastrarProprietario(new Proprietario("11111111111", "Proprietario 1", "Endereco 1", "Telefone 1"));
        ProprietarioDAO.cadastrarProprietario(new Proprietario("22222222222", "Proprietario 2", "Endereco 2", "Telefone 2"));
        ProprietarioDAO.cadastrarProprietario(new Proprietario("33333333333", "Proprietario 3", "Endereco 3", "Telefone 3"));
        ProprietarioDAO.cadastrarProprietario(new Proprietario("44444444444", "Proprietario 4", "Endereco 4", "Telefone 4"));
    }

    private static void cadastrarAnimais() {
        AnimalDAO.cadastrarAnimal(new Cao(1, "Cao 1", 2, "Raca 1", "Cor 1", "Macho", "Porte 1", 10.5));
        AnimalDAO.cadastrarAnimal(new Cao(2, "Cao 2", 3, "Raca 2", "Cor 2", "Femea", "Porte 2", 12.8));
        AnimalDAO.cadastrarAnimal(new Cao(3, "Cao 3", 4, "Raca 3", "Cor 3", "Macho", "Porte 3", 9.2));

        AnimalDAO.cadastrarAnimal(new Gato(4, "Gato 1", 1, "Raca 4", "Cor 4", "Macho", "Porte 4", 5.7));
        AnimalDAO.cadastrarAnimal(new Gato(5, "Gato 2", 2, "Raca 5", "Cor 5", "Femea", "Porte 5", 4.3));
        AnimalDAO.cadastrarAnimal(new Gato(6, "Gato 3", 3, "Raca 6", "Cor 6", "Macho", "Porte 6", 6.1));

        AnimalDAO.cadastrarAnimal(new Passaro(7, "Passaro 1", 1, "Raca 7", "Cor 7", "Macho", 1234));
        AnimalDAO.cadastrarAnimal(new Passaro(8, "Passaro 2", 2, "Raca 8", "Cor 8", "Femea", 5678));
        AnimalDAO.cadastrarAnimal(new Passaro(9, "Passaro 3", 3, "Raca 9", "Cor 9", "Macho", 9012));
        AnimalDAO.cadastrarAnimal(new Passaro(10, "Passaro 4", 4, "Raca 10", "Cor 10", "Femea", 3456));
    }

    private static void associarAnimaisAProprietarios() {
        Proprietario proprietario1 = ProprietarioDAO.buscarProprietario("11111111111");
        Proprietario proprietario2 = ProprietarioDAO.buscarProprietario("22222222222");
        Proprietario proprietario3 = ProprietarioDAO.buscarProprietario("33333333333");
        Proprietario proprietario4 = ProprietarioDAO.buscarProprietario("44444444444");

        Animal animal2 = AnimalDAO.buscarAnimal(2);
        Animal animal3 = AnimalDAO.buscarAnimal(3);
        Animal animal4 = AnimalDAO.buscarAnimal(4);
        Animal animal1 = AnimalDAO.buscarAnimal(1);

        proprietario1.adicionarAnimal(animal2);
        proprietario1.adicionarAnimal(animal3);
        proprietario1.adicionarAnimal(animal4);
        proprietario1.adicionarAnimal(animal1);

        Animal animal1_2 = AnimalDAO.buscarAnimal(1);
        Animal animal3_2 = AnimalDAO.buscarAnimal(3);

        proprietario2.adicionarAnimal(animal1_2);
        proprietario2.adicionarAnimal(animal3_2);

        Animal animal4_2 = AnimalDAO.buscarAnimal(4);

        proprietario3.adicionarAnimal(animal4_2);

        Animal animal4_3 = AnimalDAO.buscarAnimal(4);

        proprietario4.adicionarAnimal(animal4_3);
    }

    private static void gerarRelatorio() {
        RelatorioPDFView relatorio = new RelatorioPDFView();
        relatorio.gerarRelatorioPDF();
    }
}

