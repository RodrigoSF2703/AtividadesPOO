package View;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadGatoView extends JFrame {
	JLabel tela; 
	JTextField id, nome, idade, raca, cor, sexo, porte, peso;
	JButton botao;
	
	public CadGatoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idGato = new JLabel("ID do Gato:");
	    id = new JTextField(10);
	    JLabel nomeGato = new JLabel("Nome:");
	    nome = new JTextField(40);
	    JLabel idadeGato = new JLabel("Idade:");
	    idade = new JTextField(40);
	    JLabel racaGato = new JLabel("Raça:");
	    raca = new JTextField(40);	    
	    JLabel corGato = new JLabel("Cor:");
	    cor = new JTextField(40);
	    JLabel sexoGato = new JLabel("Sexo:");
	    sexo = new JTextField(40);
	    JLabel porteGato = new JLabel("pORTE:");
	    porte = new JTextField(40);
	    JLabel pesoGato = new JLabel("Peso:");
	    peso = new JTextField(40);
	    botao = new JButton("Cadastrar");
		    
	    add(idGato);
	    add(id);
	    add(nomeGato);
	    add(nome);
	    add(idadeGato);
	    add(idade);
	    add(racaGato);
	    add(raca);	    
	    add(corGato);
	    add(cor);
	    add(sexoGato);
	    add(sexo);
	    add(porteGato);
	    add(porte);
	    add(pesoGato);
	    add(peso);   
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
	public String getIdade() {
		return idade.getText();
	}
	public void setIdade(JTextField idade) {
		this.idade = idade;
	}
	public JTextField getRaca() {
		return raca;
	}
	public void setRaca(JTextField raca) {
		this.raca = raca;
	}
	public JTextField getCor() {
		return cor;
	}
	public void setCor(JTextField cor) {
		this.cor = cor;
	}
	public String getSexo() {
		return sexo.getText();
	}
	public void setSexo(JTextField sexo) {
		this.sexo = sexo;
	}
	public String getPorte() {
		return porte.getText();
	}
	public void setPorte(JTextField porte) {
		this.porte = porte;
	}
	public String getPeso() {
		return peso.getText();
	}
	public void setPeso(JTextField peso) {
		this.peso = peso;
	}
	public void setId(JTextField id) {
		this.id = id;
	}
	public void setNome(JTextField nome) {
		this.nome = nome;
	}

}
