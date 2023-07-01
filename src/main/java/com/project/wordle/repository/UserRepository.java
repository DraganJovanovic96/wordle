package com.project.wordle.repository;


import com.project.wordle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for managing users.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Method that returns optional of User by email.
     *
     * @param email string containing user email
     * @return Optional of {@link User}
     */
    Optional<User> findByEmail(String email);

}
