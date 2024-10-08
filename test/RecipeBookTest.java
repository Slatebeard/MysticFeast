package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class RecipeBookTest {




    //TODO Creat the functionality in the recipeBook class
    @Test
    public void testAddRecipe() {
        Recipe pancakes = new Recipie("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBook.addRecipe(pancakes);
        assertEquals(1, recipeBook.getAllRecipes().size());
    }


    //TODO Add more tests DONE

    @Test
    public void testViewRecipe() {
        Recipe pancakes = new Recipie("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBook.addRecipe(pancakes);
        Recipe viewRecipe = recipeBook.getRecipe("Pancakes");
        assertNotNull(viewRecipe);
        assertEquals("Pancakes", viewRecipe.getTitle());
    }


    //TODO Add another test DONE!



    @Test
    public void testRemoveRecipe() {
        Recipe pancakes = new Recipie("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBook.addRecipe(pancakes);
        recipeBook.removeRecipe(pancakes);
        assertEquals(0, recipeBook.getAllRecipies().size());

    }
}