package Model;


public class Cliente extends Pessoa {
    private String aniversario;

    public Cliente(String codigo, String nome, String cpf, String endereco, String aniversario) {
        super(codigo, nome, cpf, endereco);
        this.aniversario = aniversario;
    }

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

}
