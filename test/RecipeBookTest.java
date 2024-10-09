import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



@Test
void testAddRecipe() {
    Recipe pancakes = new Recipe("Pancakes", "Flour", "Eggs");
    RecipeBook.addRecipe(pancakes);
    assertEquals(1, recipeBook.getAllRecipes().size());
}


@Test
void testViewRecipe() {
    Recipe pancakes = new Recipe("Pancakes", "Flour", "Eggs");
    recipes.add(pancakes);
    Recipe viewRecipe = recipes.get("Pancakes");
    assertNotNull(viewRecipe);
    assertEquals("Pancakes", viewRecipe.getTitle());
}

@Test
void testRemoveRecipe() {
    Recipe pancakes = new Recipe("Pancakes", "Flour", "Eggs");
    recipeBook.addRecipe(pancakes);
    recipeBook.removeRecipe(pancakes);
    assertEquals(0, recipeBook.getAllRecipies().size());

}
