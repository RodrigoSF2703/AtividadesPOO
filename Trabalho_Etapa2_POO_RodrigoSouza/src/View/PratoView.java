package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import Model.Prato;
import Controller.PratoController;

public class PratoView extends JFrame {
    private PratoController pratoController;

    private JTextArea pratoTextArea;
    private JButton addButton;
    private JButton removeButton;

    public PratoView(PratoController pratoController) {
        this.pratoController = pratoController;

        // Configurações da janela
        setTitle("Lista de Pratos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Configurações do painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel);

        // Configurações da área de texto
        pratoTextArea = new JTextArea();
        pratoTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(pratoTextArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Configurações dos botões
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Adicionar Prato");
        removeButton = new JButton("Remover Prato");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Configuração dos listeners dos botões
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarPrato();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerPrato();
            }
        });

        // Atualiza a área de texto com os detalhes dos pratos
        atualizarDetalhesPrato();

        // Exibe a janela
        setVisible(true);
    }

    private void atualizarDetalhesPrato() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Prato prato : pratoController.getPratos()) {
            stringBuilder.append("ID: ").append(prato.getId()).append("\n");
            stringBuilder.append("Nome: ").append(prato.getNome()).append("\n");
            stringBuilder.append("Preço de Venda: ").append(prato.getPrecoVenda()).append("\n");
            stringBuilder.append("Peso: ").append(prato.getPeso()).append("\n");
            stringBuilder.append("Data de Validade: ").append(prato.getDataValida()).append("\n");
            stringBuilder.append("\n");
        }
        pratoTextArea.setText(stringBuilder.toString());
    }

    private void adicionarPrato() {
        String id = JOptionPane.showInputDialog("Digite o ID do prato:");
        String nome = JOptionPane.showInputDialog("Digite o nome do prato:");
        double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda do prato:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do prato:"));
        // Supondo que a data seja inserida no formato "dd/MM/yyyy"
        String dataValidaString = JOptionPane.showInputDialog("Digite a data de validade do prato (dd/MM/yyyy):");
        // Convertendo a String para um objeto Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataValida = null;
        try {
            dataValida = dateFormat.parse(dataValidaString);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data de validade inválida");
            return;
        }

        Prato prato = new Prato(id, nome, precoVenda, dataValida, peso);
        pratoController.adicionarPrato(prato);
        atualizarDetalhesPrato();
    }

    private void removerPrato() {
        String id = JOptionPane.showInputDialog("Digite o ID do prato que deseja remover:");
        Prato prato = pratoController.encontrarPratoPorId(id);
        if (prato != null) {
            pratoController.removerPrato(prato);
            atualizarDetalhesPrato();
        } else {
            JOptionPane.showMessageDialog(this, "Prato não encontrado");
        }
    }
}