package pedro.deus.al.infnet.AppEnergyFree.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Produto;

import java.util.Collection;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Integer> {
    @Query("from Produto p where p.vendedor.id = :vendedorId")
    Collection<Produto> obterLista(Integer vendedorId);
}
