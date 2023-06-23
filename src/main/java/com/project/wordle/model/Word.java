package com.project.wordle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.stereotype.Repository;

/**
 * Entity representing a word.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Entity
@Repository
@Table(name = "words")
public class Word extends BaseEntity<Long> {

    /**
     * The string of word object.
     */
    private String word;
}
