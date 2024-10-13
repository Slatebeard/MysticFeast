import java.util.Scanner;



public class SubMenuAdd  {
    Scanner sc = new Scanner(System.in);
    RecipeBook recipeBook = new RecipeBook();
    private boolean running = true;

    public SubMenuAdd() {
        runMenu();
    }


    private void runMenu() {
        // Variables //


        // Flags
//        boolean running = true;
        boolean errorFlag = false;


        // Ints
        int menuChoice = 0;


        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.subMenuAdd();

            if (errorFlag == true) {
                System.out.println("You have entered something wrong... Try again please.");
            } else {
                errorFlag = false;
            }
            try {
                Art.placer();
                menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1: {
                      recipeGenerator();
                      break;
                    }
                    case 2: {
                       recipeInput();
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

                String[] ingredients = IngredientSelector.selectIngredients(recipeType);

                Art.menuRefresh();

                System.out.println("Enter instructions for the " + recipeType + " recipe:");
                Art.placer();
                String instructions = sc.nextLine();

                Art.menuRefresh();

                Recipe recipe = new Recipe(recipeName, ingredients, instructions);

                recipeBook.addRecipe(recipe);

                System.out.println(recipeName + " was recorded in the tome!");



                System.out.println();
                System.out.println("Press 1 to generate another recipe or press Enter to return to the main menu...");
                if (sc.nextLine().equals("1")) {
                    generating = true;
                } else {
                    creating = false;
                    generating = false;
                    running = false;

                }
            }
        }
    }
    

    private void recipeInput() {

    }

    //TODO use this later for creating custom recipe
//    System.out.println("Enter the ingredients for your new " + recipeType + ": " );
//    String[] ingredients = sc.nextLine().split(", ");
}