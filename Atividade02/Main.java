package Atividade02Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException{
		Genero assassinooo = new Genero(1, "Assassinooo");
		Genero lovezinho = new Genero(2, "Lovezinho");
		Genero dramatico = new Genero(3, "Dramatico");
		Genero chamadoaberto = new Genero(4, "Chamado Aberto");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date datapublicacao = formato.parse("23/12/2000");
		Date datapublicacao2 = formato.parse("25/01/2023");
		Date datapublicacao3 = formato.parse("12/05/2018");
		Date datapublicacao4 = formato.parse("16/09/2020");
		Date datapublicacao5 = formato.parse("23/06/2022");
		Date datapublicacao6 = formato.parse("30/02/2005");
		Date datapublicacao7 = formato.parse("21/04/2008");
		Date datapublicacao8 = formato.parse("05/02/2010");
		Date datapublicacao9 = formato.parse("09/03/2001");
		Date datapublicacao10 = formato.parse("15/10/1995");
		
		List<Livro> livros = new ArrayList<Livro>();
		Livro naosejaum = new Livro(1, "Não seja um assassino", "Tony da Gatorra", datapublicacao, assassinooo.getNome());
		livros.add(naosejaum);
		
		Livro musicadan = new Livro(2, "Musicas do Daniel", "Daniel", datapublicacao2, assassinooo.getNome());
		livros.add(musicadan);
		
		Livro cinquenta = new Livro(3, "Avelã e o balão azul bombom", "Rogerinho", datapublicacao3, lovezinho.getNome());
		livros.add(cinquenta);
		
		Livro escuros = new Livro(4, "51 meninos de azul escuro", "Ramom", datapublicacao4, lovezinho.getNome());
		livros.add(escuros);
		
		Livro paoevinho = new Livro(5, "Pão e Vinho", "Igor o Jovem", datapublicacao5, dramatico.getNome());
		livros.add(paoevinho);
		
		Livro orgulhoeopato = new Livro(6, "Orgulho e o Pato Magico", "Samuca o Grande", datapublicacao6, dramatico.getNome());
		livros.add(orgulhoeopato);
		
		Livro pequenocubo = new Livro(7, "O pequeno cubo", "Natalia a ruiva", datapublicacao7, dramatico.getNome());
		livros.add(pequenocubo);
		
		Livro caixafeia = new Livro(8, "A caixa feia dos olhos escuros", "Rodrigo o Grande", datapublicacao8, chamadoaberto.getNome());
		livros.add(caixafeia);
		
		Livro vidaanao = new Livro(9, "A Vida alegre dos anões", "Fran", datapublicacao9, chamadoaberto.getNome());
		livros.add(vidaanao);
		
		Livro transacareca = new Livro(10, "A Transa dos carecas", "Daniel", datapublicacao10, chamadoaberto.getNome());
		livros.add(transacareca);
		
		for (Livro livro : livros) {
			System.out.println(livro);	
		}
	}

}
