package fr.lernejo.guessgame;

import java.time.Duration;
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


    public void loopUntilPlayerSucceed(int maxIterations) {
        logger.log("Starting the game ...");
        while (!nextRound()){
            logger.log("Next round... ");
        }
        logger.log("End of game");
        /*
        long startTime = System.currentTimeMillis();

        int iteration = 0;
        boolean guessed = false;

        while (!guessed && iteration < maxIterations) {
            guessed = nextRound();
            iteration++;
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        // Convertir le nombre de secondes en durée
        Duration duration = Duration.ofMillis(elapsedTime);

        // Récupérer les minutes, secondes et millisecondes de la durée
        long minutes = duration.toMinutes();
        long remainingSeconds = duration.minusMinutes(minutes).getSeconds();
        long millis = duration.minusMinutes(minutes).minusSeconds(remainingSeconds).toMillis();

        // Formater la durée sous forme de chaîne de caractères au format mm:ss.SSS
        String formattedDuration = String.format("%02d:%02d.%03d", minutes, remainingSeconds, millis);

        if(!(iteration < maxIterations)) {
            logger.log("Game finished in " + formattedDuration + " with " + iteration + " iterations (limit reached)");
        }
        else{
            logger.log("Game finished in " + formattedDuration + " with " + iteration + " iterations");
        }
        if (!guessed) {
            logger.log("The player failed to guess the number");
        }

         */

    }


}
