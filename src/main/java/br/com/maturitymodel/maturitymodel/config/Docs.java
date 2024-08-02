package br.com.maturitymodel.maturitymodel.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Docs {

    @Bean
    public OpenAPI custon (){
        String titulo = "Maturity Model";
        String version = "0.0.1";

        return new OpenAPI().info(new Info().title(titulo).version(version));
    }
}
