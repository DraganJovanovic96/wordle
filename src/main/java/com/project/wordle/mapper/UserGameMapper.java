package com.project.wordle.mapper;

import com.project.wordle.dto.UserGameDto;
import com.project.wordle.model.UserGame;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * UserMapper is a mapper interface that defines mapping methods between {@link UserGame} and{@link UserGameDto}
 * classes using MapStruct library. It also enables list to list mapping.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Mapper
public interface UserGameMapper {
    /**
     * Maps a User object to a UserDto object.
     *
     * @param userGame the UserGame object to be mapped to a UserGameDto object
     * @return a UserGameDto object containing the userGame's information
     */
    @Mapping(target = "userDto", source = "user")
    UserGameDto userGameToUserGameDto(UserGame userGame);

    /**
     * Maps a UserGameDto object to a UserGame object.
     *
     * @param userGameDto the UserGameDto object to be mapped to a UserGame object
     * @return a UserGame object containing the UserGameDto's information
     */
    UserGame userGameDtoToUserGame(UserGameDto userGameDto);

}
