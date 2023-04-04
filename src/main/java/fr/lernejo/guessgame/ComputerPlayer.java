package fr.lernejo.guessgame;

public class ComputerPlayer implements Player {
    private long nextGuess = 50;
    private long minGuess = 0;
    private long maxGuess = 100;
    private boolean lowerOrGreater = false;

    public long askNextGuess() {
        return nextGuess;
    }

    public void respond(boolean lowerOrGreater) {
        this.lowerOrGreater = lowerOrGreater;
        if (lowerOrGreater) {
            maxGuess = nextGuess;
            nextGuess = (minGuess + nextGuess) / 2;
        } else {
            minGuess = nextGuess;
            nextGuess = (maxGuess + nextGuess) / 2;
        }
    }
}



