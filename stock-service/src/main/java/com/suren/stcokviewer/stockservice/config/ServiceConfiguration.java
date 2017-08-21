package com.suren.stcokviewer.stockservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Surendirababu Janarthanan on 8/15/2017.
 */
@Configuration
public class ServiceConfiguration {

    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
