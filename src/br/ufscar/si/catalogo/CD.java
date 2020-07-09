package br.ufscar.si.catalogo;

public class CD extends Midia{
	
	String artista;
	Faixa[] faixas = new Faixa[15];
	int tipo = 1;

	CD(String titulo, String ano, String art) {
		super(titulo, ano);
		this.artista = art;
		//loop inicia 15 posições de faixa com nome vazio e duração 0
		for(int i = 0; i < 15; i++){ 
			Faixa fx = new Faixa();
			this.faixas[i] = fx;
		}
	}
	 
	int getTipo(){
		return(this.tipo);
	}
	
	void adicionaFaixa(String nome,int dur){
		Faixa fx = new Faixa(nome, dur);
		int i = 0;
		while(this.faixas[i].duracao != 0){
			i++;
		}
		if(i < 14){
			this.faixas[i] = fx;
		}else{
			System.out.println("Número máximo de faixas atingido!");
		}
	}
	
	void imprimeFicha(){
		//System.out.println("Título: " + this.titulo);
		//System.out.println("Ano: " + this.ano);
		super.imprimeFicha();
		System.out.println("Tipo: CD de Música");
		System.out.println("Artista: " + this.artista);
		
		//loop para imprimir somente as posições preenchidas
		int i = 0;
		while(this.faixas[i].duracao != 0){
			System.out.println("Faixa " + (i+1) + ": " + this.faixas[i].nome +
					", duração: " + this.faixas[i].duracao);
			i++;
		}
	}
	
	


}
