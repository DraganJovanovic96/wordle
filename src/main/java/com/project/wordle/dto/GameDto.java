package com.project.wordle.dto;

import com.project.wordle.enumeration.GameStatus;

import java.util.List;

/**
 * A Data Transfer Object (DTO) for transferring user data between layers of the application.
 * It extends the {@link BaseEntityDto} class.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
public class GameDto extends BaseEntityDto {

    /**
     * The correct word dto.
     */
    private WordDto correctWord;

    /**
     * The list of userGameDtos.
     */
    private List<UserGameDto> userGameDtos;

    /**
     * The game status.
     */
    private GameStatus gameStatus;
}
