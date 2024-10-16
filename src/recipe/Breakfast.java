package recipe;

public class Breakfast extends Recipe {
    private boolean isLongrest;

    public Breakfast(String title, String[] ingredients, String instructions, boolean isLongrest) {
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
}
