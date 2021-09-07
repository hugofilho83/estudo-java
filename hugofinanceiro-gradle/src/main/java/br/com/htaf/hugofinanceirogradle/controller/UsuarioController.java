package br.com.htaf.hugofinanceirogradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/")
    public String GetMessager(){
        return "Hello Word...";
    }
}
