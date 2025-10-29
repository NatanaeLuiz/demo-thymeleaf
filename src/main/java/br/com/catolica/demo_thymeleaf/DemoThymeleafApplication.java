package br.com.catolica.demo_thymeleaf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.catolica.demo_thymeleaf.model.Usuario;
import br.com.catolica.demo_thymeleaf.repository.UsuarioRepository;

@SpringBootApplication
public class DemoThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoThymeleafApplication.class, args);
	}

	// @Bean
    // public CommandLineRunner initData(UsuarioRepository usuarioRepository) {
    //     return args -> {
    //         if (usuarioRepository.count() == 0) {
    //             Usuario admin = new Usuario("admin", "123");
    //             usuarioRepository.save(admin);
    //             System.out.println("Usuário padrão criado: admin / 123");
    //         }
    //     };
    // }
}
