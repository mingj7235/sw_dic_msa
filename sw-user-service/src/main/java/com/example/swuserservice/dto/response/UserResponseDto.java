package com.example.swuserservice.dto.response;

import com.example.swuserservice.entity.UserEntity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private String email;

    private String nickname;

    private String userId;

    public static UserResponseDto from(UserEntity register) {
        return null;
    }
}
