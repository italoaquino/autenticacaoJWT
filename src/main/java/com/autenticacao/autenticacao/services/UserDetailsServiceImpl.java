package com.autenticacao.autenticacao.services;

import com.autenticacao.autenticacao.enums.Perfil;
import com.autenticacao.autenticacao.model.UsuarioModel;
import com.autenticacao.autenticacao.repositories.UsuarioRepository;
import com.autenticacao.autenticacao.security.UserSS;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        Optional<UsuarioModel> user = Optional.ofNullable(usuarioRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado!")));

        return new UserSS(user.get().getId(), user.get().getSenha(), user.get().getNome(), user.get().getPerfis());
    }


}
