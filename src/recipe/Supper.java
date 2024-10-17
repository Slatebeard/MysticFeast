package recipe;

import java.util.List;

public class Supper extends Recipe {
    private boolean isLongRest;


    public Supper(String title, List<String> ingredients, String instructions, boolean isLongRest) {
        super(title, ingredients, instructions);
        this.isLongRest = isLongRest;
    }

    public boolean isLongRest() {
        return isLongRest;
    }

    public void setLongRest(boolean longRest) {
        isLongRest = longRest;
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
