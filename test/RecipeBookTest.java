package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class RecipeBookTest {





    @Test
    public void testAddRecipe() {
        Recipe pancakes = new Recipie("Pancakes", "Flour", "Eggs", "Milk", "Mix ingredients and cook.");
        recipeBook.addRecipe(pancakes);
        assertEquals(1, recipeBook.getAllRecipes().size());
    }
}