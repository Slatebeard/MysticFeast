import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MainMenu {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public MainMenu() {
        runMenu();
    }

    protected void runMenu() {
        // Variables
        boolean running = true;
        int menuChoise = 0;


        // Objects
        RecipeBook recipeBook = new RecipeBook();

        while (running) {
            QOL.clearConsole();
            Art.intro();
            Art.menu1();


            //TODO Figure out a smart way to check for valid input


            try {
                System.out.print(">");
                menuChoise = sc.nextInt();



                if (menuChoise < 1 || menuChoise > 4) {
                    System.out.println("Please select a valid option...");
                }

                switch (menuChoise) {
                    case 1: {
                        new SubMenuAdd();
                    }
                    case 2: {
                        new SubMenuShowAll();
                    }
                    case 3: {
                        new SubMenuRemove();
                    }
                    case 4: {
                        System.out.println();
                        running = false;
                    }


                }
            } catch (Exception e) {
                System.out.println("Invalid option");
                sc.nextLine();
            }
        }
    }
}
