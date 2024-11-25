package com.react.toy.login.controller;

import com.react.toy.login.dto.LoginRequestDto;
import com.react.toy.login.service.LoginService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1")
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    private ResponseEntity<?> login(@RequestBody LoginRequestDto loginDto){
        log.info("v1/login dto email = {}",loginDto.getEmail());
        Boolean loginResult = loginService.login(loginDto.getEmail(), loginDto.getPassword());

        if(loginResult) {
            return ResponseEntity.ok().body(Map.of("message", "true"));
        }
        else{
            return ResponseEntity.badRequest().body(Map.of("message","false"));
        }
    }

}
