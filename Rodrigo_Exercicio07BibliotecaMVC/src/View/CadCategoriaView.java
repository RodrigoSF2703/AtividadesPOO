package View;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadCategoriaView extends JFrame {
	JLabel tela; 
	JTextField id, nome;
	JButton botao;
	
	public CadCategoriaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idCategoria = new JLabel("ID da Categoria:");
	    id = new JTextField(10);
	    JLabel nomeCategoria = new JLabel("Nome da Categoria:");
	    nome = new JTextField(40);
	    botao = new JButton("Cadastrar");
		    
	    add(idCategoria);
	    add(id);
	    add(nomeCategoria);
	    add(nome);
	    add(botao);
		    
	    pack();
	    
	    setVisible(true);
	}
	public void setBotaoBehavior(ActionListener botaoBehavior){
		botao.addActionListener(botaoBehavior);
	}
	public String getId() {
		return id.getText();
	}
	public String getNome() {
		return nome.getText();
	}
}
