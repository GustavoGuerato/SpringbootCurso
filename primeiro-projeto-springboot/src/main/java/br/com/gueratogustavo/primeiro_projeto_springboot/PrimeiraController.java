package br.com.gueratogustavo.primeiro_projeto_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController") /* spring boot procura isso para fazer a rota ou a controller */
public class PrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "meu primeiro metodo api rest";
    }

}
