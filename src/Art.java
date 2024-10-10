public class Art {


    static String intro = """
                        \033[0;32m                                  Welcome To The     \033[0m
            
                                    ▗▖  ▗▖▄   ▄  ▄▄▄  ■  ▄ ▗▞▀▘    ▗▄▄▄▖▗▞▀▚▖▗▞▀▜▌ ▄▄▄  ■ \s
                                    ▐▛▚▞▜▌█   █ ▀▄▄▗▄▟▙▄▖▄ ▝▚▄▖    ▐▌   ▐▛▀▀▘▝▚▄▟▌▀▄▄▗▄▟▙▄▖
                                    ▐▌  ▐▌ ▀▀▀█ ▄▄▄▀ ▐▌  █         ▐▛▀▀▘▝▚▄▄▖     ▄▄▄▀ ▐▌ \s
                                    ▐▌  ▐▌▄   █      ▐▌  █         ▐▌                  ▐▌ \s
                                           ▀▀▀       ▐▌                                ▐▌ \s
            
            
                          \033[0;32m         Find a seat near the hearth and get ready to order... \033[0m
            """;

    static String menu1 = """
            1. Create a new recipe.
               * The tavern keep will come up with a recipe based on your input!
            2. Show all recipes.
               * The tavern keep will show you a list of all recipes, new and old...
            3. Remove a recipe.
               * Based on feedback the tavern keep will throw a bad recipe into the fire...
            4. Exit the tavern.
               * Venture out into the rain once more...
            """;


    public static void intro() {
        System.out.println(intro);
    }

    public static void menu1() {
        System.out.println(menu1);
    }

}

