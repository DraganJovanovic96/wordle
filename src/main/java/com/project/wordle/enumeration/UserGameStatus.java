package com.project.wordle.enumeration;

/**
 * Enum representing statuses of the userGames.
 */
public enum UserGameStatus {
    /**
     * Game is currently in progress.
     */
    IN_PROGRESS,

    /**
     * Game is won.
     */
    WIN,

    /**
     * Game is lost.
     */
    LOSE,

    /**
     * Game wasn't finished in time.
     */
    UNFINISHED
}
