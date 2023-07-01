package com.project.wordle.service.impl;

import com.project.wordle.model.User;
import com.project.wordle.repository.UserRepository;
import com.project.wordle.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 * Implementation of the User interface.
 * <p>
 * Provides methods to manage user-related operations.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    /**
     * The repository used to retrieve user data.
     */
    private final UserRepository userRepository;

    /**
     * Retrieves a user entity by their email address.
     *
     * @param email The email address of the user.
     * @return The User entity with the specified email address.
     * @throws ResponseStatusException If a user with the specified email address is not found.
     */
    @Override
    public User findOneByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User with that email doesn't exist"));
    }
}
