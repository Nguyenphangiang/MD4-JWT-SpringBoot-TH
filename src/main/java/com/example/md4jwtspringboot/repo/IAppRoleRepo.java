package com.example.md4jwtspringboot.repo;

import com.example.md4jwtspringboot.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRoleRepo extends JpaRepository<AppRole,Long> {
    AppRole findByName(String name);
}
