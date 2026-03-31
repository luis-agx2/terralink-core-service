package com.terralink.platform.terralink.core.domain.model.role;

public enum RoleStatus {
    ACTIVE("ACTIVE", "Rol habilitado"),
    INACTIVE("INACTIVE", "Rol deshabilitado temporalmente");

    private final String code;
    private final String name;

    RoleStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
