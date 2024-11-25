package com.react.toy.user.service;

import com.react.toy.user.entity.ToyUser;
import com.react.toy.user.respository.ToyUserRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ToyUserService {

    private final ToyUserRespository toyUserRespository;

    public ToyUser findById(Long id){
        return toyUserRespository.findById(id).orElseThrow(() -> new IllegalArgumentException("..."));
    }

    public ToyUser findByEmail(String email){
        return toyUserRespository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("..."));
    }

    public Boolean countEmail(String email){
        return toyUserRespository.countByEmail(email);
    }

    public ToyUser save(ToyUser toyUser){
        return toyUserRespository.save(toyUser);
    }

    public List<ToyUser> findAll(){
        return toyUserRespository.findAll();
    }

    public Page<ToyUser> findAll(Pageable pageable){
        return toyUserRespository.findAll(pageable);
    }

}
