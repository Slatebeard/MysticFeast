public class Art {

    // Art //
    static String logo = """
                        \033[0;32m                                  Welcome To The     \033[0m
            
                                    ▗▖  ▗▖▄   ▄  ▄▄▄  ■  ▄ ▗▞▀▘    ▗▄▄▄▖▗▞▀▚▖▗▞▀▜▌ ▄▄▄  ■ \s
                                    ▐▛▚▞▜▌█   █ ▀▄▄▗▄▟▙▄▖▄ ▝▚▄▖    ▐▌   ▐▛▀▀▘▝▚▄▟▌▀▄▄▗▄▟▙▄▖
                                    ▐▌  ▐▌ ▀▀▀█ ▄▄▄▀ ▐▌  █         ▐▛▀▀▘▝▚▄▄▖     ▄▄▄▀ ▐▌ \s
                                    ▐▌  ▐▌▄   █      ▐▌  █         ▐▌                  ▐▌ \s
                                           ▀▀▀       ▐▌                                ▐▌ \s
            
            
                          \033[0;32m         Find a seat near the hearth and get ready to order... \033[0m
            """;

    static String sepRator1 = "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";
    static String placer = ">";


    // Text //
    static String menu1 = """
            1. Add a new recipe.
               * The tavern keep will open his dusty old cookbook and you together will come up a new recipe...
            2. Show all recipes.
               * The tavern keep will show you a list of all recipes, new and old...
            3. Remove a recipe.
               * Based on feedback the tavern keep will throw a bad recipe into the fire...
            4. Exit the tavern.
               * Say your goodbyes and venture out into the rain once more...
            """;


    static String subMenuAdd = """
            1. Come up with a new recipe.
               * Choose from a list of building blocks to create a new type of food...
            2. Enter a new recipe.
               * Enter your own custom recipe into the cookbook tome...
            3. Exit.
               * Go back to the main menu...
            """;

    static String subMenuAdd2 = """
                                               Welcome to the recipe builder!
                                               
            Choose from a type of recipe you'd like to create.
            1. Breakfast.
            2. Lunch.
            3. Supper.
            4. Snack.
            5. Exit.
               * Return to the main menu.
            """;



    static String subMenuAdd3 = """
            
            """;


    // Methods
    public static void logo() {
        System.out.println(logo);
    }

    public static void menu1() {
        System.out.println(menu1);
    }

    public static void sepRator1() {
        System.out.println(sepRator1);
    }

    public static void subMenuAdd() {
        System.out.println(subMenuAdd);
    }

    public static void subMenuAdd2() {
        System.out.println(subMenuAdd2);
    }

    public static void placer() {
        System.out.print(placer);
    }



    // Other Methods
    public static void menuRefresh() {
        QOL.clearConsole();
        Art.logo();
    }
}

