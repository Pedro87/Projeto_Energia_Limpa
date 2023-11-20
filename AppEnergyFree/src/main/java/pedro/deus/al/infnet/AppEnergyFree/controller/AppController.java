package pedro.deus.al.infnet.AppEnergyFree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pedro.deus.al.infnet.AppEnergyFree.model.service.*;
@Controller
public class AppController {
    @Autowired
    private VendedorService vendedorService;
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private SolarService solarService;
    @Autowired
    private HeolicoService heolicoService;
    @Autowired
    private InformacaoService informacaoService;

    @GetMapping(value = "/")
    public String showHome(Model model) {

        model.addAttribute("informacoes", informacaoService.obterLista());

        model.addAttribute("qtdeVendedor", vendedorService.obterQtde());
        model.addAttribute("qtdeProduto", produtoService.obterQtde());
        model.addAttribute("qtdeHeolico", heolicoService.obterQtde());
        model.addAttribute("qtdeSolar", solarService.obterQtde());

        return "index";
    }

    @GetMapping(value = "/produto/lista")
    public String obterListaProduto(Model model) {

        model.addAttribute("titulo", "Produtos:");
        model.addAttribute("listagem", produtoService.obterLista());

        return showHome(model);
    }

    @GetMapping(value = "/heolico/lista")
    public String obterListaAlimenticio(Model model) {

        model.addAttribute("titulo", "Produtos Alimentícios:");
        model.addAttribute("listagem", heolicoService.obterLista());

        return showHome(model);
    }

    @GetMapping(value = "/solar/lista")
    public String obterListaEletronico(Model model) {

        model.addAttribute("titulo", "Produtos Eletrônicos:");
        model.addAttribute("listagem", solarService.obterLista());

        return showHome(model);
    }
}
