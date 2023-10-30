package pedro.deus.al.infnet.AppEnergyFree.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Heolica;
@Repository
public interface HeolicaRepository extends CrudRepository<Heolica, Integer> {
}
