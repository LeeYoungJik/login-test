package com.react.toy.user.respository;

import com.react.toy.user.entity.ToyUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@SpringBootTest
class ToyUserRespositoryTest {

    @Autowired
    ToyUserRespository toyUserRespository;

    @Test
    public void inserToyUserTest(){
        List<ToyUser> toyUserList = new ArrayList<>();

        for(int i = 3; i<10000; i++){
        ToyUser buildUser = ToyUser.builder().id((long) i).email(String.format("Test%s@naver.com",i)).password("12345").build();
        toyUserList.add(buildUser);
        }

        toyUserRespository.saveAll(toyUserList);
//        toyUserRespository.save(buildUser);
    }

    @Test
    public void updateTest(){
        Optional<ToyUser> queryUser = toyUserRespository.findById(2L);
        ToyUser toyUser = queryUser.get();
        ToyUser toyUser1 = toyUser.changeEmail("Test3@naver.com");
        toyUserRespository.save(toyUser1);
//        toyUserRespository.save(toyUser);
    }



}