package br.com.catolica.demo_thymeleaf.service;

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
        System.out.println("usuario: " +  usuario + " senha: " + senha);
        Usuario user = usuarioRepository.autenticar(usuario, senha);
        System.out.println(user.toString());
        return true;
    }
}
