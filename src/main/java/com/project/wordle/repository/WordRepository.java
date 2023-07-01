package com.project.wordle.repository;

import com.project.wordle.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for managing Word entities.
 * <p>
 * Extends JpaRepository interface for basic CRUD operations.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    /**
     * Retrieves the total number of words in the repository.
     *
     * @return The number of words in the repository.
     */
    @Query(value = "select count(*) FROM Word")
    int numberOfWords();

    /**
     * Finds a single Word entity by its ID.
     *
     * @param id The ID of the word to search for.
     * @return An Optional containing the Word entity with the specified ID, or an empty Optional if not found.
     */
    Optional<Word> findOneById(Long id);
}
