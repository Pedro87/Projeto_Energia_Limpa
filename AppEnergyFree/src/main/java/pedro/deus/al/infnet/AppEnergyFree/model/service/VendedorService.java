package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;

@Service
public class VendedorService {

	private Map<String, Vendedor> mapaVendedor = new HashMap<String, Vendedor>();

	public void incluir(Vendedor vendedor) {
		mapaVendedor.put(vendedor.getCpf(), vendedor);
	}
	
	public Collection<Vendedor> obterLista(){	
		return mapaVendedor.values();
	}
}
