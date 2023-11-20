package pedro.deus.al.infnet.AppEnergyFree.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.clients.IEnderecoClient;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Endereco;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.VendedorRepository;

import java.util.Collection;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository vendedorRepository;

	@Autowired
	private IEnderecoClient enderecoClient;

	public Vendedor pesquisar(String cpf) {
		return vendedorRepository.findByCpf(cpf);
	}

	public void incluir(Vendedor vendedor) {

		Endereco endereco = enderecoClient.buscarCep(vendedor.getEndereco().getCep());

		vendedor.setEndereco(endereco);

		vendedorRepository.save(vendedor);
	}

	public void excluir(Integer id) {
		vendedorRepository.deleteById(id);
	}

	public Collection<Vendedor> obterLista(){
		return (Collection<Vendedor>) vendedorRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public long obterQtde() {
		return vendedorRepository.count();
	}
}
