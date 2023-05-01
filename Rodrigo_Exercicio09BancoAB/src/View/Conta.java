package View;

public class Conta {
	private String Dono, Conta;
    private double saldo;
    
    public Conta() {
    	
    }
    public Conta(String Dono, String Conta, double saldo) {
        this.Dono = Dono;
        this.Conta = Conta;
        this.saldo = saldo;
    }
	public String getDono() {
		return Dono;
	}
	public void setDono(String dono) {
		Dono = dono;
	}
	public String getConta() {
		return Conta;
	}
	public void setConta(String conta) {
		Conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
