package menu;

import recipe.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeBook {
    private List<Recipe> recipes;

    public RecipeBook() {
        recipes = new ArrayList<>();
        loadAllRecipes();
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

    public void loadAllRecipes() {
        File folder = new File("recipes");
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                Recipe recipe = readRecipeFromFile(file);
                if (recipe != null) {
                    addRecipe(recipe);
                }
            }
        } else {
            System.out.println("No recipes found");
        }
    }

    private Recipe readRecipeFromFile(File file) {
        try (Scanner sc = new Scanner(file)) {
            if (!sc.hasNextLine()) {
                return null;
            }
            String foodType = sc.nextLine();


            if (!sc.hasNextLine()) {
                return null;
            }


            // Title
            String title = sc.nextLine().replace("Title: ", "");


            List<String> ingredients = new ArrayList<>();
            String line = "";

            // Ingredients
            while (sc.hasNextLine() && !(line = sc.nextLine()).startsWith("Instructions:")) { // READ UNTIL INSTRUCTIONS
                System.out.println("Reading line: " + line);
                if (!line.trim().isEmpty() && line.startsWith("- ")) {
                    ingredients.add(line.substring(2));
                }
            }
            // Instructions
            String instructions = line.replace("Instructions: ", "");


            // Type
            String type = "";
            if (sc.hasNextLine()) {
                String typeLine = sc.nextLine();
                if (typeLine.startsWith("Time to eat: ")) {
                    type = typeLine.replace("Time to eat: ", "");
                }
            }
            System.out.println("Instructions: " + instructions);
            System.out.println("Time to eat: " + type);

            // Constructors
            switch (foodType.toLowerCase()) {
                case "breakfast":
                    return new Breakfast(title, ingredients, instructions, true);
                case "lunch":
                    return new Lunch(title, ingredients, instructions, true);
                case "supper":
                    return new Supper(title, ingredients, instructions, true);
                case "snack":
                    return new Snack(title, ingredients, instructions, true);
                default:
                    System.out.println("Unknown food type: " + foodType);
                    return null;
            }
        } catch (IOException e) {
            System.out.println("Error reading recipe file: " + file.getName());
        }
        return null;
    }

    public void saveAllRecipes(List<Recipe> recipes) {
        File folder = new File("recipes");
        if (!folder.exists()) {
            folder.mkdir();
        }

        for (Recipe recipe : recipes) {
            String filename = "recipes/" + recipe.getTitle() + ".txt";
            try (PrintWriter writer = new PrintWriter(filename)) {
                printRecipeToFile(recipe, writer);
            } catch (IOException e) {
                System.out.println("An error occurred while saving recipe " + recipe.getTitle());
            }
        }
    }

    private void printRecipeToFile(Recipe recipe, PrintWriter writer) {
        writer.println(recipe.getFood());
        writer.println("Title: " + recipe.getTitle());
        writer.println("Ingredients: ");
        for (String ingredient : recipe.getIngredients()) {
            writer.println("- " + ingredient);
        }
        writer.println("Instructions: " + recipe.getInstructions());
        writer.println("Time to eat: " + recipe.getType());
    }
}
