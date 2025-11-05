// package br.com.catolica.demo_thymeleaf.config;


// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//         http
//             // Desativa o CSRF e frameOptions (necessário pro console H2)
//             .csrf(csrf -> csrf.disable())
//             .headers(headers -> headers.frameOptions(frame -> frame.disable()))

//             // Autoriza tudo (sem autenticação)
//             .authorizeHttpRequests(auth -> auth
//                 .anyRequest().permitAll()
//             )

//             // Desativa completamente qualquer autenticação padrão
//             .formLogin(form -> form.disable())
//             .httpBasic(Customizer.withDefaults()) // isso evita criação do login do user gerado
//             .logout(logout -> logout.disable());

//         return http.build();
//     }
// }