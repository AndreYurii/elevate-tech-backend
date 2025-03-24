package com.elevate.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.elevate.backend")
public class ElevateTechBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElevateTechBackendApplication.class, args);
    }
}
