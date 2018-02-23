package com.leon.spring.javaconfig;

import com.leon.spring.dilearn.SpellChecker;
import com.leon.spring.dilearn.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by leon on 2018/2/9.
 */
@Configuration
@Import(HelloWorldConfig2.class)
public class HelloWorldConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor( new SpellChecker());
    }
}
