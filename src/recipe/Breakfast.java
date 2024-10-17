package recipe;

import java.util.List;

public class Breakfast extends Recipe {
    private boolean isLongrest;
    private boolean isBreakfast;

    public Breakfast(String title, List<String> ingredients, String instructions, boolean isLongrest) {
        super(title, ingredients, instructions);
        this.isLongrest = isLongrest;
    }

    public boolean isLongrest() {
        return isLongrest;
    }

    public void setLongrest(boolean longrest) {
        isLongrest = longrest;
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
