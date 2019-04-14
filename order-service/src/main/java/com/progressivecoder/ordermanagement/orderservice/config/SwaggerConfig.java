package com.progressivecoder.ordermanagement.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.progressivecoder.ordermanagement"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "Saga Pattern Implementation using Axon and Spring Boot",
                "App to demonstrate Saga Pattern using Axon and Spring Boot",
                "1.0.0",
                "Terms of Service",
                new Contact("Saurabh Dashora", "progressivecoder.com", "coder.progressive@gmail.com"),
                "",
                "",
                Collections.emptyList());
    }

}
