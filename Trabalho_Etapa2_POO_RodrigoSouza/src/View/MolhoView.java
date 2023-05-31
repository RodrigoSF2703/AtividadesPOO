package View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.MolhoController;
import Model.Molho;

public class MolhoView {
    private JFrame frame;
    private MolhoController molhoController;
    
    public MolhoView(MolhoController molhoController) {
        this.molhoController = molhoController;
    }
    public MolhoView() {
        molhoController = new MolhoController();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Molho");
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

        JButton btnAdicionarMolho = new JButton("Adicionar Molho");
        btnAdicionarMolho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textFieldId.getText();
                String nome = textFieldNome.getText();
                double valor = Double.parseDouble(textFieldValor.getText());

                Molho molho = new Molho(id, nome, valor);
                molhoController.adicionarMolho(molho);

                // Limpar os campos de texto após adicionar o molho
                textFieldId.setText("");
                textFieldNome.setText("");
                textFieldValor.setText("");
            }
        });
        panel.add(btnAdicionarMolho);

        frame.setVisible(true);
    }
}
