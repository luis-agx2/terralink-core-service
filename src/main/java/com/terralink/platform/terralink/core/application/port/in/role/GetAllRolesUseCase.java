package com.terralink.platform.terralink.core.application.port.in.role;

import com.terralink.platform.terralink.core.domain.model.role.Role;

import java.util.List;

public interface GetAllRolesUseCase {
    List<Role> execute();
}
