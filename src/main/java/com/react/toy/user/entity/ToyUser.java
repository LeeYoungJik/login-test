package com.react.toy.user.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "toyusers")
public class ToyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @CreatedDate
    private LocalDate created_at;


    @Builder
    public ToyUser(Long id, String email, String password, LocalDate created_at) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.created_at = created_at;
    }

    public ToyUser changeEmail(String newEmail){
        this.email = newEmail;
        return this;
    }
}
