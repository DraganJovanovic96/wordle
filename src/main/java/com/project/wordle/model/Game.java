package com.project.wordle.model;

import com.project.wordle.enumeration.GameStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the Game entity.
 * It extends the {@link BaseEntity} class, which contains fields for creation and update
 * timestamps as well as a boolean flag for deletion status.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Entity
@Data
@Table(name = "games")
public class Game extends BaseEntity<Long> {

    /**
     * The correct word associated with the game.
     */
    @ManyToOne
    private Word correctWord;

    /**
     * The list of user games associated with the game.
     */
    @OneToMany(mappedBy = "game")
    private List<UserGame> userGames = new ArrayList<>();

    /**
     * The status of the game.
     */
    @Enumerated(EnumType.STRING)
    private GameStatus gameStatus = GameStatus.ACTIVE;
}
