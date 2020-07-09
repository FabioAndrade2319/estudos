package br.ufscar.si.catalogo;

public abstract class Midia implements Comparable<Midia>{
	String titulo;
	String ano;
	int tipo;
	
	Midia(String titulo, String ano){
		this.titulo = titulo;
		this.ano = ano;
	}
	
	void imprimeFicha(){
		System.out.println("Título: " + this.titulo);
		System.out.println("Ano: " + this.ano);
	}
	
	abstract int getTipo();
	
	public int compareTo(Midia m){
		return this.ano.compareTo(m.ano);
	}
	
		
		
}
