package com.codegate.aula2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class EmpregoController {

    @Autowired // diz ao compilador que estamos instanciando diretamente do repo, ajuda a escrever menos coisa
    EmpregoRepository empregoRepository;



    @RequestMapping("/")
    public String listaEmpregos(Model model) {
        model.addAttribute("empregos", empregoRepository.findAll());
        return "lista";
    }

    @GetMapping("/add") // Pegar a informação do form
    public String empregoForm(Model model){ // Cria um novo objeto da classe emprego, ou seja, um novo emprego
        model.addAttribute("emprego", new Emprego());
        return "empregoForm";
    }

    @PostMapping("/process")
    public String processForm(@Valid Emprego emprego, BindingResult result) { // @Valid: Se o emprego for válido, vai adicionar à base de dados. BindingResult é para saber se está tudo bem
        if(result.hasErrors()){
            return "empregoForm";
        }
        empregoRepository.save(emprego); // Salva o emprego no repositório
        return "redirect:/";
    }
}
