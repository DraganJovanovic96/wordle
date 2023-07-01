package com.project.wordle.repository;

import com.project.wordle.enumeration.UserGameStatus;
import com.project.wordle.model.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing UserGame entities.
 * <p>
 * Extends JpaRepository interface for basic CRUD operations.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface UserGameRepository extends JpaRepository<UserGame, Long> {
    /**
     * Finds a list of UserGame entities by their game status.
     *
     * @param gameStatus The UserGameStatus to search for.
     * @return A list of UserGame entities with the specified game status.
     */
    List<UserGame> findByGameStatus(UserGameStatus gameStatus);

    /**
     * Finds a single UserGame entity by the user ID and game status.
     *
     * @param userId     The ID of the user.
     * @param gameStatus The UserGameStatus to search for.
     * @return An Optional containing the UserGame entity with the specified user ID and game status, or an empty Optional if not found.
     */
    Optional<UserGame> findByUserIdAndGameStatus(Long userId, UserGameStatus gameStatus);
}
