package com.project.wordle.repository;


import com.project.wordle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository interface for managing users.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Method that returns optional of User by email.
     *
     * @param email string containing user email
     * @return Optional of {@link User}
     */
    Optional<User> findByEmail(String email);

}
