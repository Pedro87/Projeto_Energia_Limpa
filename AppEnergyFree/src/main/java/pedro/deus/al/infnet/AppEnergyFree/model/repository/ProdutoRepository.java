package pedro.deus.al.infnet.AppEnergyFree.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Produto;
@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Integer > {
}
