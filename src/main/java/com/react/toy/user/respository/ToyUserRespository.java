package com.react.toy.user.respository;

import com.react.toy.user.entity.ToyUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ToyUserRespository extends JpaRepository<ToyUser, Long> {
    Optional<ToyUser> findByEmail(String email);
    Boolean countByEmail(String email);

    Page<ToyUser> findAll(Pageable pageable);


}
