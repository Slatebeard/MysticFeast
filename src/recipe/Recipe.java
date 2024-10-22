package recipe;

import java.util.List;

public abstract class Recipe {
    private String title;
    private List<String> ingredients;
    private String instructions;



    public String getTitle() {
        return title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    // RECIPE
    public Recipe(String title, List<String> ingredients, String instructions) {
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public abstract String getType();

    public abstract String getFood();

}
