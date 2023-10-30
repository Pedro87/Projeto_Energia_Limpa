package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository vendedorRepository;

	public void incluir(Vendedor vendedor) {
		vendedorRepository.save(vendedor);
	}

	public Collection<Vendedor> obterLista(){
		return (Collection<Vendedor>) vendedorRepository.findAll();
	}
}
