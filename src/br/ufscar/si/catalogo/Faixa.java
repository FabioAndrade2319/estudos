package br.ufscar.si.catalogo;

public class Faixa {
	String nome;
	int duracao;
	
	Faixa(){
		this.nome = "vazio";
		this.duracao = 0;
	}
	
	Faixa(String nome,int dur){
		this.nome = nome;
		this.duracao = dur;
	}
}
