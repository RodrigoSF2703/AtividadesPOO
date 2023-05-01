package View;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadLivroView extends JFrame{
	JLabel tela;
	JTextField id, nome, autor, data;
	JButton botao;
	
	public CadLivroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idLivro = new JLabel("ID do Livro:");
	    id = new JTextField(10);
	    JLabel nomeLivro = new JLabel("Nome do Livro:");
	    nome = new JTextField(40);
	    JLabel autorLivro = new JLabel("Autor:");
	    autor = new JTextField(60);
	    JLabel dataLivro = new JLabel("Data de publicacão:");
	    data = new JTextField(20);
	    botao = new JButton("Cadastrar");

	    add(idLivro);
	    add(id);
	    add(nomeLivro);
	    add(nome);
	    add(autorLivro);
	    add(autor);
	    add(dataLivro);
	    add(data);
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
	
	public String getAutor() {
		return autor.getText();
	}
	
	public String getData() {
		return data.getText();
	}
}
