// package br.com.catolica.demo_thymeleaf.config;


// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//             .csrf(csrf -> csrf.disable())
//             .headers(headers -> headers.frameOptions(frame -> frame.disable()))
//             .authorizeHttpRequests(auth -> auth
//                 .requestMatchers("/h2-console/**").permitAll()
//                 .anyRequest().authenticated()
//             )
//             // usa o login padrão do Spring (sem página customizada)
//             .formLogin(form -> form.permitAll())
//             .logout(logout -> logout.permitAll());

//         return http.build();
//     }
// }