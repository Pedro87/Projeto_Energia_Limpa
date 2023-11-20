package pedro.deus.al.infnet.AppEnergyFree.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Heolica;
import pedro.deus.al.infnet.AppEnergyFree.model.repository.HeolicaRepository;

import java.util.Collection;

@Service
public class HeolicoService {
	@Autowired
	private HeolicaRepository heolicaRepository;

	public void incluir(Heolica heolica) {
		heolicaRepository.save(heolica);
	}

	public Collection<Heolica> obterLista() {
		return (Collection<Heolica>) heolicaRepository.findAll();
	}

	public long obterQtde() {
		return heolicaRepository.count();
	}
}
