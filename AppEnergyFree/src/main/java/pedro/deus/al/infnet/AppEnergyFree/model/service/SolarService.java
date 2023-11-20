package pedro.deus.al.infnet.AppEnergyFree.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Solar;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.SolarRepository;

import java.util.Collection;

@Service
public class SolarService {
	@Autowired
	private SolarRepository solarRepository;

	public void incluir(Solar solar) {
		solarRepository.save(solar);
	}

	public Collection<Solar> obterLista(){
		return (Collection<Solar>) solarRepository.findAll();
	}

	public long obterQtde() {
		return solarRepository.count();
	}
}
