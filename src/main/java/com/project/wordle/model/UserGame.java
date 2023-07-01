package com.project.wordle.model;

import com.project.wordle.enumeration.UserGameStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the UserGame entity.
 * It extends the {@link BaseEntity} class, which contains fields for creation and update
 * timestamps as well as a boolean flag for deletion status.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "user_games")
@Data
@RequiredArgsConstructor
public class UserGame extends BaseEntity<Long> {
    /**
     * The game associated with user game.
     */
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    /**
     * The user associated with the game.
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * The current number of tries in the game.
     */
    private int currentNumberOfTries = 0;

    /**
     * The guess made by the user in the game.
     */
    private String guess;

    /**
     * The list of previous guesses made by the user in the game.
     */
    private List<String> previousGuesses = new ArrayList<>();

    /**
     * The status of the game.
     */
    @Enumerated(EnumType.STRING)
    private UserGameStatus gameStatus = UserGameStatus.IN_PROGRESS;
}
