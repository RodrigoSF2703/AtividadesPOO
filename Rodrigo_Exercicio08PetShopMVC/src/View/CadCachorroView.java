package View;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadCachorroView extends JFrame {
	JLabel tela; 
	JTextField id, nome, idade, raca, cor, sexo, porte, peso;
	JButton botao;
	
	public CadCachorroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idCachorro = new JLabel("ID do Cachorro:");
	    id = new JTextField(10);
	    JLabel nomeCachorro = new JLabel("Nome:");
	    nome = new JTextField(40);
	    JLabel idadeCachorro = new JLabel("Idade:");
	    idade = new JTextField(40);
	    JLabel racaCachorro = new JLabel("Raça:");
	    raca = new JTextField(40);	    
	    JLabel corCachorro = new JLabel("Cor:");
	    cor = new JTextField(40);
	    JLabel sexoCachorro = new JLabel("Sexo:");
	    sexo = new JTextField(40);
	    JLabel porteCachorro = new JLabel("pORTE:");
	    porte = new JTextField(40);
	    JLabel pesoCachorro = new JLabel("Peso:");
	    peso = new JTextField(40);
	    botao = new JButton("Cadastrar");
		    
	    add(idCachorro);
	    add(id);
	    add(nomeCachorro);
	    add(nome);
	    add(idadeCachorro);
	    add(idade);
	    add(racaCachorro);
	    add(raca);	    
	    add(corCachorro);
	    add(cor);
	    add(sexoCachorro);
	    add(sexo);
	    add(porteCachorro);
	    add(porte);
	    add(pesoCachorro);
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
