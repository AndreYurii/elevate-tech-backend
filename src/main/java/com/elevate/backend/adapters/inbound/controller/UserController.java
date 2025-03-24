package com.elevate.backend.adapters.inbound.controller;

import com.elevate.backend.application.dtos.UserRequestDTO;
import com.elevate.backend.application.mappers.UserMapper;
import com.elevate.backend.core.domain.User;
import com.elevate.backend.core.usecases.CreateUserUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody UserRequestDTO request) {
        User user = UserMapper.toDomain(request);
        return createUserUseCase.execute(user);
    }
}
