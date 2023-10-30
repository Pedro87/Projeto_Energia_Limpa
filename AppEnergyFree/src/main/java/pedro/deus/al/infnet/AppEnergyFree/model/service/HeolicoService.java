package pedro.deus.al.infnet.AppEnergyFree.model.service;

import java.util.Collection;


import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Heolica;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.HeolicaRepository;

@Service
public class HeolicoService {
	private HeolicaRepository heolicaRepository;

	public void incluir(Heolica heolica) {
		heolicaRepository.save(heolica);
	}

	public Collection<Heolica> obterLista() {
		return (Collection<Heolica>) heolicaRepository.findAll();
	}
}
