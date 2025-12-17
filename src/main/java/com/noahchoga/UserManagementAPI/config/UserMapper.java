package com.noahchoga.UserManagementAPI.config;

import com.noahchoga.UserManagementAPI.dto.UserDto;
import com.noahchoga.UserManagementAPI.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        return new  UserDto (
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    public User toEntity(UserDto userDto) {
        return new User(
                userDto.id(),
                userDto.name(),
                userDto.name()
        );
    }
}
