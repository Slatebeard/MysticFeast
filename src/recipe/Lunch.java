package recipe;

import java.util.List;

public class Lunch extends Recipe {
    private boolean isShortRest;

    public Lunch(String title, List<String> ingredients, String instructions, boolean isShortRest) {
        super(title, ingredients, instructions);
        this.isShortRest = isShortRest;
    }

    public boolean isShortRest() {
        return isShortRest;
    }

    public void setShortRest(boolean shortRest) {
        isShortRest = shortRest;
    }

    @Override
    public String getType() {
        return "Long Rest";
    }

    @Override
    public String getFood() {
        return "lunch";
    }

}
