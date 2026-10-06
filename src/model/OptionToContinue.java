package model;

/**
 * Enum representing user menu selection states for continuing, exiting, or providing invalid input.
 */
public enum OptionToContinue {

    /**
     * Represents the option to continue the game loop.
     */
    CONTINUE,

    /**
     * Represents the option to terminate the game.
     */
    EXIT,

    /**
     * Represents an unrecognized or invalid menu input.
     */
    UNKNOWN;
}
