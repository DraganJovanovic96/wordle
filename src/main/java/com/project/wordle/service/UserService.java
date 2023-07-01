package com.project.wordle.service;

import com.project.wordle.model.User;
import org.springframework.web.server.ResponseStatusException;

/**
 * The UserService interface contains methods that will be implemented is UserServiceImpl and methods correlate
 * to User entity.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
public interface UserService {

    /**
     * Retrieves a user entity by their email address.
     *
     * @param email The email address of the user.
     * @return The User entity with the specified email address.
     * @throws ResponseStatusException If a user with the specified email address is not found.
     */
    User findOneByEmail(String email);
}
