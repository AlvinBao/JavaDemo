package com.hulu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hulu")
public class DIConfiguration {
    @Bean
    public MessageService messageService() {
        return new EmailMessageService();
    }
}
