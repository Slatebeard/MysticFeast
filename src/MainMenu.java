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

            if (errorFlag) {
                System.out.println("You have entered something wrong... Try again.");
                errorFlag = false;
            }


            try {
                System.out.print(">");
                menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1: {
                        new SubMenuAdd();
                        break;
                    }
                    case 2: {
                        new SubMenuShowAll();
                        break;
                    }
                    case 3: {
                        new SubMenuRemove();
                        break;
                    }
                    case 4: {
                        System.out.println("Safe travels friend! Hope to see you again...");
                        running = false;
                        break;
                    }
                    default: {
//                        System.out.println("You have entered something wrong... Try again.");
                        errorFlag = true;
                    }
                }
            } catch (Exception e) {
                errorFlag = true;
                sc.nextLine();
            }
        }
    }
}
