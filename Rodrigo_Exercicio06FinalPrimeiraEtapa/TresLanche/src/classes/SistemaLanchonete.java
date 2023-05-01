package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaLanchonete {

	private List<String> cardapio;

    public SistemaLanchonete() {
        this.cardapio = new ArrayList<>();
        this.cardapio.add("X-Burguer");
        this.cardapio.add("X-Salada");
        this.cardapio.add("X-Bacon");
    }

    public void exibirCardapio() {
        System.out.println("=== Cardápio ===");
        for (String item : this.cardapio) {
            System.out.println("- " + item);
        }
        System.out.println();
    }

    public void fazerPedido() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número do item que deseja pedir:");
        int opcao = input.nextInt();
        String item = this.cardapio.get(opcao - 1);
        System.out.println("Pedido realizado com sucesso! Você pediu um " + item + ".");
    }
    
	public static void main(String[] args) {
		SistemaLanchonete sistema = new SistemaLanchonete();
        Scanner input = new Scanner(System.in);

        boolean sair = false;
        while (!sair) {
            System.out.println("=== Lanchonete Quase Três Lanches ===");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Exibir cardápio");
            System.out.println("2. Fazer pedido");
            System.out.println("3. Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    sistema.exibirCardapio();
                    break;
                case 2:
                    sistema.fazerPedido();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        System.out.println("Obrigado por escolher a Lanchonete Quase Três Lanches!");
	}
}