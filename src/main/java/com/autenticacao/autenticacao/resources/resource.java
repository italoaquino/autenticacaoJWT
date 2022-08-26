package com.autenticacao.autenticacao.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class resource {

    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        return "test";
    }


}
