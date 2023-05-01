package classes;

public class Pagamento {
	private double valorPago;

    public Pagamento(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorPago() {
        return valorPago;
    }

    public double calcularTroco(double valorCompra) {
        return valorPago - valorCompra;
    }
}
