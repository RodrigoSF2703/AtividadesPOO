package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Borda;
import Controller.BordaController;

public class BordaView extends JFrame {
    private BordaController bordaController;

    private JTextArea bordaTextArea;
    private JButton addButton;
    private JButton removeButton;

    public BordaView(BordaController bordaController) {
        this.bordaController = bordaController;

        // Configurações da janela
        setTitle("Lista de Bordas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Configurações do painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel);

        // Configurações da área de texto
        bordaTextArea = new JTextArea();
        bordaTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(bordaTextArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Configurações dos botões
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Adicionar Borda");
        removeButton = new JButton("Remover Borda");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Configuração dos listeners dos botões
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarBorda();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerBorda();
            }
        });

        // Atualiza a área de texto com os detalhes das bordas
        atualizarDetalhesBorda();

        // Exibe a janela
        setVisible(true);
    }

    private void atualizarDetalhesBorda() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Borda borda : bordaController.getBordas()) {
            stringBuilder.append("Nome: ").append(borda.getNome()).append("\n");
            stringBuilder.append("Valor: ").append(borda.getValor()).append("\n");
            stringBuilder.append("Recheio: ").append(borda.getRecheio()).append("\n");
            stringBuilder.append("\n");
        }
        bordaTextArea.setText(stringBuilder.toString());
    }

    private void adicionarBorda() {
        String nome = JOptionPane.showInputDialog("Digite o nome da borda:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da borda:"));
        String recheio = JOptionPane.showInputDialog("Digite o recheio da borda:");

        Borda borda = new Borda(nome, valor, recheio);
        bordaController.adicionarBorda(borda);

        atualizarDetalhesBorda();
    }

    private void removerBorda() {
        String nome = JOptionPane.showInputDialog("Digite o nome da borda a ser removida:");
        Borda borda = bordaController.encontrarBordaPorNome(nome);

        if (borda != null) {
            bordaController.removerBorda(borda);
            atualizarDetalhesBorda();
        } else {
            JOptionPane.showMessageDialog(this, "Borda não encontrada");
        }
    }
}