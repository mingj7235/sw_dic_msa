package com.example.swuserservice.entity;

import com.example.swuserservice.dto.request.UserRequestDto;
import com.example.swuserservice.global.base.BaseTime;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter (AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@RequiredArgsConstructor
public class UserEntity extends BaseTime {

    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false, unique = true)
    private String email;

    @Column (nullable = false, unique = true)
    private String nickname;

    @Column (nullable = false, unique = true)
    private String userId;

    @Column (nullable = false, unique = true)
    private String encryptedPwd;

    public static UserEntity toEntity(final @NotNull UserRequestDto.Register request,
                                      final @NotBlank String encryptedPwd) {
        return UserEntity.builder()
                .email(request.getEmail())
                .nickname(request.getNickname())
                .userId(UUID.randomUUID().toString())
                .encryptedPwd(encryptedPwd)
                .build();

    }
}
