package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.RecheioController;
import Model.Recheio;

public class RecheioView {
    private JFrame frame;
    private RecheioController recheioController;

    public RecheioView(RecheioController recheioController) {
        this.recheioController = recheioController;
    }
    
    public RecheioView() {
        recheioController = new RecheioController();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Recheio");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 2, 0, 10));

        JLabel lblId = new JLabel("ID:");
        panel.add(lblId);

        JTextField textFieldId = new JTextField();
        panel.add(textFieldId);
        textFieldId.setColumns(10);

        JLabel lblNome = new JLabel("Nome:");
        panel.add(lblNome);

        JTextField textFieldNome = new JTextField();
        panel.add(textFieldNome);
        textFieldNome.setColumns(10);

        JLabel lblValor = new JLabel("Valor:");
        panel.add(lblValor);

        JTextField textFieldValor = new JTextField();
        panel.add(textFieldValor);
        textFieldValor.setColumns(10);

        JButton btnAdicionarRecheio = new JButton("Adicionar Recheio");
        btnAdicionarRecheio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textFieldId.getText();
                String nome = textFieldNome.getText();
                double valor = Double.parseDouble(textFieldValor.getText());

                Recheio recheio = new Recheio(id, nome, valor);
                recheioController.adicionarRecheio(recheio);

                // Limpar os campos de texto após adicionar o recheio
                textFieldId.setText("");
                textFieldNome.setText("");
                textFieldValor.setText("");
            }
        });
        panel.add(btnAdicionarRecheio);

        frame.setVisible(true);
    }
}

