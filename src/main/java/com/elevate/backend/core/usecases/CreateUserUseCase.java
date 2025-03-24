package com.elevate.backend.core.usecases;

import com.elevate.backend.core.domain.User;
import com.elevate.backend.core.exceptions.InvalidEMailException;
import com.elevate.backend.core.usecases.ports.UserRepository;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user){
        userRepository.findByEmail(user.getEmail()).ifPresent(u -> {
            throw new InvalidEMailException("Email already exists: " + u.getEmail());
        });
        return userRepository.save(user);
    }
}