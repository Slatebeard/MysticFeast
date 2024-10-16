package menu;

import recipe.Recipe;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;


public class RecipeBook {
    private List<Recipe> recipes;


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

    public void saveAllRecipes() {
        File folder = new File("recipes");
        if (!folder.exists()) {
            folder.mkdir();
        }

        for (Recipe recipe : recipes) {
            String filename = "recipes/" + recipe.getTitle() + ".txt";
            try(FileWriter writer = new FileWriter(filename)) {

            }
        }
    }
}