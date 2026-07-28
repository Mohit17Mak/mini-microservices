package com.campus.course_service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String QUEUE = "enrollment-events";

    @Bean
    public Queue enrollmentQueue() {
        return new Queue(QUEUE, true);   // durable: survives a broker restart
    }

    @Bean
    public JacksonJsonMessageConverter converter() {
        return new JacksonJsonMessageConverter();  // send messages as JSON
    }
}