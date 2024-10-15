import se.slatebeard.util.QOL;

import java.util.Random;
import java.util.Scanner;


public class MainMenu {

    private RecipeBook recipeBook = new RecipeBook();

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public MainMenu() {
        runMenu();
    }

    protected void runMenu() {
        // Variables //

        // Flags
        boolean running = true;

        // Ints
        int menuChoice = 0;

        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.menu1();

            try {
                System.out.print(">");
                menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1: {
                        new SubMenuAdd(recipeBook);
                        break;
                    }
                    case 2: {
                        new SubMenuShowAll(recipeBook);
                        break;
                    }
                    case 3: {
                        new SubMenuRemove(recipeBook);
                        break;
                    }
                    case 4: {
                        QOL.clearConsole();
                        System.out.println("Safe travels friend! \nHope to see you again...");
                        running = false;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("You have entered something wrong... Try again.");
            }
        }
    }
}
