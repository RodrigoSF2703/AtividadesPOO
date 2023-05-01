package View;

import java.util.ArrayList;

public class BancoB implements Banco {

    private ArrayList<Conta> contas = new ArrayList<>();

    @Override
    public void manutencaoConta(Conta conta) {
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
                System.out.println("Extrato bancário da conta " + c.getConta());
                System.out.println("Dono da conta: " + c.getDono());
                System.out.println("Saldo atual: R$ " + c.getSaldo());
            }
        }
    }

    public boolean transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        for (Conta c : contas) {
            if (c.getConta().equals(contaOrigem.getConta())) {
                if (c.getSaldo() >= valor && (c.getSaldo() - valor) >= -500) {
                    for (Conta d : contas) {
                        if (d.getConta().equals(contaDestino.getConta())) {
                            c.setSaldo(c.getSaldo() - valor);
                            d.setSaldo(d.getSaldo() + valor);
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}