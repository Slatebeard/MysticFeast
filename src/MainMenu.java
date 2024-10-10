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

    public void runMenu() {
        // Variables
        boolean running = true;

        int menuChoise = 0;
        int userChoice = sc.nextInt();


        // Objects
        RecipeBook recipeBook = new RecipeBook();

        while (running) {
            QOL.clearConsole();
            System.out.println(Art.intro);


            //TODO Figure out a smart way to check for valid input

            // Error Handling
            List<Integer> menuOptions = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
            if (menuOptions.contains(userChoice)) {
                menuChoise = userChoice;
            } else {
                System.out.println("Please select a valid option...");
            }



            switch (userChoice) {
                case 1: {
                    System.out.println(Art.getAllRecipes);
                    recipeBook.getAllRecipes();
                }
                case 2: {
                    System.out.println(Art.addRecipe);
                    recipeBook.addRecipe();
                }


            }
        }
    }
}
