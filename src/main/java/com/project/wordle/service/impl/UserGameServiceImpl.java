package com.project.wordle.service.impl;

import com.project.wordle.dto.UserGameDto;
import com.project.wordle.enumeration.GameStatus;
import com.project.wordle.mapper.UserGameMapper;
import com.project.wordle.model.Game;
import com.project.wordle.model.User;
import com.project.wordle.model.UserGame;
import com.project.wordle.repository.GameRepository;
import com.project.wordle.repository.UserGameRepository;
import com.project.wordle.repository.UserRepository;
import com.project.wordle.service.UserGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;

/**
 * Implementation of the UserGameService interface.
 * <p>
 * Provides methods to manage user game-related operations.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
public class UserGameServiceImpl implements UserGameService {
    /**
     * The repository used to retrieve user data.
     */
    private final UserRepository userRepository;

    /**
     * The repository used to retrieve game data.
     */
    private final GameRepository gameRepository;

    /**
     * The repository used to retrieve user game data.
     */
    private final UserGameRepository userGameRepository;

    /**
     * The mapper used to convert user data between UserGameDto and UserGame entities.
     */
    private final UserGameMapper userGameMapper;

    /**
     * Starts a new game session.
     * <p>
     * Selects a random word from the repository and creates a new game with the selected word.
     *
     * @return The newly created Game entity.
     * @throws ResponseStatusException If the random word is not found in the repository.
     */
    @Override
    public UserGameDto startUserGame(Principal principal) {
        String email = principal.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User with that email doesn't exist"));

        Game game = gameRepository.findOneByGameStatus(GameStatus.ACTIVE);

        UserGame userGame = new UserGame();
        userGame.setUser(user);
        userGame.setGame(game);
        userGameRepository.save(userGame);

        return userGameMapper.userGameToUserGameDto(userGame);
    }
}
