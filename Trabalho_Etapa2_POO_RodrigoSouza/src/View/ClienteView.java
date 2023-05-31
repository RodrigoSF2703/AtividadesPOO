package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Cliente;
import Controller.ClienteController;

public class ClienteView extends JFrame {
    private ClienteController clienteController;

    private JTextArea clienteTextArea;
    private JButton addButton;
    private JButton removeButton;

    public ClienteView(ClienteController clienteController) {
        this.clienteController = clienteController;

        // Configurações da janela
        setTitle("Lista de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Configurações do painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel);

        // Configurações da área de texto
        clienteTextArea = new JTextArea();
        clienteTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(clienteTextArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Configurações dos botões
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Adicionar Cliente");
        removeButton = new JButton("Remover Cliente");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Configuração dos listeners dos botões
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarCliente();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerCliente();
            }
        });

        // Atualiza a área de texto com os detalhes dos clientes
        atualizarDetalhesCliente();

        // Exibe a janela
        setVisible(true);
    }

    private void atualizarDetalhesCliente() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Cliente cliente : clienteController.getClientes()) {
            stringBuilder.append("Código: ").append(cliente.getCodigo()).append("\n");
            stringBuilder.append("Nome: ").append(cliente.getNome()).append("\n");
            stringBuilder.append("CPF: ").append(cliente.getCpf()).append("\n");
            stringBuilder.append("Endereço: ").append(cliente.getEndereco()).append("\n");
            stringBuilder.append("Aniversário: ").append(cliente.getAniversario()).append("\n");
            stringBuilder.append("\n");
        }
        clienteTextArea.setText(stringBuilder.toString());
    }

    private void adicionarCliente() {
        String codigo = JOptionPane.showInputDialog("Digite o código do cliente:");
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");
        String aniversario = JOptionPane.showInputDialog("Digite o aniversário do cliente:");

        Cliente cliente = new Cliente(codigo, nome, cpf, endereco, aniversario);
        clienteController.adicionarCliente(cliente);

        atualizarDetalhesCliente();
    }

    private void removerCliente() {
        String codigo = JOptionPane.showInputDialog("Digite o código do cliente a ser removido:");
        Cliente cliente = clienteController.encontrarClientePorCodigo(codigo);

        if (cliente != null) {
            clienteController.removerCliente(cliente);
            atualizarDetalhesCliente();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
        }
    }
}