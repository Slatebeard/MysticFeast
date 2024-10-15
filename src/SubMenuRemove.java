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
            QOL.clearConsole();
            Art.logo();
            Art.SubMenuRemove();






        }
    }
}
