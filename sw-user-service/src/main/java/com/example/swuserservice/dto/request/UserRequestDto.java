package com.example.swuserservice.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Register {

        @NotNull(message = "Email cannot be null")
        @Size(min = 2, message = "Email not be less than 2 characters")
        @Email
        private String email;

        @NotNull (message = "Name cannot be null")
        @Size (min = 2, message = "Name not be less than 2 characters")
        private String nickname;

        @NotNull (message = "Password cannot be null")
        @Size (min = 8, message = "Password not be less than 8 characters")
        private String password;
    }

}

