package com.project.wordle.controller;

import com.project.wordle.dto.UserGameDto;
import com.project.wordle.model.UserGame;
import com.project.wordle.service.UserGameService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * The UserGameController class is a REST controller which is responsible for handling HTTP requests related to userGame management.
 * It communicates with the userGame service to perform CRUD operations on userGame resources.
 * The RequiredArgsConstructor is used for fetching userGameService from IoC container.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user-game")
@CrossOrigin
public class UserGameController {

    private final UserGameService userGameService;

    /**
     * Creates a new userGame using the information provided in the {@code usrGameDto}
     * and returns a ResponseEntity object with status code 201 (Created) and the saved UserGameDto
     * object in the response body.
     *
     * @return a ResponseEntity object with status code 201 (Created) and the saved UserGameDto
     * object in the response body
     */

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/start-new-game")

    @ApiOperation(value = "Start new game")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Game successfully started.", response = UserGame.class),
            @ApiResponse(code = 401, message = "User is not logged in.")
    })
    public ResponseEntity<UserGameDto> startUserGame(Principal principal) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(userGameService.startUserGame(principal));
    }
}
