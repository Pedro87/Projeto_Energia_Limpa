package pedro.deus.al.infnet.AppEnergyFree.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.deus.al.infnet.AppEnergyFree.clients.IInformacaoClient;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Informacao;

import java.util.List;

@Service
public class InformacaoService {

    @Autowired
    private IInformacaoClient informacaoClient;

    public List<Informacao> obterLista(){
        return informacaoClient.obterLista();
    }

    public Informacao incluir(Informacao informacao) {
        return informacaoClient.incluir(informacao);
    }
}