package recipe;

import java.util.List;

public class Supper extends Recipe {
    private boolean isLongRest;


    public Supper(String title, List<String> ingredients, String instructions, boolean isLongRest) {
        super(title, ingredients, instructions);

    }


    @Override
    public String getType() {
        return "Long Rest";
    }

    @Override
    public String getFood() {
        return "supper";
    }
}
