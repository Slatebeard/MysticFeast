package recipe;

public abstract class Recipe {
    private String title;
    private String[] ingredients;
    private String instructions;


    // GETTERS
    public String getTitle() {
        return title;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    // RECIPE
    public Recipe(String title, String[] ingredients, String instructions) {
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public abstract String getType();

}
