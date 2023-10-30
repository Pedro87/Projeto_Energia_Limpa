package pedro.deus.al.infnet.AppEnergyFree;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Solar;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;
import pedro.deus.al.infnet.AppEnergyFree.model.service.SolarService;

@Order(4)
@Component
public class SolarLoader implements ApplicationRunner {

	@Autowired
	private SolarService solarService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/solar.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;
				
		while(linha != null) {
			
			campos = linha.split(";");
			
			Solar solar = new Solar();
			
			solar.setCodigo(Integer.valueOf(campos[0]));
			solar.setDescricao(campos[1]);
			solar.setEstoque(Boolean.valueOf(campos[2]));
			solar.setPreco(Float.valueOf(campos[3]));
			solar.setWats(Float.valueOf(campos[4]));
			solar.setTempoDeInstalacao(Integer.valueOf(campos[5]));
			solar.setPrecisaFundicao(Boolean.valueOf(campos[6]));
			Vendedor vendedor = new Vendedor();
			vendedor.setId(Integer.valueOf(campos[7]));

			solar.setVendedor(vendedor);
			solarService.incluir(solar);
			
			linha = leitura.readLine();
		}

		for(Solar solar : solarService.obterLista()) {
			System.out.println("[Solar] " + solar);
		}
		
		leitura.close();
	}

}
