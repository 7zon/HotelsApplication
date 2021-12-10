package com.karina.hotelsapplication.remote.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
        @Bean
        public Docket productApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.karina.hotelsapplication"))
                    .build()
                    .useDefaultResponseMessages(false)
                    .ignoredParameterTypes()
                    .apiInfo(new ApiInfo("Pizza information", "","","",new Contact("","","")
                            ,"","", Collections.emptyList()));

        }
    }

