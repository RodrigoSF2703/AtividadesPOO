package View;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewP extends JFrame{
	JTextField txt1, txt2;
	JLabel visor;
	JButton botao;
	
	public ViewP(){
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel operador = new JLabel("");
	    txt1 = new JTextField(8);
	    add(txt1);
	    add(operador);
	    txt2 = new JTextField(8);
	    add(txt2);

	    visor = new JLabel(" ");
	    add(visor);

	    botao = new JButton("calcula");
	    add(botao);

	    pack();
	    setVisible(true);
	  }

	  public String getNum1(){
	    return txt1.getText();
	  }
	  public String getNum2(){
	    return txt2.getText();
	  }
	  public void setBotaoBehavior(ActionListener botaoBehavior){
	    botao.addActionListener(botaoBehavior);
	  }

	  public void setVisor(String result){
	    visor.setText(result);
	  }
}
