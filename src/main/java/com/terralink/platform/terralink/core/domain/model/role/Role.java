package com.terralink.platform.terralink.core.domain.model.role;

import java.util.Objects;
import java.util.UUID;

public class Role {
    private final UUID uuid;

    private final String name;

    private final RoleStatus roleStatus;

    public Role(Builder builder) {
        this.uuid = Objects.requireNonNullElseGet(builder.uuid, UUID::randomUUID);
        this.name = builder.name;
        this.roleStatus = builder.roleStatus;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public RoleStatus getRoleStatus() {
        return roleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID uuid;
        private String name;
        private RoleStatus roleStatus;

        public Builder uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder roleStatus(RoleStatus roleStatus) {
            this.roleStatus = roleStatus;
            return this;
        }

        public Role build() {
            return new Role(this);
        }
    }
}
