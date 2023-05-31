package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Controller.PedidoController;
import Model.Pedido;
import Model.Prato;

public class PedidoView {
    private JFrame frame;
    private PedidoController pedidoController;

    public PedidoView(PedidoController pedidoController) {
        this.pedidoController = pedidoController;
    }
    public PedidoView() {
        pedidoController = new PedidoController();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Pedido");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 1, 0, 10));

        JLabel lblPedidoId = new JLabel("ID do Pedido:");
        panel.add(lblPedidoId);

        JTextField textFieldId = new JTextField();
        panel.add(textFieldId);
        textFieldId.setColumns(10);

        JButton btnAdicionarPedido = new JButton("Adicionar Pedido");
        btnAdicionarPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String idPedidoStr = textFieldId.getText();
                int idPedido = Integer.parseInt(idPedidoStr);

                // Aqui você pode criar o objeto Pedido com os dados fornecidos
                Pedido pedido = new Pedido(idPedido, "", "", 0.0);
                pedidoController.adicionarPedido(pedido);

                // Limpar o campo de texto após adicionar o pedido
                textFieldId.setText("");
            }
        });
        panel.add(btnAdicionarPedido);

        frame.setVisible(true);
    }
}