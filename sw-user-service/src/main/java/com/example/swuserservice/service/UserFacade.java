package com.example.swuserservice.service;

import com.example.swuserservice.dto.request.UserRequestDto;
import com.example.swuserservice.dto.response.UserResponseDto;
import com.example.swuserservice.entity.UserEntity;
import com.example.swuserservice.service.core.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;

    private final BCryptPasswordEncoder encoder;
    public UserResponseDto register(final @NotNull UserRequestDto.Register request) {
        return UserResponseDto.from(
                userService.register(UserEntity.toEntity(request, encoder.encode(request.getPassword())))
        );
    }

    public UserResponseDto findByUserId(final @NotBlank String userId) {
        return null;
    }
}
