package br.com.sunflowerstore.trabalhotcc.controller;

import br.com.sunflowerstore.trabalhotcc.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by VictorJr on 23/03/2017.
 */
@Controller
public class ProdutosController {

    @RequestMapping("/produtos/novo")
    public String novo(Produto produto) {
        return "produto/CadastroProduto";
    }

    @RequestMapping(value = "/produtos/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Produto produto, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if(result.hasErrors()) {
            return novo(produto);

        }
        redirectAttributes.addFlashAttribute("mensagem", "Produto Salvo com Sucesso");
        System.out.println(">>> codigo: " + produto.getCodigo() + " >>> nome: " + produto.getNome());
        return "redirect:/produtos/novo";
    }
}
