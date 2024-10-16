package menu;

import recipe.Breakfast;
import recipe.Recipe;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class RecipeBook {
    private final List<Recipe> recipes;


    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }

    public int recipeCount() {
        return recipes.size();
    }

    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    public Recipe getRecipeByName(String title) {
        for (Recipe recipe : recipes) {
            if (recipe.getTitle().equals(title)) {
                return recipe;
            }
        }
        return null;
    }
}


//TODO fix IO


//    public void loadAllRecipes(List<Recipe> recipes) {
//        File folder = new File("recipes");
//        File[] listOfFiles = folder.listFiles((dir, name) -> name.endsWith(".txt"));
//
//        if (listOfFiles != null) {
//            for (File file : listOfFiles) {
//                Recipe recipe = readRecipeFromFile(file);
//                if (recipe != null) {
//                    addRecipe(recipe);
//
//                }
//            }
//        } else {
//            System.out.println("No recipes found");
//        }
//    }

//    private Recipe readRecipeFromFile(File file) {
//        try (Scanner sc = new Scanner(file)) {
//            String foodType = sc.nextLine();
//
//
//
//            if (foodType.equals("breakfast")) {
//                String title = sc.nextLine().split(": ")[1];
//                for (Recipe recipe : recipes) {
//                    int i = 0;
//                    String[] instructions = new String[];
//                    if (!sc.nextLine().equals("Instructions")) {
//                        instructions[i] = sc.nextLine();
//                    }
//                }
//
//            }
//
//
//            }
//        }
//    }
//
//
//    public void saveAllRecipes(List<Recipe> recipes) {
//        File folder = new File("recipes");
//        if (!folder.exists()) {
//            folder.mkdir();
//        }
//
//        for (Recipe recipe : recipes) {
//            String filename = "recipes/" + recipe.getTitle() + ".txt";
//            try (PrintWriter writer = new PrintWriter(filename)) {
//                printRecipeToFile(recipe, writer);
//            } catch (IOException e) {
//                System.out.println("An error occurred while saving recipe " + recipe.getTitle());
//                e.printStackTrace();
//            }
//        }
//    }

//    private void printRecipeToFile(Recipe recipe, PrintWriter writer) {
//        writer.println(recipe.getFood();
//        writer.println("Title: " + recipe.getTitle());
//        writer.println("Ingredients: ");
//        for (String ingredient : recipe.getIngredients()) {
//            writer.println("- " + ingredient);
//        }
//        writer.println("Instructions: " + recipe.getInstructions());
//        writer.println("Time to eat: " + recipe.getType());
//    }
//}