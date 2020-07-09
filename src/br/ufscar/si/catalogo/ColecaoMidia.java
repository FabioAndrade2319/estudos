package br.ufscar.si.catalogo;

import java.util.Collection;

public interface ColecaoMidia {
	Collection<Midia> colecao();
	Collection<Midia> colecaoPorTipo(int tipo); 

}

