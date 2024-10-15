import se.slatebeard.util.QOL;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenuRemove {
    private RecipeBook recipeBook;
    private Scanner sc = new Scanner(System.in);
    private boolean running = true;
    private int counter = 0;

    public SubMenuRemove(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
        runMenu();
    }

    private void runMenu() {
        // Variables //

        // Flags
        boolean removing = false;

        // Ints
        int userChoice;

        // Strings
        String userConf = "";

        // Logic
        while (running) {
            Art.menuRefresh();

            if (recipeBook.getAllRecipes().isEmpty()) {
                QOL.setLine(1);
                System.out.println("You and the tavern keep have yet to made any new recipes...");
            } else {
                System.out.println("The tavern keep opens his tome, showing all the recipes...");
                QOL.setLine(1);
                System.out.println("Here are all the recipes of your making:");
                counter = 1;
                for (Recipe recipe : recipeBook.getAllRecipes()) {
                    printRecipeTitle(recipe);
                    counter++;
                }
            }
            Art.sepRator1();
            QOL.setLine(1);

            System.out.println("Choose the recipe by number you want to remove.");

            Art.placer();


            try {
                userChoice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Please enter a valid recipe number...");
                continue;
            }

            if (userChoice == 0) {
                System.out.println("No recipe was removed, returning to main menu...");
            } else if (userChoice > 0 && userChoice <= recipeBook.getAllRecipes().size()) {

                Recipe recipeRemove = recipeBook.getAllRecipes().get(userChoice - 1);
                QOL.setLine(1);
                System.out.println("Are you sure you want to remove " + recipeRemove.getTitle() + " from the tome forever?");
                System.out.println("Type " + QOL.makeTextGreen("yes") + " to confirm removal or type " + QOL.makeTextGreen("no") + " to return to the main menu..." );


                userConf = sc.nextLine();

                if (userConf.equalsIgnoreCase("yes")) {
                    Art.menuRefresh();
                    recipeBook.removeRecipe(recipeRemove);
                    QOL.setLine(1);
                    System.out.print("Recipe " + recipeRemove.getTitle() + " was erased from the tome...");
                } else {

                    System.out.println("No recipe was removed.");
                }
            } else {

                System.out.println("You have entered something wrong friend. Try again...");
            }


            System.out.println("Press 1 to remove another recipe or press Enter to return to the main menu...");

            if (sc.nextLine().equals("1")) {
                running = true;
            } else {
                running = false;
            }
        }
    }

    private void printRecipeTitle(Recipe recipe) {
        Art.sepRator1();
        System.out.println("Recipe " + counter + ": " + recipe.getTitle());
    }
}
