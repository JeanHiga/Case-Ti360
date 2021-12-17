package com.example.ti360.college.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket configuration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.example.ti360.college"))
                .build()
                .apiInfo(infoApi());
    }

    private ApiInfo infoApi() {
        return new ApiInfoBuilder()
                .title("Case Back End - TI 360")
                .description("Feature - Alteração de Dados Cadastrais - Alunos da Faculdade")
                .version("1.0.0")
                .build();
    }
}
