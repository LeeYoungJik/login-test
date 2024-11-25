package com.react.toy.login.service;

import com.react.toy.user.entity.ToyUser;
import com.react.toy.user.service.ToyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final ToyUserService toyUserService;

    public boolean login(String email, String password){
        ToyUser user = toyUserService.findByEmail(email);
        return isPassWordValidation(user.getPassword(), password);
    }

    private boolean isPassWordValidation(String storedpassword, String inputpassword){
        return  storedpassword.equals(inputpassword);
    }


}
