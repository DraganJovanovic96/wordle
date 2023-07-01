package com.project.wordle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

/**
 * This class represents the Word entity.
 * It extends the {@link BaseEntity} class, which contains fields for creation and update.
 * timestamps as well as a boolean flag for deletion status.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Entity
@Data
@Table(name = "words")
public class Word extends BaseEntity<Long> {

    /**
     * The string of word object.
     */
    private String stringOfWord;

    /**
     * The list of games.
     */
    @OneToMany(mappedBy = "correctWord")
    private List<Game> games;
}
