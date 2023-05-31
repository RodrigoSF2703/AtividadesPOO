package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import Controller.LancheController;
import Model.Lanche;

public class LancheView {
    private JFrame frame;
    private LancheController lancheController;

    public LancheView(LancheController lancheController) {
        this.lancheController = lancheController;
    }
    public LancheView() {
        lancheController = new LancheController();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Lanche");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 2, 0, 10));

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

        JLabel lblPreco = new JLabel("Preço:");
        panel.add(lblPreco);

        JTextField textFieldPreco = new JTextField();
        panel.add(textFieldPreco);
        textFieldPreco.setColumns(10);

        JLabel lblDataValidade = new JLabel("Data de Validade:");
        panel.add(lblDataValidade);

        JTextField textFieldDataValidade = new JTextField();
        panel.add(textFieldDataValidade);
        textFieldDataValidade.setColumns(10);

        JLabel lblPeso = new JLabel("Peso:");
        panel.add(lblPeso);

        JTextField textFieldPeso = new JTextField();
        panel.add(textFieldPeso);
        textFieldPeso.setColumns(10);

        JButton btnAdicionarLanche = new JButton("Adicionar Lanche");
        btnAdicionarLanche.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textFieldId.getText();
                String nome = textFieldNome.getText();
                double preco = Double.parseDouble(textFieldPreco.getText());
                Date dataValidade = parseDate(textFieldDataValidade.getText());
                double peso = Double.parseDouble(textFieldPeso.getText());

                // Obter os valores de pão, recheio e molho conforme necessário

                Lanche lanche = new Lanche(id, nome, preco, dataValidade, peso, "", "", "");
                lancheController.adicionarLanche(lanche);

                // Limpar os campos de texto após adicionar o lanche
                textFieldId.setText("");
                textFieldNome.setText("");
                textFieldPreco.setText("");
                textFieldDataValidade.setText("");
                textFieldPeso.setText("");
            }
        });
        panel.add(btnAdicionarLanche);

        frame.setVisible(true);
    }

    private Date parseDate(String dateString) {
        // Implemente a conversão da string de data para o formato desejado
        return null;
    }
}