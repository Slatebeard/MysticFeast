package recipe;

import java.util.List;

public class Snack extends Recipe {
    private boolean isBonusAction;

    public Snack(String title, List<String> ingredients, String instructions, boolean isBonusAction) {
        super(title,ingredients,instructions);
        this.isBonusAction = isBonusAction;
    }

    public boolean isBonusAction() {
        return isBonusAction;
    }

    public void setBonusAction(boolean bonusAction) {
        isBonusAction = bonusAction;
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


