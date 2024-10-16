package menu;

import se.slatebeard.util.QOL;
import se.slatebeard.img.Art;
import java.util.Scanner;


public class Ingredients {

    private static String[] ingredientList = {
            "Wheat", "Eggs", "Milk", "Mandragora's Tail", "Honey",
            "Dragon Scales", "Elven Spice", "Rabbit Meat", "Basilisk Eye",
            "Barley", "Gorgon Blood", "Goat Cheese", "Griffon Feather",
            "Herbs of the Wilds", "Troll Fat"
    };

    public static String[] selectIngredients(String recipeType) {

        // Flags
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        String[] selectedIngredients = {};

        while (running) {

            Art.menuRefresh();

            System.out.println("Enter the numbers of the ingredients you want to add to your " + recipeType + " recipe (e.g., 1,3,5): ");

            Art.sepRator1();
            Art.subMenuAddIngredientsList();
            Art.sepRator1();

            Art.placer();

            String userInput = scanner.nextLine();
            String[] inputNumbers = userInput.split(",");

            try {
                selectedIngredients = new String[inputNumbers.length];
                for (int i = 0; i < inputNumbers.length; i++) {
                    int index = Integer.parseInt(inputNumbers[i].trim());

                    if (index < 1 || index > ingredientList.length) {
                        throw new IllegalArgumentException("Invalid ingredient number: " + index);
                    }

                    selectedIngredients[i] = ingredientList[index - 1];
                }
                running = false;

            } catch (NumberFormatException e) {
                QOL.setLine(1);
                System.out.println("Looks like you put in to many commas friend, press Enter to try again...");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                QOL.setLine(1);
                System.out.println("Looks like you tried to add something that does not exist, press Enter to try again...");
                scanner.nextLine();
            } catch (Exception e) {
                QOL.setLine(1);
                System.out.println("Press Enter to try again friend...3");
                scanner.nextLine();
            }
        }
        return selectedIngredients;
    }
}
