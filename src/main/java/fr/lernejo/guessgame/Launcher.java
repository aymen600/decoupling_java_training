package fr.lernejo.guessgame;

import java.security.SecureRandom;
public class Launcher {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: Launcher [-interactive|-auto <number>]");
        } else if (args[0].equals("-interactive")) {
            Simulation simu = new Simulation(new HumanPlayer());
            simu.initialize(new SecureRandom().nextInt(100));
            simu.loopUntilPlayerSucceed(Integer.MAX_VALUE);
        } else if (args[0].equals("-auto") && args.length == 2) {
            Simulation simu = new Simulation(new ComputerPlayer());
            simu.initialize(Long.parseLong(args[1]));
            simu.loopUntilPlayerSucceed(1000);
        } else {
            System.out.println("Usage: Launcher [-interactive|-auto <number>]");
        }
    }
}

