package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;

import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Solar;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.SolarRepository;

@Service
public class SolarService {
	private SolarRepository solarRepository;

	public void incluir(Solar solar) {
		solarRepository.save(solar);
	}

	public Collection<Solar> obterLista(){
		return (Collection<Solar>) solarRepository.findAll();
	}
}
