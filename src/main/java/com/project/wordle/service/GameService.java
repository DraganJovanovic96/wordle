package com.project.wordle.service;

import com.project.wordle.model.Game;
import org.springframework.web.server.ResponseStatusException;

/**
 * Service interface for managing game operations.
 * The GameService interface contains methods that will be implemented is GameServiceImpl and methods correlate
 * to Game entity.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
public interface GameService {
    /**
     * Starts a new game session.
     * <p>
     * Selects a random word from the repository and creates a new game with the selected word.
     *
     * @return The newly created Game entity.
     * @throws ResponseStatusException If the random word is not found in the repository.
     */
    Game startNewGame();
}
