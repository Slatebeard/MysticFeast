package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;



class RecipeBookTest {




















    //TODO Creat the functionality in the recipeBook class
    @Test
    public void testAddRecipe() {
        RecipeTest pancakes = new RecipeTest("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBookTest.addRecipe(pancakes);
        assertEquals(1, recipeBookTest.getAllRecipes().size());
    }


    //TODO Add more tests DONE

    @Test
    public void testViewRecipe() {
        RecipeTest pancakes = new RecipeTest("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBookTest.addRecipe(pancakes);
        RecipeTest viewRecipe = recipeBookTest.getRecipe("Pancakes");
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