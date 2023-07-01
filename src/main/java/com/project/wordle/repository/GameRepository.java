package com.project.wordle.repository;

import com.project.wordle.enumeration.GameStatus;
import com.project.wordle.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing games.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    /**
     * Finds a single Game entity by its GameStatus.
     *
     * @param gameStatus The GameStatus to search for.
     * @return The Game entity with the specified GameStatus.
     */
    Game findOneByGameStatus(GameStatus gameStatus);
}
