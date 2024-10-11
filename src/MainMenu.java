import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


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
        int menuChoise = 0;


        while (running) {
            QOL.clearConsole();
            Art.intro();
            Art.menu1();

            if (errorFlag == true) {
                System.out.println("You have entered something wrong... Try again please.");
            } else {
                errorFlag = false;
            }


            try {
                System.out.print(">");
                menuChoise = sc.nextInt();

                switch (menuChoise) {
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
