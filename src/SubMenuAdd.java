import java.util.Scanner;



public class SubMenuAdd  {
    Scanner sc = new Scanner(System.in);
    RecipeBook recipeBook = new RecipeBook();

    public SubMenuAdd() {
        runMenu();
    }


    private void runMenu() {
        // Variables //


        // Flags
        boolean running = true;
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
                    }
                    case 2: {
                       recipeInput();
                    }
                    case 3: {
                        System.out.println();
                        running = false;
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
        boolean errorFlag = false;

            // Recipe Type
        boolean breakfast = false;
        boolean lunch = false;
        boolean supper = false;
        boolean snack = false;


        // Int
        int menuChoice;
        int choice;

        // String



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

                switch (menuChoice) {
                    case 1: {
                        breakfast = true;
                    }
                    case 2: {
                        lunch = true;
                    }
                    case 3: {
                        supper = true;
                    }
                    case 4: {
                        snack = true;
                    }
                    case 5: {
                        System.out.println();
                        generating = false;
                    }
                }
            } catch (Exception e) {
                errorFlag = true;
                sc.nextLine();
            }

            if















        }

    }

    private void recipeInput() {

    }
}