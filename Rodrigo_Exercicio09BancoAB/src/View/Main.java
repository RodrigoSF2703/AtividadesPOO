package View;

public class Main {
	public static void main(String[] args) {

        // criando contas de exemplo
        Conta contaBancoA = new Conta("Cliente A", "001", 1000);
        Conta contaBancoB = new Conta("Cliente B", "002", 2000);

        // banco A
        Banco_A bancoA = new Banco_A();
        bancoA.manutencaoConta(contaBancoA);

        bancoA.deposito(contaBancoA, 500);
        bancoA.saque(contaBancoA, 300);
        bancoA.transferencia(contaBancoA, contaBancoB, 400);

        bancoA.extrato(contaBancoA);
        System.out.println(" **************************** ");

        // banco B
        BancoB bancoB = new BancoB();
        bancoB.manutencaoConta(contaBancoB);

        bancoB.deposito(contaBancoB, 1000);
        bancoB.saque(contaBancoB, 1500);
        bancoB.transferencia(contaBancoB, contaBancoA, 800);

        bancoB.extrato(contaBancoB);
    }
}

