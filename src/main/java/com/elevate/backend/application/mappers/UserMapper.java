package com.elevate.backend.application.mappers;

import com.elevate.backend.application.dtos.UserRequestDTO;
import com.elevate.backend.core.domain.User;

public class UserMapper {
    public static User toDomain(UserRequestDTO dto) {
        return new User(dto.name(), dto.email());
    }
}
