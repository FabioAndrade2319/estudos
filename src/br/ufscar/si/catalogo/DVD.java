package br.ufscar.si.catalogo;

public class DVD extends Midia{
	
	String diretor;
	Ator[] atores = new Ator[5];
	int tipo = 2;

	
	DVD(String titulo, String ano, String dir) {
		super(titulo, ano);
		this.diretor = dir;
		for(int i = 0;i < 5;i++){
			Ator at = new Ator();
			this.atores[i] = at;
		}
	}
	
	int getTipo(){
		return(this.tipo);
	}
	
	void adicionaArtista(String art,String papel){
		int n = 0;
		while(n < 5){
			if(this.atores[n].artista.equals("vazio")){
				break;
			}else{
				n++;
			}
		}
		if(n <= 4){
			this.atores[n].artista = art;
			this.atores[n].papel = papel;
		}else{
			System.out.println("Numero máximo atingido!");
		}
	}
	
	void imprimeFicha(){
		super.imprimeFicha();
		System.out.println("Tipo: Filme em DVD");
		System.out.println("Diretor: " + this.diretor);
		for(int i = 0;i < 5;i++){
			if(this.atores[i].artista.equals("vazio"))
				break;
			else{
				System.out.println("Artista " + (i+1) + ": " + 
						this.atores[i].artista + ", papel: " +
						this.atores[i].papel);
			}
		}
	}
	
}
