package exercicio05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// Criando um cliente
        Cliente cliente1 = new Cliente("Fulano", "111.111.111-11", "fulano@gmail.com",
                "Rua das Flores, 123", new Date(80, 5, 15), "123456789");
        cliente1.setClienteNovo(true);

        // Criando um funcionário
        Funcionario funcionario1 = new Funcionario("Ciclano", "222.222.222-22", "ciclano@gmail.com",
                "Rua das Pedras, 456", new Date(85, 8, 20), "987654321",
                new Date(2022, 2, 1), "Vendedor");

        // Criando um fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor 1", "00.000.000/0000-00", "fornecedor1@gmail.com",
                "Rua dos Pinheiros, 789", new Date(90, 2, 10), "246813579");

        // Criando um produto
        Produto produto1 = new Produto(1, "Produto 1", 50.0, fornecedor1);

        // Realizando uma venda com cliente já cadastrado
        Venda venda1 = new Venda(cliente1, produto1, fornecedor1, funcionario1);
        System.out.println("Valor da venda para cliente já cadastrado: R$" + venda1.getValorFinal());

        // Criando um novo cliente
        Cliente cliente2 = new Cliente("Beltrano", "333.333.333-33", "beltrano@gmail.com",
                "Rua dos Mares, 321", new Date(95, 1, 5), "456789123");
        cliente2.setClienteNovo(false);

        // Realizando uma venda com novo cliente
        Venda venda2 = new Venda(cliente2, produto1, fornecedor1, funcionario1);
        System.out.println("Valor da venda para novo cliente: R$" + venda2.getValorFinal());

        // Realizando uma venda com funcionário
        Venda venda3 = new Venda(funcionario1, produto1, fornecedor1, funcionario1);
        System.out.println("Valor da venda para funcionário: R$" + venda3.getValorFinal());
    }
}