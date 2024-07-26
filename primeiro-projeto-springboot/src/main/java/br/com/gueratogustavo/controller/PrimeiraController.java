package br.com.gueratogustavo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController") /* spring boot procura isso para fazer a rota ou a controller */
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "o Parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
        return "o paramentro com metodoComQueryParams é" + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "o paramentro com metodoComQueryParams é" + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams" + usuario.username();
    }

    record Usuario(String username) {
    }

}
