package com.lebq.desafioTecnico.api;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerMapping {

    @Bean
    public DozerBeanMapper mapperDozer(){
        return new DozerBeanMapper();
    }
}
