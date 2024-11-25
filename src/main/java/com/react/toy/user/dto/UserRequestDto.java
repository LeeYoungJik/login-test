package com.react.toy.user.dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequestDto {

        @NotEmpty(message = "email is empty")
        private String email;

        @NotEmpty( message = "passord is empty")
        private String password;

}
