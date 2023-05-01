package exercicio05;


public class Venda {
	 private Cliente cliente;
	    private Produto produto;
	    private Fornecedor fornecedor;
	    private Funcionario vendedor;
	    private double valorTotal;
	    private double valorFinal;

	    public Venda(Cliente cliente, Produto produto, Fornecedor fornecedor, Funcionario vendedor) {
	        this.cliente = cliente;
	        this.produto = produto;
	        this.fornecedor = fornecedor;
	        this.vendedor = vendedor;
	        this.valorTotal = calcularValorTotal();
	        this.valorFinal = calcularValorFinal();
	    }
	    public Venda(Funcionario vendedor, Produto produto, Fornecedor fornecedor, Funcionario vendendor) {
	        this.vendedor = vendedor;
	        this.produto = produto;
	        this.fornecedor = fornecedor;
	        this.cliente = cliente;
	    }

	    private double calcularValorTotal() {
	        double valorTotal = produto.getPrecoUnitario();
	        return valorTotal;
	    }

	    private double calcularValorFinal() {
	        double valorFinal = valorTotal;
	        if (cliente.getCpf().equals(vendedor.getCpf())) { // vendedor é o próprio cliente
	            valorFinal *= 0.8; // desconto de 20%
	        } else if (cliente.getCpf().equals(cliente.getCpf())) { // cliente já cadastrado
	            valorFinal *= 0.9; // desconto de 10%
	        } else { // novo cliente
	            valorFinal *= 0.95; // desconto de 5%
	            cliente.setClienteNovo(true);
	        }
	        return valorFinal;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public Produto getProduto() {
	        return produto;
	    }

	    public Fornecedor getFornecedor() {
	        return fornecedor;
	    }

	    public Funcionario getVendedor() {
	        return vendedor;
	    }

	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public double getValorFinal() {
	        return valorFinal;
	    }
	}