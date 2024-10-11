import java.util.Random;
import java.util.Scanner;


public class MainMenu {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public MainMenu() {
        runMenu();
    }

    protected void runMenu() {
        // Variables //

        // Flags
        boolean running = true;
        boolean errorFlag = false;

        // Ints
        int menuChoice = 0;

        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.menu1();

            if (errorFlag == true) {
                System.out.println("You have entered something wrong... Try again please.");
            } else {
                errorFlag = false;
            }


            try {
                System.out.print(">");
                menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1: {
                        new SubMenuAdd();
                    }
                    case 2: {
                        new SubMenuShowAll();
                    }
                    case 3: {
                        new SubMenuRemove();
                    }
                    case 4: {
                        System.out.println();
                        running = false;
                    }
                }
            } catch (Exception e) {
                errorFlag = true;
                sc.nextLine();
            }
        }
    }
}
