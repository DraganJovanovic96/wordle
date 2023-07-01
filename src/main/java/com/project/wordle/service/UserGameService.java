package com.project.wordle.service;

import com.project.wordle.dto.UserGameDto;

import java.security.Principal;

/**
 * Service interface for managing user game operations.
 * The UserGameService interface contains methods that will be implemented is UserGameServiceImpl and methods correlate
 * to UserGame entity.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
public interface UserGameService {

    UserGameDto startUserGame(Principal principal);
}
