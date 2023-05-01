package exercicio05;

import java.util.Date;

public class Cliente extends Pessoa {
	private boolean clienteNovo;
	
    public Cliente(String nome, String cpf, String email, String endereco, Date dataNascimento, String telefone) {
        super(nome, cpf, email, endereco, dataNascimento, telefone);
        this.clienteNovo = true;

    }
    public boolean isClienteNovo() {
        return clienteNovo;
    }

    public void setClienteNovo(boolean clienteNovo) {
        this.clienteNovo = clienteNovo;
    }
}