package com.elevate.backend.core.usecases.ports;

import com.elevate.backend.core.domain.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findByEmail(String email);
}
