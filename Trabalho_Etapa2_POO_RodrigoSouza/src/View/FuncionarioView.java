package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Funcionario;
import Controller.FuncionarioController;

public class FuncionarioView extends JFrame {
    private FuncionarioController funcionarioController;

    private JTextArea funcionarioTextArea;
    private JButton addButton;
    private JButton removeButton;

    public FuncionarioView(FuncionarioController funcionarioController) {
        this.funcionarioController = funcionarioController;

        // Configurações da janela
        setTitle("Lista de Funcionários");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Configurações do painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel);

        // Configurações da área de texto
        funcionarioTextArea = new JTextArea();
        funcionarioTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(funcionarioTextArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Configurações dos botões
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Adicionar Funcionário");
        removeButton = new JButton("Remover Funcionário");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Configuração dos listeners dos botões
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarFuncionario();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerFuncionario();
            }
        });

        // Atualiza a área de texto com os detalhes dos funcionários
        atualizarDetalhesFuncionario();

        // Exibe a janela
        setVisible(true);
    }

    private void atualizarDetalhesFuncionario() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Funcionario funcionario : funcionarioController.getFuncionarios()) {
            stringBuilder.append("Código: ").append(funcionario.getCodigo()).append("\n");
            stringBuilder.append("Nome: ").append(funcionario.getNome()).append("\n");
            stringBuilder.append("CPF: ").append(funcionario.getCpf()).append("\n");
            stringBuilder.append("Endereço: ").append(funcionario.getEndereco()).append("\n");
            stringBuilder.append("Salário: ").append(funcionario.getSalario()).append("\n");
            stringBuilder.append("Cargo: ").append(funcionario.getCargo()).append("\n");
            stringBuilder.append("\n");
        }
        funcionarioTextArea.setText(stringBuilder.toString());
    }

    private void adicionarFuncionario() {
        String codigo = JOptionPane.showInputDialog("Digite o código do funcionário:");
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do funcionário:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do funcionário:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário:");

        Funcionario funcionario = new Funcionario(codigo, nome, cpf, endereco, salario, cargo);
        funcionarioController.adicionarFuncionario(funcionario);

        atualizarDetalhesFuncionario();
    }

    private void removerFuncionario() {
        String codigo = JOptionPane.showInputDialog("Digite o código do funcionário a ser removido:");
        Funcionario funcionario = funcionarioController.encontrarFuncionarioPorCodigo(codigo);
        if (funcionario != null) {
            funcionarioController.removerFuncionario(funcionario);
            atualizarDetalhesFuncionario();
        } else {
            JOptionPane.showMessageDialog(this, "Funcionário não encontrado");
        }
    }
}