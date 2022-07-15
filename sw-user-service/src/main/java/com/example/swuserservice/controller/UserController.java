package com.example.swuserservice.controller;

import com.example.swuserservice.dto.request.UserRequestDto;
import com.example.swuserservice.dto.response.UserResponseDto;
import com.example.swuserservice.service.UserFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final Environment env;

    private final UserFacade userFacade;

    @GetMapping ("/health-check")
    public String check () {
        return String.format("It's working. Port : %s", env.getProperty("local.server.port"));
    }

    // 회원가입
    @PostMapping ("/members")
    public ResponseEntity<UserResponseDto> register (final @NotNull UserRequestDto.Register request) {

        return ResponseEntity.ok()
                .body(userFacade.register(request));
    }

    // 멤버 조회
    @GetMapping ("/member/{userId}")
    public ResponseEntity<UserResponseDto> findByUserId (@PathVariable ("userId") String userId) {
        return ResponseEntity.ok()
                .body(userFacade.findByUserId(userId));
    }



    // 회원 정보 수정 (본인 정보 수정)




}
