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
        boolean errorFlag = false;

        // Ints
        int menuChoice = 0;

        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.menu1();

            if (errorFlag) {
                System.out.println("You have entered something wrong... Try again please.");
            } else {
                errorFlag = false;
            }

            try {
                System.out.print(">");
                menuChoice = sc.nextInt();

                if (menuChoice < 1 || menuChoice > 4) {
                    throw new IllegalArgumentException("You have entered something wrong friend, try again please...");
                }

                switch (menuChoice) {
                    case 1: {
                        errorFlag = false;
                        new SubMenuAdd(recipeBook);
                        break;
                    }
                    case 2: {
                        errorFlag = false;
                        new SubMenuShowAll(recipeBook);
                        break;
                    }
                    case 3: {
                        errorFlag = false;
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
                errorFlag = true;
                sc.nextLine();
            }
        }
    }
}
