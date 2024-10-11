public class Art {

    // Art
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


    // Text
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
}

