package View;

import java.util.ArrayList;

public class Banco_A implements Banco {

    private ArrayList<Conta> contas = new ArrayList<>();

    @Override
    public void manutencaoConta(Conta conta) {
        for (Conta c : contas) {
            if (c.getConta().equals(conta.getConta())) {
                c.setDono(conta.getDono());
                c.setSaldo(conta.getSaldo());
                return;
            }
        }
        contas.add(conta);
    }

    @Override
    public boolean saque(Conta conta, double valor) {
        for (Conta c : contas) {
            if (c.getConta().equals(conta.getConta())) {
                if (c.getSaldo() >= valor && (c.getSaldo() - valor) >= 0) {
                    c.setSaldo(c.getSaldo() - valor);
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    @Override
    public boolean deposito(Conta conta, double valor) {
        for (Conta c : contas) {
            if (c.getConta().equals(conta.getConta())) {
                c.setSaldo(c.getSaldo() + valor);
                return true;
            }
        }
        return false;
    }

    @Override
    public void extrato(Conta conta) {
        for (Conta c : contas) {
            if (c.getConta().equals(conta.getConta())) {
                System.out.println("Conta: " + c.getConta());
                System.out.println("Dono: " + c.getDono());
                System.out.println("Saldo: " + c.getSaldo());
                return;
            }
        }
    }
    
    public boolean transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        if (saque(contaOrigem, valor)) {
            deposito(contaDestino, valor);
            return true;
        }
        return false;
    }
}