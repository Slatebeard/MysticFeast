package menu;

import recipe.*;
import se.slatebeard.img.Art;
import se.slatebeard.util.QOL;

import java.util.List;
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
        boolean errorFlag = false;

            // Ints
        int menuChoice = 0;


        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.subMenuAdd();


            if (errorFlag) {
                System.out.println("You have entered something wrong... Try again please.");
                errorFlag = false;
            }


            try {
                Art.placer();
                menuChoice = sc.nextInt();

                if (menuChoice < 1 || menuChoice > 3) {
                    throw new IllegalArgumentException("You have entered something wrong... Try again please.");
                }

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
                errorFlag = true;
                sc.nextLine();
            }
        }
    }

    private void recipeGenerator() {
        // Variables //

            //Flags
        boolean generating = true;
        boolean creating = false;
        boolean errorFlag = false;

            // Ints
        int menuChoice;
        int choice;

            // Strings
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


                String recipeName = "";



                do {
                    Art.menuRefresh();
                    if (errorFlag) {
                        System.out.println("The name of your recipe cannot be empty...");
                        QOL.setLine(1);;
                    } else {
                        errorFlag = false;
                    }
                    System.out.println("Enter a name for the " + recipeType + " recipe:");
                    Art.placer();
                    recipeName = sc.nextLine();
                    if (recipeName.trim().isEmpty()) {
                        errorFlag = true;
                    }
                } while (recipeName.trim().isEmpty());

                List<String> ingredients;

                if (custom) {
                    System.out.println("Enter your ingredients for your custom recipe (like, Eggs,Ham,Beef): ");
                    Art.placer();
                    ingredients = List.of(sc.nextLine().split(","));
                } else {
                    ingredients = List.of(Ingredients.selectIngredients(recipeType));
                    Art.menuRefresh();
                }

                String instructions = "";

                do {
                    System.out.println("Enter instructions for the " + recipeType + " recipe:");
                    Art.placer();
                    instructions = sc.nextLine();

                    if (instructions.trim().isEmpty()) {
                        System.out.println("The instructions of your recipe cannot be empty...");
                    }

                } while (instructions.trim().isEmpty());

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