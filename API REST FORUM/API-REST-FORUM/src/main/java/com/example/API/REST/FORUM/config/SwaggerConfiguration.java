package com.example.API.REST.FORUM.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfiguration {

    @Bean
    public OpenAPI getOpenAPI(){
        final Info info = new Info()
                .title("MonEtabAPIs")
                .version("0.0.1")
                .description("Theses APIs Mon ETAB endpoints");
        return new OpenAPI().info(info) ;
    }
}
