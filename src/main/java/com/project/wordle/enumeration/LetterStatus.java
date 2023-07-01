package com.project.wordle.enumeration;

/**
 * Enum representing statuses of the letters.
 */
public enum LetterStatus {
    /**
     * Letter is in correct position.
     */
    CORRECT,

    /**
     * Letter doesn't exist in word.
     */
    INCORRECT,

    /**
     * Letter is in incorrect position.
     */
    MISPLACED
}
