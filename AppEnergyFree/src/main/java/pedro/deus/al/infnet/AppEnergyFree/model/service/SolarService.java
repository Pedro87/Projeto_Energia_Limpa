package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Solar;

public class SolarService {
	private Map<Integer, Solar> mapaSolar = new HashMap<Integer, Solar>();

	public void incluir(Solar solar) {
		mapaSolar.put(solar.getCodigo(), solar);
	}
	
	public Collection<Solar> obterLista(){	
		return mapaSolar.values();
	}
}
