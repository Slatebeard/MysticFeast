package recipe;

import java.util.List;

public class Breakfast extends Recipe {
    private boolean isLongrest;

    public Breakfast(String title, List<String> ingredients, String instructions, boolean isLongrest) {
        super(title, ingredients, instructions);
    }

    @Override
    public String getType() {
        return "Long Rest";
    }

    @Override
    public String getFood() {
        return "breakfast";
    }



}
