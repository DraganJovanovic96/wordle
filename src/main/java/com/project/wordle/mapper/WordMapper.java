package com.project.wordle.mapper;

import com.project.wordle.dto.WordDto;
import com.project.wordle.model.Word;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * WordMapper is a mapper interface that defines mapping methods between {@link Word} and{@link WordDto}
 * classes using MapStruct library. It also enables list to list mapping.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Mapper
public interface WordMapper {
    /**
     * Maps a Word object to a WordDto object.
     *
     * @param word the Word object to be mapped to a WordDto object
     * @return a WordDto object containing the word's information
     */
    @Mapping(target = "word", source = "stringOfWord")
    WordDto wordToWordDto(Word word);


    /**
     * Maps a UserDto object to a User object.
     *
     * @param wordDto the WordDto object to be mapped to a Word object
     * @return a Word object containing the WordDto's information
     */
    @Mapping(target = "stringOfWord", source = "word")
    Word wordDtoToWord(WordDto wordDto);


}
