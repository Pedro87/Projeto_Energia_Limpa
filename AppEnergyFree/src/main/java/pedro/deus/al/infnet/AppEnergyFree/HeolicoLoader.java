package pedro.deus.al.infnet.AppEnergyFree;

import java.io.BufferedReader;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Heolica;
import pedro.deus.al.infnet.AppEnergyFree.model.service.HeolicoService;

@Order(3)
@Component
public class HeolicoLoader implements ApplicationRunner {

	@Autowired
	private HeolicoService heolicoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/eletronico.txt");		
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;
				
		while(linha != null) {
			
			campos = linha.split(";");
			
			Heolica heolico = new Heolica();
			
			heolico.setCodigo(Integer.valueOf(campos[0]));
			heolico.setDescricao(campos[1]);
			heolico.setEstoque(Boolean.valueOf(campos[2]));
			heolico.setPreco(Float.valueOf(campos[3]));
			heolico.setWats(Float.valueOf(campos[4]));
			heolico.setTempoDeInstalacao(Integer.valueOf(campos[5]));
			
			heolicoService.incluir(heolico);
			
			linha = leitura.readLine();
		}

		for(Heolica heolico : heolicoService.obterLista()) {
			System.out.println("[Heolica] " + heolico);
		}
		
		leitura.close();
	}

}
