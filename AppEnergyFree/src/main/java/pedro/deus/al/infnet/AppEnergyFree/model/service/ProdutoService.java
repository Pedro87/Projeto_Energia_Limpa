package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Produto;

public class ProdutoService {
	private Map<Integer, Produto> mapaProduto = new HashMap<Integer, Produto>();

	public void incluir(Produto produto) {
		mapaProduto.put(produto.getCodigo(), produto);
	}
	
	public Collection<Produto> obterLista(){	
		return mapaProduto.values();
	}
}
