package menu;

import recipe.Recipe;
import se.slatebeard.util.QOL;
import se.slatebeard.img.Art;

import java.util.Scanner;

public class SubMenuShowAll {
    // Fields
    private RecipeBook recipeBook;
    private Scanner sc = new Scanner(System.in);
    private boolean running = true;


    public SubMenuShowAll(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
        runMenu();
    }

    private void runMenu() {

        // Variables //

            // Flags

            // Ints

        Art.menuRefresh();
        // Logic
        while (running) {

            if (recipeBook.getAllRecipes().isEmpty()) {
                QOL.setLine(1);
                System.out.println("You and the tavern keep have yet to made any new recipes...");
            } else {
                System.out.println("The tavern keep opens his tome, showing all the recipes...");
                QOL.setLine(1);
                System.out.println("Here are all the recipes of your making:");
                for (Recipe recipe : recipeBook.getAllRecipes()) {
                    printRecipe(recipe);
                    QOL.setLine(1);
                }
            }
            QOL.setLine(1);
            System.out.print("Press Enter to return to the main menu...");
            sc.nextLine();
            running = false;
        }
    }

    private void printRecipe(Recipe recipe) {
        Art.sepRator1();
        System.out.println("Title: " + recipe.getTitle());
        System.out.println("Ingredients: ");
        for (String ingredient : recipe.getIngredients()) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Instructions: " + recipe.getInstructions());
        System.out.println("Time to eat: " + recipe.getType());
        Art.sepRator1();
    }
}
