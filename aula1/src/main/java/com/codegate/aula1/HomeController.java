package com.codegate.aula1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // diz ao compilador que existe uma lista de caminhos no arquivo que o usuário navegará
public class HomeController {

    @RequestMapping("/") // Ponto de entrada que vai retornar o index. Faz o mapa do get
    public String homeApp(Model model){ // Modelo da página padrão MVC
        model.addAttribute("mensagem", "esta foi uma mensagem injetada através do modelo");
        return "index";
    }
}
