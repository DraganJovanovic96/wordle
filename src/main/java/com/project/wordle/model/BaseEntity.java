package com.project.wordle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

/**
 * This class represents status information for entities in the company management system.
 * It contains fields to track the creation date and time, the last update date and time,
 * and whether the entity has been deleted.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@MappedSuperclass
@Data
public abstract class BaseEntity<T> {
    /**
     * The unique identifier for entities.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;

    /**
     * The date and time when the entity was created.
     */
    @Column
    private final Instant createdAt = Instant.now();

    /**
     * The date and time when the entity was last updated.
     */
    @Column
    private Instant updatedAt;

    /**
     * Indicates whether the entity has been deleted.
     */
    @Column
    private Boolean deleted = false;
}
