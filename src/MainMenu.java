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
                System.out.println("You have entered something wrong... Try again.");
                errorFlag = false;
            }


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
                        new SubMenuRemove();
                        break;
                    }
                    case 4: {
                        QOL.clearConsole();
                        System.out.println("Safe travels friend! Hope to see you again...");
                        running = false;
                        break;
                    }
                    default: {
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
