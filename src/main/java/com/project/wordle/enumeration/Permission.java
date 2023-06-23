package com.project.wordle.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enumeration representing permissions in the system.
 */
@RequiredArgsConstructor
public enum Permission {
    /**
     * Permission to read.
     */
    ADMIN_READ("admin:read"),

    /**
     * Permission to update.
     */
    ADMIN_UPDATE("admin:update"),

    /**
     * Permission to create.
     */
    ADMIN_CREATE("admin:create"),

    /**
     * Permission to delete.
     */
    ADMIN_DELETE("admin:delete"),

    /**
     * Permission to read.
     */
    MANAGER_READ("management:read"),

    /**
     * Permission to update.
     */
    MANAGER_UPDATE("management:update"),

    /**
     * Permission to create.
     */
    MANAGER_CREATE("management:create"),

    /**
     * Permission to delete.
     */
    MANAGER_DELETE("management:delete");

    /**
     * The string representation of the permission.
     */
    @Getter
    private final String permission;
}
