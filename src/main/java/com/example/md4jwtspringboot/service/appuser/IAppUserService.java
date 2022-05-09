package com.example.md4jwtspringboot.service.appuser;

import com.example.md4jwtspringboot.model.AppUser;
import com.example.md4jwtspringboot.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
}
