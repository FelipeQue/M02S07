package br.com.fmt.M02S07.controllers;

import br.com.fmt.M02S07.services.EnderecoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class EnderecoController {

    private EnderecoService enderecoService;



}
