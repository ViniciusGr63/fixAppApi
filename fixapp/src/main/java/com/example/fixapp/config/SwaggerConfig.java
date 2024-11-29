package com.example.fixapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)  // Usa a versão 2 do Swagger
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.fixapp")) // Define o pacote base da sua API
                .paths(PathSelectors.any()) // Inclui todos os endpoints
                .build();
    }
}
