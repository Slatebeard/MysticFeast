import java.util.Random;
import java.util.Scanner;


public class MainMenu {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public MainMenu() {
        System.out.println("Welcome to the main menu");
        runMenu();
    }

    public void runMenu() {
        // Variables
        boolean running = true;
        int userChoice = sc.nextInt();

        // Objects
        new RecipeBook();

        while (running) {
            QOL.clearConsole();
            System.out.println(Art.intro);


            switch (userChoice) {
                case 1 -> new 

            }
        }
    }
}
