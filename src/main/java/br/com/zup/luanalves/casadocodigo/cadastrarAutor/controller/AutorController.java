package br.com.zup.luanalves.casadocodigo.cadastrarAutor.controller;

import br.com.zup.luanalves.casadocodigo.cadastrarAutor.dto.AutorDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {

    @PostMapping(value = "/cadastrar")
    @ResponseBody
    public String cadastrarAutor(@RequestBody @Valid AutorDto autorDto){
        return "criando autores...";
    }
}
