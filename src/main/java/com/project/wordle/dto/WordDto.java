package com.project.wordle.dto;

import lombok.Data;

/**
 * A Data Transfer Object (DTO) for transferring user data between layers of the application.
 * It extends the {@link BaseEntityDto} class.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Data
public class WordDto extends BaseEntityDto {

    /**
     * The string of word object.
     */
    private String word;
}
