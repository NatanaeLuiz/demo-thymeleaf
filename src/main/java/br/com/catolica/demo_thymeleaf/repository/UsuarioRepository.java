package br.com.catolica.demo_thymeleaf.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.catolica.demo_thymeleaf.model.Usuario;

@Repository
public class UsuarioRepository {

    private final JdbcTemplate jdbcTemplate;

    public UsuarioRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Usuario autenticar(String username, String senha) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM USUARIO WHERE usuario = ? AND senha = ?",
                    (rs, rowNum) -> {
                        Usuario u = new Usuario();
                        u.setId(rs.getLong("id"));
                        u.setUsuario(rs.getString("usuario"));
                        u.setSenha(rs.getString("senha"));
                        System.out.println("retorno : "  + u.toString());
                        return u;
                    }, username, senha);
        } catch (Exception e) {
            return null; // usuário não encontrado
        }
    }
}