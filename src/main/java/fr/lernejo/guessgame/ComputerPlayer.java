package fr.lernejo.guessgame;

public class ComputerPlayer implements Player {
    private long nextGuess = 50;
    private long minGuess = 0;
    private long maxGuess = 100;
    private boolean lowerOrGreater;

    @Override
    public long askNextGuess() {
        return nextGuess;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        this.lowerOrGreater = lowerOrGreater;
        if (lowerOrGreater) {
            minGuess = nextGuess + 1;
            nextGuess = (minGuess + maxGuess) / 2;
        } else {
            maxGuess = nextGuess - 1;
            nextGuess = (maxGuess + minGuess) / 2;
        }
    }
}



