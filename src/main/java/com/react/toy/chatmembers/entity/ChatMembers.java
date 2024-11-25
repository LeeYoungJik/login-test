package com.react.toy.chatmembers.entity;

import com.react.toy.user.entity.ToyUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class ChatMembers {

    @Id
    private Long chat_id;
    @ManyToOne
    private ToyUser toyUser;
    @CreatedDate
    private LocalDate joined_at;

}
