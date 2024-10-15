import java.util.ArrayList;
import java.util.List;


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
}