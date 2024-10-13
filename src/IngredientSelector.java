import java.util.Scanner;

public class IngredientSelector {

    private static String[] ingredientList = {
            "Wheat",
            "Eggs",
            "Milk",
            "Mandragora's Tail",
            "Honey",
            "Dragon Scales",
            "Elven Spice",
            "Rabbit Meat",
            "Basilisk Eye",
            "Barley",
            "Gorgon Blood",
            "Goat Cheese",
            "Griffon Feather",
            "Herbs of the Wilds",
            "Troll Fat"
    };


    public static String[] selectIngredients(String recipeType) {
        Scanner scanner = new Scanner(System.in);

        Art.menuRefresh();


        System.out.println("Enter the numbers of the ingredients you want to add to your " + recipeType + " recipe (like, 1,3,5): ");
        QOL.setLine(1);
        Art.subMenuAddIngredientsList();

        String userInput = scanner.nextLine();

        String[] inputNumbers = userInput.split(",");
        String[] selectedIngredients = new String[inputNumbers.length];


        for (int i = 0; i < inputNumbers.length; i++) {
            int index = Integer.parseInt(inputNumbers[i].trim());
            selectedIngredients[i] = ingredientList[index];
        }
        return selectedIngredients;
    }
}
