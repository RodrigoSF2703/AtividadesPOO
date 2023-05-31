package Model;

import java.util.ArrayList;

public class Pedido {
	private int idPedido;
    private String cliente, funcionarios;
    private double taxaDeServico, valorTotal;
    private ArrayList<Prato> itensConsumidos;
    private ArrayList<Integer> quantidades;

    public Pedido(int idPedido, String cliente, String funcionarios, double taxaDeServico) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.funcionarios = funcionarios;
        this.taxaDeServico = taxaDeServico;
        this.itensConsumidos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void calcularTotal() {
        // Implemente o cálculo do valor total do pedido
    }

    public void mostrarFatura() {
        // Implemente a exibição da fatura do pedido
    }

    public void divideValor(int numPessoas) {
        // Implemente a divisão do valor total entre as pessoas especificadas
    }

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(String funcionarios) {
		this.funcionarios = funcionarios;
	}

	public double getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public ArrayList<Prato> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(ArrayList<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public ArrayList<Integer> getQuantidades() {
		return quantidades;
	}

	public void setQuantidades(ArrayList<Integer> quantidades) {
		this.quantidades = quantidades;
	}
}
