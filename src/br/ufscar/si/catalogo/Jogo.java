package br.ufscar.si.catalogo;

public class Jogo extends Midia{
	
	String genero;
	int tipo = 3;

	Jogo(String titulo, String ano, String gen) {
		super(titulo, ano);
		this.genero = gen;
	}

	int getTipo() {
		return 3;
	}
	
	void imprimeFicha(){
		super.imprimeFicha();
		System.out.println("Tipo: Jogo Eletrônico");
		System.out.println("Gênero: " + this.genero);
	}
	

}
