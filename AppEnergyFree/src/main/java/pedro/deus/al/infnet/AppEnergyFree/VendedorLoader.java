package pedro.deus.al.infnet.AppEnergyFree;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Endereco;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;
import pedro.deus.al.infnet.AppEnergyFree.model.service.VendedorService;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(1)
@Component 
public class VendedorLoader implements ApplicationRunner {

	@Autowired
	private VendedorService vendedorService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/vendedor.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while(linha != null) {

			campos = linha.split(";");

			Vendedor vendedor = new Vendedor();

			vendedor.setNome(campos[0]);
			vendedor.setCpf(campos[1]);
			vendedor.setEmail(campos[2]);
			vendedor.setEndereco(new Endereco(campos[3]));

			try {
				vendedorService.incluir(vendedor);
			} catch (ConstraintViolationException e) {
				FileLogger.logException("[VENDEDOR] " + vendedor + " - " + e.getMessage());
			}

			linha = leitura.readLine();
		}

		for(Vendedor vendedor: vendedorService.obterLista()) {
			System.out.println("[Vendedor] " + vendedor);
		}

		leitura.close();
	}
	
}
