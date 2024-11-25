package com.react.toy.login.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginRequestDto {

    @NotEmpty(message = "이메일 주소가 비어있습니다.")
    String email;

    @NotEmpty(message =  "비밀번호가 비어있습니다.")
    String password;
}
