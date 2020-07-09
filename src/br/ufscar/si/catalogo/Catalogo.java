package br.ufscar.si.catalogo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Catalogo implements ColecaoMidia {
	

	List<Midia> midias;
	
	
	Catalogo(){
		this.midias = new ArrayList<Midia>();
	}
	
	public void adicionaMidia(Midia nome){
		midias.add(nome);
	}
	
	public void imprimeColecao(){
		for(Midia m : midias){
			m.imprimeFicha();
			System.out.println();
		}
	}
	
	
	public Collection<Midia> colecao(){
		return this.midias;
	}
	
	public Collection<Midia> colecaoPorTipo(int tipo){
		ArrayList<Midia> mProc = new ArrayList<Midia>();
		for(Midia m : midias){
			if(m.getTipo() == tipo){
				mProc.add(m);
			}
		}
		return mProc;
	}
		
}
