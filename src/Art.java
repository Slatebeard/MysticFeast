import se.slatebeard.util.QOL;

public class Art {

    // Art //
    private static String logo = """
                        \033[0;32m                                  Welcome To The     \033[0m
            
                                    ▗▖  ▗▖▄   ▄  ▄▄▄  ■  ▄ ▗▞▀▘    ▗▄▄▄▖▗▞▀▚▖▗▞▀▜▌ ▄▄▄  ■ \s
                                    ▐▛▚▞▜▌█   █ ▀▄▄▗▄▟▙▄▖▄ ▝▚▄▖    ▐▌   ▐▛▀▀▘▝▚▄▟▌▀▄▄▗▄▟▙▄▖
                                    ▐▌  ▐▌ ▀▀▀█ ▄▄▄▀ ▐▌  █         ▐▛▀▀▘▝▚▄▄▖     ▄▄▄▀ ▐▌ \s
                                    ▐▌  ▐▌▄   █      ▐▌  █         ▐▌                  ▐▌ \s
                                           ▀▀▀       ▐▌                                ▐▌ \s
            
            
                          \033[0;32m         Find a seat near the hearth and get ready to order... \033[0m
            """;

    private static String sepRator1 = "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";
    private static String placer = ">";


    // Text //
    private static String menu1 = """
            1. Add a new recipe.
               * The tavern keep will open his dusty old cookbook and you together will come up a new recipe...
            2. Show all recipes.
               * The tavern keep will show you a list of all recipes, new and old...
            3. Remove a recipe.
               * Based on feedback the tavern keep will throw a bad recipe into the fire...
            4. Exit the tavern.
               * Say your goodbyes and venture out into the rain once more...
            """;


    private static String subMenuAdd = """
            1. Come up with a new recipe.
               * Choose from a list of building blocks to create a new type of food...
            2. Enter a new recipe.
               * Enter your own custom recipe into the cookbook tome...
            3. Exit.
               * Go back to the main menu...
            """;

    private static String subMenuAdd2 = """
            Choose from a type of recipe you'd like to create.
            1. Breakfast.
               * A hearty morning feast to prepare for adventure...
            2. Lunch.
               * Midday rations to fuel a hero’s journey...
            3. Supper.
               * A twilight banquet shared by the campfire’s glow.
            4. Snack.
               * A quick nibble to sustain you between quests...
            5. Exit.
               * Return to the main menu.
            """;


    private static String subMenuAddIngredientsList = """
            1. Wheat
            2. Eggs
              * Fresh from the hen's nest.
            3. Milk
              * Straight from the village dairy.
            4. Mandragora's Tail
              * A rare root with magical properties.
            5. Honey
            6. Dragon Scales
              * Shimmering and sharp, used for potions.
            7. Elven Spice
              * A fragrant blend of rare herbs.
            8. Rabbit Meat
              * Skinned and ready for the stew.
            9. Basilisk Eye
              * Known to petrify if not prepared correctly.
            10. Barley
            11. Gorgon Blood
              * A potent ingredient for dark brews.
            12. Goat Cheese
            13. Griffon Feather
              * Said to enhance strength when consumed.
            14. Herbs of the Wilds
              * A mix of forest flowers and leaves.
            15. Troll Fat
              * A thick and greasy substance, hard to acquire.
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

    public static void subMenuAddIngredientsList() {
        System.out.println(subMenuAddIngredientsList);
    }

    // Other Methods
    public static void menuRefresh() {
        QOL.clearConsole();
        Art.logo();
    }
}

