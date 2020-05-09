package com.beantemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beantemplate.BeanA;

/**
 * @author 
 */
@Configuration
public class ConfigA {
   @Bean
   public BeanA getBeanA(){
      return new BeanA();
   }
}
