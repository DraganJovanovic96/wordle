package com.project.wordle.repository;

import com.project.wordle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The UserRepository interface extends JpaRepository to inherit JPA-based CRUD methods and custom
 * methods for accessing and modifying User entities.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Return optional of User from email.
     *
     * @param email unique identifier of User
     * @return {@Optional User}
     */
    Optional<User> findByEmail(String email);
}
