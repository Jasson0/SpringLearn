package com.leon.spring.dilearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leon on 2018/2/9.
 */
@Configuration
public class SpringConfig {
    @Bean
    public TextEditor TextEditor() {
        return TextEditor();
    }

    @Bean
    public SpellChecker SpellChecker() {
        return SpellChecker();
    }
}
