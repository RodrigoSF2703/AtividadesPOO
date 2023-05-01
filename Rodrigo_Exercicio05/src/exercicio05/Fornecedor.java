package exercicio05;

import java.util.Date;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String email;
    private String endereco;
    private Date dataAbertura;
    private String telefone;

    public Fornecedor(String nome, String cnpj, String email, String endereco, Date dataAbertura,
                      String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.endereco = endereco;
        this.dataAbertura = dataAbertura;
        this.telefone = telefone;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefones(String telefone) {
        this.telefone = telefone;
    }

    // método para exibir os dados do fornecedor
    public void exibirDados() {
        System.out.println("Dados do Fornecedor:");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data de Abertura: " + dataAbertura);
        System.out.println("Telefones: " + telefone);

    }
}