package com.react.toy.user.controller;

import com.react.toy.user.entity.ToyUser;
import com.react.toy.user.dto.UserRequestDto;
import com.react.toy.user.service.ToyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final ToyUserService toyUserService;

    //get 조회
    @GetMapping("/toyuser/{id}")
    public ResponseEntity<?> GetUser(@PathVariable Long id){
        ToyUser queryUser = toyUserService.findById(id);
        return ResponseEntity.ok().body(Map.of("message","true"));
    }


    @GetMapping("/toyusers")
    public ResponseEntity<?> GetUsers(@RequestParam int page, @RequestParam int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<ToyUser> userPage = toyUserService.findAll(pageable);


        Map<String, Object> response = new HashMap<>();
        response.put("message", "true");
        response.put("users", userPage.getContent());
        response.put("currentPage", userPage.getNumber());
        response.put("totalItems", userPage.getTotalElements());
        response.put("totalPages", userPage.getTotalPages());

        return ResponseEntity.ok().body(response);
    }


    //post //추가 or 가입
    @PostMapping("/toyuser")
    public ResponseEntity<?> JoinUser(@RequestBody UserRequestDto userRequestDto){



        return ResponseEntity.ok().body(Map.of("message","true"));
    }

    //put //변경
    @PutMapping("/toyuser")
    public ResponseEntity<?> editUser(@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.ok().body(Map.of("message","true"));
    }

    //delete //삭제 or 회원탈퇴
    @DeleteMapping("/toyuser")
    public ResponseEntity<?> delteUser(@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.ok().body(Map.of("message","true"));
    }


}
