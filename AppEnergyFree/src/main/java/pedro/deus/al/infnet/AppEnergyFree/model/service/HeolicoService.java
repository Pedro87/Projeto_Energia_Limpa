package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Heolica;


public class HeolicoService {
	private Map<Integer, Heolica> mapaHeolica = new HashMap<Integer, Heolica>();

	public void incluir(Heolica heolica) {
		mapaHeolica.put(heolica.getCodigo(), heolica);
	}
	
	public Collection<Heolica> obterLista(){	
		return mapaHeolica.values();
	}
}
