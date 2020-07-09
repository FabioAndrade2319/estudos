package br.ufscar.si.catalogo;

public class Ator {
	String artista;
	String papel;
	
	Ator(){
		this.artista = "vazio";
		this.papel = "vazio";
	}
	
	Ator(String art, String role){
		this.artista = art;
		this.papel = role;
	}
}
