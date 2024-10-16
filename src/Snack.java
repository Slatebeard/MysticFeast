public class Snack extends Recipe {
    private boolean isBonusAction;

    public Snack(String title, String[] ingredients, String instructions, boolean isBonusAction) {
        super(title,ingredients,instructions);
        this.isBonusAction = isBonusAction;
    }

    public boolean isBonusAction() {
        return isBonusAction;
    }

    public void setBonusAction(boolean bonusAction) {
        isBonusAction = bonusAction;
    }
}


