package com.example.md4jwtspringboot.service.appuser;

import com.example.md4jwtspringboot.model.AppRole;
import com.example.md4jwtspringboot.model.AppUser;
import com.example.md4jwtspringboot.model.DTO.UserPrinciple;
import com.example.md4jwtspringboot.repo.IAppUserRepo;
import com.example.md4jwtspringboot.service.approle.IAppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    private IAppUserRepo userRepo;
    @Override
    public Iterable<AppUser> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public AppUser save(AppUser appUser) {
        return userRepo.save(appUser);
    }

    @Override
    public void remove(Long id) {
        userRepo.deleteById(id);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = userRepo.findByName(username);
        if (userOptional.isPresent()){
            return UserPrinciple.build(userOptional.get());
        }
        return null;
    }
    @Override
    public AppUser findByName(String name) {
        return userRepo.findByName(name).get();
    }
}
