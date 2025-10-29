package br.com.catolica.demo_thymeleaf.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.catolica.demo_thymeleaf.model.Usuario;
import br.com.catolica.demo_thymeleaf.repository.UsuarioRepository;

@Service
public class LoginService {

    // Login em memória
    private final UsuarioRepository usuarioRepository;

    public LoginService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean validarLogin(String usuario, String senha) {
        Optional<Usuario> user = usuarioRepository.findByUsuarioAndSenha(usuario, senha);
        return user.isPresent();
    }
}
