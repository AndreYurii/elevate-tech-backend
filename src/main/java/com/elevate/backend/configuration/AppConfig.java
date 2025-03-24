package com.elevate.backend.configuration;

import com.elevate.backend.core.usecases.CreateUserUseCase;
import com.elevate.backend.core.usecases.ports.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserRepository userRepository) {
        return new CreateUserUseCase(userRepository);
    }
}
