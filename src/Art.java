public class Art {


    static String intro = """
                                Welcome to the tavern!
            
            Find a seat near the hearth and get ready to order...
            """;

    static String menu1 = """
            1. Create a new recipe.
               * The tavern keep will come up with a recipe based on your input!
            2. Show all recipes.
               * The tavern keep will show you a list of all recipes, new and old...
            3. Remove a recipe.
               * Based on feedback the tavern keep will throw a bad recipe into the fire...
            """;


    public static void intro() {
        System.out.println(intro);
    }
    public static void menu1() {
        System.out.println(menu1);
    }

}

