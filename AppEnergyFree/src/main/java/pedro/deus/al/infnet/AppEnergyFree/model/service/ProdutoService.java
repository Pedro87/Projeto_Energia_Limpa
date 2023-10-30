package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;

import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Produto;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public void incluir(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public Collection<Produto> obterLista(){	
		return (Collection<Produto>) produtoRepository.findAll();
	}
}
