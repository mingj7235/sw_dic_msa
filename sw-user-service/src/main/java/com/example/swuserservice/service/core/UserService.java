package com.example.swuserservice.service.core;

import com.example.swuserservice.entity.UserEntity;
import com.example.swuserservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserEntity register(final @NotNull UserEntity entity) {
        // validation logic -> email duplication
        return userRepository.save(entity);
    }

    // 회원 가입


    // 로그인


    // 회원 정보 수정


    // 회원 삭제 (admin 권한)


    // private -> user duplication logic

}
