import java.util.ArrayList;
import java.util.List;


public class RecipeBook {
    private List<Recipe> recipes;


    private RecipeBook recipeBook;


    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}