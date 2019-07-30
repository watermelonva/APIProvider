package com.vega.APIProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



@ComponentScan
/* Enable JPA Auditing */
@EnableJpaAuditing
@EntityScan(basePackages={"com.easylink.api.model"})
@SpringBootApplication
public class ApiProviderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiProviderApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApiProviderApplication.class);
	}

}
