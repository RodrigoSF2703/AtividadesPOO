package exercicio05;

import java.util.Date;

public class Funcionario extends Pessoa {
    private Date dataAdmissao;
    private String cargo;

    public Funcionario(String nome, String cpf, String email, String endereco, Date dataNascimento, String telefone, Date dataAdmissao, String cargo) {
        super(nome, cpf, email, endereco, dataNascimento, telefone);
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}