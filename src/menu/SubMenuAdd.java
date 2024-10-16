package menu;

import recipe.*;
import se.slatebeard.img.Art;
import se.slatebeard.util.QOL;
import java.util.Scanner;


public class SubMenuAdd {
    Scanner sc = new Scanner(System.in);
    private boolean running = true;
    private boolean custom = false;

    private RecipeBook recipeBook;

    public SubMenuAdd(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
        runMenu();
    }

    private void runMenu() {
        // Variables //


        // Flags


        // Ints
        int menuChoice = 0;


        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.subMenuAdd();

            try {
                Art.placer();
                menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1: {
                        custom = false;
                        recipeGenerator();
                        break;
                    }
                    case 2: {
                        custom = true;
                        recipeGenerator();
                        break;
                    }
                    case 3: {
                        running = false;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Something went wrong friend, try from the start...");
            }
        }
    }

    private void recipeGenerator() {
        // Variables //

        //Flag
        boolean generating = true;
        boolean creating = false;
        boolean errorFlag = false;

        // Int
        int menuChoice;
        int choice;

        // String
        String recipeType = "";


        // Logic
        while (generating) {
            QOL.clearConsole();
            Art.logo();
            Art.subMenuAdd2();


            if (errorFlag) {
                System.out.println("You have entered something wrong... Try again please.");
            } else {
                errorFlag = false;
            }

            try {
                Art.placer();
                menuChoice = sc.nextInt();
                sc.nextLine();

                switch (menuChoice) {
                    case 1: {
                        recipeType = "Breakfast";
                        creating = true;
                        break;
                    }
                    case 2: {
                        recipeType = "Lunch";
                        creating = true;
                        break;
                    }
                    case 3: {
                        recipeType = "Supper";
                        creating = true;
                        break;
                    }
                    case 4: {
                        recipeType = "Snack";
                        creating = true;
                        break;
                    }
                    case 5: {
                        creating = false;
                        generating = false;
                        running = false;
                        break;

                    }
                }
            } catch (Exception e) {
                errorFlag = true;
                sc.nextLine();
            }

            while (creating) {

                Art.menuRefresh();

                System.out.println("Enter a name for the " + recipeType + " recipe:");
                Art.placer();
                String recipeName = sc.nextLine();

                String[] ingredients;

                if (custom) {
                    System.out.println("Enter your ingredients for your custom recipe (like, Eggs,Ham,Beef): ");
                    Art.placer();
                    ingredients = sc.nextLine().split(",\\s*");
                } else {
                    ingredients = Ingredients.selectIngredients(recipeType);
                    Art.menuRefresh();
                }

                System.out.println("Enter instructions for the " + recipeType + " recipe:");
                Art.placer();
                String instructions = sc.nextLine();

                Art.menuRefresh();

                if (recipeType.equals("Breakfast")) {
                    Breakfast breakfast = new Breakfast(recipeName, ingredients, instructions, true);
                    recipeBook.addRecipe(breakfast);
                } else if (recipeType.equals("Lunch")) {
                    Lunch lunch = new Lunch(recipeName, ingredients, instructions, true);
                    recipeBook.addRecipe(lunch);
                } else if (recipeType.equals("Supper")) {
                    Supper supper = new Supper(recipeName, ingredients, instructions, true);
                    recipeBook.addRecipe(supper);
                } else {
                    Snack snack = new Snack(recipeName, ingredients, instructions, true);
                    recipeBook.addRecipe(snack);
                }

                System.out.println(recipeName + " was recorded in the tome!");

                QOL.setLine(1);

                System.out.print("Enter 1 to generate another recipe or press Enter to return to the main menu...");

                if (sc.nextLine().equals("1")) {
                    generating = true;
                } else {
                    creating = false;
                    generating = false;
                    running = false;
                }
            }
        }
        custom = false;
    }
}