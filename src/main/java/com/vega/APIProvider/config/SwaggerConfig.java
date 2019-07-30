package com.vega.APIProvider.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {



    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String DEFAULT_INCLUDE_PATTERN = "/v1/.*";

    @Bean
    public Docket customDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex(DEFAULT_INCLUDE_PATTERN))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .apiInfo(apiInfo())
                .securitySchemes(Lists.newArrayList(apiKey()));

    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SellerCenterProviderAPI")
                .description("PROVIDER API for SellerCenter Application")
                .license("@CopyRight VEGANET 2019")
                .licenseUrl("http://www.veganet.com.tn/")
                .termsOfServiceUrl("")
                .version("OtnApi v1")
                .contact(new Contact("","", ""))
                .build();
    }


    private ApiKey apiKey() {
        return new ApiKey("Bearer", AUTHORIZATION_HEADER, "header");
    }
	
}
