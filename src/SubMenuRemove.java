import se.slatebeard.util.QOL;
import java.util.Scanner;


public class SubMenuRemove {
    Scanner scanner = new Scanner(System.in);
    private boolean running = true;

    private RecipeBook recipeBook;

    public SubMenuRemove(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
        runMenu();
    }




    private void runMenu() {
        // Variables //

        // Flags


        // Ints


        // Logic

        while (running) {
            Art.menuRefresh();

            if (recipeBook.getAllRecipes().isEmpty()) {
                QOL.setLine(1);
                System.out.println("You and the tavern keep have yet to made any new recipes...");
            } else {

            }









        }
    }
}
