package com.beantemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


import org.springframework.context.annotation.ImportResource;

import com.beantemplate.BeanC;

/**
 * @author 
 */
@Configuration
@Import(value={ConfigA.class})
@ImportResource(value={
      "/resources/app-conf-2.xml"
     })
public class ConfigC {
   @Bean
   public BeanC getBeanC() {
      return new BeanC();
   }
}