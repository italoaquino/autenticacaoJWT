package com.autenticacao.autenticacao.services;

import com.autenticacao.autenticacao.enums.Perfil;
import com.autenticacao.autenticacao.model.UsuarioModel;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class DbServices {

    public void instantiateTestDatabase() throws ParseException {

        Set<Integer> perfis = new HashSet<Integer>();
        perfis.add(Perfil.CLIENTE.getCod());


        UsuarioModel usuarioModel = new UsuarioModel();

        /*UsuarioModel user = new UsuarioModel(null, "Lightbase", "lightbase@lightbase.com.br","", true, pe.encode("123456"),perfis);
*/

    }


}
