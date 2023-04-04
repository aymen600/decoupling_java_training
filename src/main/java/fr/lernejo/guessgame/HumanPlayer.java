package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger;
    private final Scanner scanner;

    public HumanPlayer() {
        this.logger = LoggerFactory.getLogger("player");
        this.scanner = new Scanner(System.in);
    }

    @Override
    public long askNextGuess() {
        logger.log("Please enter your next guess: ");
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("The number to guess is lower than your guess.");
        } else {
            logger.log("The number to guess is greater than your guess.");
        }
    }
}

