package org.java.personal.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MessageServiceForDummySocmedApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MessageServiceForDummySocmedApplication.class);
    }

    public static void main(String[] args){
        SpringApplication.run(MessageServiceForDummySocmedApplication.class, args);
    }
}
