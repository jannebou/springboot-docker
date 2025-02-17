package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class. Can be extended to override behaviors.
 */
@SpringBootApplication
public class DemoApplication {
    /**
     * The entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    /**
     * Home endpoint.
     * @return a welcome message
     */
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
