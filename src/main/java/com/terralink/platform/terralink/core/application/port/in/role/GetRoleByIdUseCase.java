package com.terralink.platform.terralink.core.application.port.in.role;

import com.terralink.platform.terralink.core.domain.model.role.Role;

import java.util.UUID;

public interface GetRoleByIdUseCase {
    Role execute(UUID uuid);
}
