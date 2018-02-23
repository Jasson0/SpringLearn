package com.leon.spring.javaconfig;

import com.leon.spring.dilearn.SpellChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leon on 2018/2/9.
 */
@Configuration
public class HelloWorldConfig2 {
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
