package com.terralink.platform.terralink.core.application.port.in.role;

import com.terralink.platform.terralink.core.domain.model.role.Role;

public interface CreateRoleUseCase {
    Role execute(Role role);
}
