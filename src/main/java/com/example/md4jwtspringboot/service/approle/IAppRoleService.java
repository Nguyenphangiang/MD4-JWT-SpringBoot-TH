package com.example.md4jwtspringboot.service.approle;

import com.example.md4jwtspringboot.model.AppRole;
import com.example.md4jwtspringboot.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
