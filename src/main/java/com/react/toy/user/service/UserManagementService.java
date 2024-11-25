package com.react.toy.user.service;

import com.react.toy.user.entity.ToyUser;
import com.react.toy.user.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserManagementService {

    private final ToyUserService toyUserService;

    //회원가입 서비스
    public Boolean signUpUser(UserRequestDto userRequest){

        if(isEmailExists(userRequest.getEmail()))
            return false;

        ToyUser singUser = toyUserService.save(ToyUser.builder()
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build());

        log.info("sing User email = {}",singUser.getEmail());

        return true;
    }

    public Boolean edituser(UserRequestDto userRequest){
        return true;
    }


    public Boolean deleteUser(UserRequestDto userRequest){
        return true;
    }


    public Boolean isEmailExists(String email){
        return toyUserService.countEmail(email);
    }


}
