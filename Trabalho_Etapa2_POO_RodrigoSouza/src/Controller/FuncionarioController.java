package Controller;

import Model.Funcionario;
import java.util.ArrayList;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios;

    public FuncionarioController() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public Funcionario encontrarFuncionarioPorCodigo(String codigo) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo().equals(codigo)) {
                return funcionario;
            }
        }
        return null;
    }
}
