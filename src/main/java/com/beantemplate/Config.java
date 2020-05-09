package com.beantemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.beantemplate")
public class Config {
	
	@Bean
    public Person person(){
        return new Person();
    }

    @Bean
    @Primary
    public Job javaDeveloper(){
        return new Job("Java Developer");
    }

    @Bean
    public Job frontEndDeveloper(){
        return new Job("Front end Developer");
    }

}
