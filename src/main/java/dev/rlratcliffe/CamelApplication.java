package dev.rlratcliffe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * This is the application class and main() entry point for a Spring Boot/Camel application.
 *
 * @author Maven Archetype (camel-oas-archetype)
 */
@SpringBootApplication
public class CamelApplication {

    /**
     * When the application is executed, this method is called with a list of arguments, which may be empty.
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CamelApplication.class, args);
    }
}
