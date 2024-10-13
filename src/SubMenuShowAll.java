import java.util.Scanner;




public class SubMenuShowAll {
    private RecipeBook recipeBook;
    private Scanner sc = new Scanner(System.in);
    private boolean running = true;


    public SubMenuShowAll(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
        runMenu();
    }

    private void runMenu() {
        Art.menuRefresh();

        System.out.println("The tavern keep opens his tome to the index, showing all the recipes...");

        while (running) {
            if (recipeBook.getAllRecipes().isEmpty()) {
                System.out.println("You and the tavern keep have yet to made any new recipes...");
            } else {
                System.out.println("Here are all the recipes of your making:");
                Art.sepRator1();
                for (Recipe recipe : recipeBook.getAllRecipes()) {
                    printRecipe(recipe);
                    Art.placer();
                }
            }
            System.out.println("Press Enter to return to the main menu...");
            sc.nextLine();
            running = false;
        }
    }
    private void printRecipe(Recipe recipe) {
        System.out.println("Recipe Title: " + recipe.getTitle());
        System.out.println("Ingredients: ");
        for (String ingredient : recipe.getIngredients()) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Instructions: " + recipe.getInstructions());
        Art.sepRator1();
    }
}
