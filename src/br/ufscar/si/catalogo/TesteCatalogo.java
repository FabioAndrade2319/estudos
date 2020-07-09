package br.ufscar.si.catalogo;

import java.util.Collections;


public class TesteCatalogo {


	public static void main(String[] args) {
		
		CD cdTeste1 = new CD("Teste1", "2012","Artista de Teste1");
		CD cdTeste2 = new CD("Teste2", "2011","Artista de Teste2");
		
		cdTeste1.adicionaFaixa("A lua", 230);
		cdTeste1.adicionaFaixa("O sol", 120);
		cdTeste2.adicionaFaixa("O dia", 150);
		cdTeste2.adicionaFaixa("A tarde",300);
		
		
		DVD dvd1 = new DVD("Primeiro DVD","2014","Spielberg");
		DVD dvd2 = new DVD("Segundo DVD","2015","Scorcese");
		
		
		dvd1.adicionaArtista("Russel Crowe", "Maximus");
		dvd1.adicionaArtista("Lima Duarte", "Guarda Pretoriano");
		
		dvd2.adicionaArtista("Tom Cruise", "Ethan Hawk");
		dvd2.adicionaArtista("Rodrigo Santoro", "Xerxes");
		
		Jogo jogo1 = new Jogo("Need for Speed", "2010","Ação");

		
		Catalogo cat1 = new Catalogo();
		cat1.adicionaMidia(dvd1);
		cat1.adicionaMidia(cdTeste1);
		cat1.adicionaMidia(dvd2);
		cat1.adicionaMidia(cdTeste2);
		cat1.adicionaMidia(jogo1);
		
		cat1.imprimeColecao();
		
		System.out.println();
		
		System.out.println("Após classificação: ------------------");
		
		Collections.sort((cat1.midias));
		
		cat1.imprimeColecao();
		
//		Collection<Midia> cat1CDs = new ArrayList<Midia>();
//		cat1CDs = cat1.colecaoPorTipo(1);
//		for(Midia cd : cat1CDs){
//			cd.imprimeFicha();
//			System.out.println();
//		}
//		
		
		
		
	}

}
