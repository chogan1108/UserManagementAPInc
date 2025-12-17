package com.noahchoga.UserManagementAPI.dto;

public record UserDto(
        Long id,
        String name,
        String  email
) { }
