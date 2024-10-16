import menu.RecipeBook;
import org.junit.jupiter.api.Test;
import recipe.Breakfast;
import recipe.Recipe;

import static org.junit.jupiter.api.Assertions.*;


public class RecipeBookTest {


    // It works, thank the gods...


    @Test
    void testAddRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        String[] ingredients = {"Flour", "Eggs"};
        String instructions = "Mix and cook";
        Breakfast pancakes = new Breakfast("Pancakes", ingredients,instructions,true);
        recipeBook.addRecipe(pancakes);
        assertEquals(1, recipeBook.getAllRecipes().size());
    }


    @Test
    void testViewRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        String[] ingredients = {"Flour", "Eggs"};
        String instructions = "Mix and cook";
        Breakfast pancakes = new Breakfast("Pancakes", ingredients,instructions,true);
        recipeBook.addRecipe(pancakes);
        Recipe viewRecipe = recipeBook.getRecipeByName("Pancakes");
        assertNotNull(viewRecipe);
        assertEquals("Pancakes", viewRecipe.getTitle());
    }


    @Test
    void testRemoveRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        String[] ingredients = {"Flour", "Eggs"};
        String instructions = "Mix and cook";
        Breakfast pancakes = new Breakfast("Pancakes", ingredients,instructions,true);
        recipeBook.addRecipe(pancakes);
        recipeBook.removeRecipe(pancakes);
        assertEquals(0, recipeBook.getAllRecipes().size()); // Fixed typo
    }
}
