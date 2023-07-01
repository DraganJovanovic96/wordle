package com.project.wordle.service.impl;

import com.project.wordle.model.Game;
import com.project.wordle.model.Word;
import com.project.wordle.repository.GameRepository;
import com.project.wordle.repository.WordRepository;
import com.project.wordle.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;

/**
 * Implementation of the GameService interface.
 * <p>
 * Provides methods to manage game-related operations.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    /**
     * The repository used to retrieve word data.
     */
    private final WordRepository wordRepository;

    /**
     * The repository used to retrieve game data.
     */
    private final GameRepository gameRepository;

    /**
     * Starts a new game session.
     * <p>
     * Selects a random word from the repository and creates a new game with the selected word.
     * This method is run every day at midnight using @Scheduled annotation.
     *
     * @return The newly created Game entity.
     * @throws ResponseStatusException If the random word is not found in the repository.
     */
    @Override
    @Scheduled(cron = "@midnight")
    public Game startNewGame() {
        int numberOfWords = wordRepository.numberOfWords();

        Random random = new Random();
        Long randomNumber = random.nextLong(numberOfWords);

        Word word = wordRepository.findOneById(randomNumber)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Word with that id is not found."));
        System.out.println(word.getStringOfWord());

        Game game = new Game();
        game.setCorrectWord(word);
        gameRepository.save(game);
        return game;
    }

}
