package com.example.md4jwtspringboot.repo;

import com.example.md4jwtspringboot.model.AppRole;
import com.example.md4jwtspringboot.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAppUserRepo  extends JpaRepository<AppUser,Long>{
    Optional<AppUser> findByName(String name);
}
