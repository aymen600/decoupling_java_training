package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
        logger.log("Number to guess: " + numberToGuess);
    }

    private boolean nextRound() {
        long guess = player.askNextGuess();
        if (guess == numberToGuess) {
            logger.log("You guessed the number!");
            return true;
        } else {
            player.respond(guess < numberToGuess);
            return false;
        }
    }

    public void loopUntilPlayerSucceed() {
        logger.log("Starting the game...");
        while (!nextRound()) {
            logger.log("Next round...");
        }
        logger.log("End of game.");
    }
}

