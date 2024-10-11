import java.util.Scanner;



public class SubMenuAdd  {
    Scanner sc = new Scanner(System.in);

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
                System.out.print(">");
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

    }

    private void recipeInput() {

    }
}