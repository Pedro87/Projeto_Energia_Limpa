package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Produto;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void incluir(Produto produto) {
		produtoRepository.save(produto);
	}

	public Collection<Produto> obterLista() {
		return (Collection<Produto>) produtoRepository.findAll();
	}

	public Collection<Produto> obterLista(Vendedor vendedor) {
		return (Collection<Produto>) produtoRepository.obterLista(vendedor.getId());
	}

	public Collection<Produto> obterLista(Integer id) {
		return (Collection<Produto>) produtoRepository.obterLista(id);
	}

	public long obterQtde() {
		return produtoRepository.count();
	}

}
