package com.terralink.platform.terralink.core.application.port.out;

import com.terralink.platform.terralink.core.domain.model.role.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleRepositoryPort {
    List<Role> findAll();

    Optional<Role> findById(UUID uuid);

    Optional<Role> findByName(String name);

    Role save(Role role);

    void delete(Role role);
}
