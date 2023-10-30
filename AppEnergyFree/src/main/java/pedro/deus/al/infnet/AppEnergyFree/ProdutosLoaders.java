package pedro.deus.al.infnet.AppEnergyFree;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import pedro.deus.al.infnet.AppEnergyFree.model.domain.Heolica;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Produto;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Solar;
import pedro.deus.al.infnet.AppEnergyFree.model.domain.Vendedor;
import pedro.deus.al.infnet.AppEnergyFree.model.service.ProdutoService;

@Order(2)
@Component
public class ProdutosLoaders implements ApplicationRunner {
	
	@Autowired
	private ProdutoService produtoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
			FileReader file = new FileReader("files/produtos.txt");		
			BufferedReader leitura = new BufferedReader(file);
			
			String linha = leitura.readLine();
		
			String[] campos = null;
			Vendedor vendedor = new Vendedor();
			while(linha != null) {
				
				campos = linha.split(";");
				
				switch (campos[7]) {
				case "A":
					Heolica heolico = new Heolica();
					heolico.setCodigo(Integer.valueOf(campos[0]));
					heolico.setDescricao(campos[1]);
					heolico.setEstoque(Boolean.valueOf(campos[2]));
					heolico.setPreco(Float.valueOf(campos[3]));
					heolico.setWats(Float.valueOf(campos[4]));
					heolico.setTempoDeInstalacao(Integer.valueOf(campos[5]));
					vendedor.setId(Integer.valueOf(campos[7]));

					heolico.setVendedor(vendedor);
					produtoService.incluir(heolico);
					
					break;
		
				case "E":
					Solar solar = new Solar();
					solar.setCodigo(Integer.valueOf(campos[0]));
					solar.setDescricao(campos[1]);
					solar.setEstoque(Boolean.valueOf(campos[2]));
					solar.setPreco(Float.valueOf(campos[3]));
					solar.setWats(Float.valueOf(campos[4]));
					solar.setTempoDeInstalacao(Integer.valueOf(campos[5]));
					solar.setPrecisaFundicao(Boolean.valueOf(campos[6]));
					vendedor.setId(Integer.valueOf(campos[7]));

					solar.setVendedor(vendedor);
					produtoService.incluir(solar);
					
					break;
		
				default:
					break;
				}
										
				linha = leitura.readLine();
			}
		
			for(Produto produto: produtoService.obterLista()) {
				System.out.println("[Produto] " + produto);			
			}

			leitura.close();
	}
}
