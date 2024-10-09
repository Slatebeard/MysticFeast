package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;



public class RecipeBookTest {
    private List<RecipeTest> recipes;
    private RecipeBookTest recipeBookTest;


    public RecipeBookTest() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(RecipeTest recipe) {
        recipes.add(recipe);
    }

    public List<RecipeTest> getAllRecipes() {
        return recipes;
    }



    //TODO Try a @BeforeEach ????


    //TODO Creat the functionality in the recipeBook class
    @Test
    public void testAddRecipe() {
        RecipeTest pancakes = new RecipeTest("Pancakes", "Flour", "Eggs");
        RecipeBookTest.addRecipe(pancakes);
        assertEquals(1, recipeBookTest.getAllRecipes().size());
    }


    //TODO Add more tests DONE!

    @Test
    public void testViewRecipe() {
        RecipeTest pancakes = new RecipeTest("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipes.add(pancakes);
        RecipeTest viewRecipe = recipes.get("Pancakes");
        assertNotNull(viewRecipe);
        assertEquals("Pancakes", viewRecipe.getTitle());
    }



    //TODO Add another test DONE!



    @Test
    public void testRemoveRecipe() {
        RecipeTest pancakes = new RecipeTest("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBookTest.addRecipe(pancakes);
        recipeBookTest.removeRecipe(pancakes);
        assertEquals(0, recipeBookTest.getAllRecipies().size());

    }
}