package com.felixlaura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //We need to add Webflux dependency
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
