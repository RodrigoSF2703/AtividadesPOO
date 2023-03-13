package exercicio05;

public class Produto {
    private int id;
    private String nome;
    private double precoUnitario;
    private Fornecedor fornecedor;

    public Produto(int id, String nome, double precoUnitario, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
}