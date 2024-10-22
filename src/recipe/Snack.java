package recipe;

import java.util.List;

public class Snack extends Recipe {
    private boolean isBonusAction;

    public Snack(String title, List<String> ingredients, String instructions, boolean isBonusAction) {
        super(title,ingredients,instructions);
    }

    @Override
    public String getType() {
        return "Long Rest";
    }


    @Override
    public String getFood() {
        return "snack";
    }
}


