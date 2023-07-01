package com.project.wordle.dto;

import com.project.wordle.enumeration.UserGameStatus;
import lombok.Data;

import java.util.List;

/**
 * A Data Transfer Object (DTO) for transferring user data between layers of the application.
 * It extends the {@link BaseEntityDto} class.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Data
public class UserGameDto extends BaseEntityDto {
    /**
     * The user associated with the game.
     */
    private UserDto userDto;

    /**
     * The current number of tries in the game.
     */
    private int currentNumberOfTries;

    /**
     * The guess made by the user in the game.
     */
    private String guess;

    /**
     * The list of previous guesses made by the user in the game.
     */
    private List<String> previousGuesses;

    /**
     * The status of the game.
     */
    private UserGameStatus gameStatus;
}
