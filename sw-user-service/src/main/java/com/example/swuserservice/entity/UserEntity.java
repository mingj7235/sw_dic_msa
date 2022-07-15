package com.example.swuserservice.entity;

import com.example.swuserservice.global.base.BaseTime;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter (AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseTime {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String name;

    private String nickname;

    private String userId;

    private String encryptedPwd;
}
