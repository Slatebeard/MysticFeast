package se.slatebeard.util;

public class QOL {
    // Taken of internet! Not written by me.
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static String line = "";

    public static String makeRed (int number) {
        String RED = "\033[0;31m";
        String RESET = "\033[0m";
        return RED + number + RESET;
    }

    public static String makeGreen (int number) {
        String GREEN = "\033[0;32m";
        String RESET = "\033[0m";
        return GREEN + number + RESET;
    }

    public static String setLine (int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println();
        }
        return line;
    }

}