package br.com.catolica.demo_thymeleaf.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi apiDocumentation() {
        return GroupedOpenApi.builder()
                .group("Produtos API")
                .pathsToMatch("/api/**") // somente rotas REST
                .build();
    }
}