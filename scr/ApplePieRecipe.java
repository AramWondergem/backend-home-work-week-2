package scr;

import java.util.ArrayList;
import java.util.HashMap;

public class ApplePieRecipe {
    //variables
    private String name;
    private int numberOfPies;
    static private ArrayList<Ingredient> applePieIngredients = new ArrayList<>;
    static private HashMap<Integer, String> recipeSteps = new HashMap<>();

    //constructor
    public ApplePieRecipe(int numberOfPies) {
        this.numberOfPies=numberOfPies;
        this.name="Appeltaartrecept voor " + numberOfPies + " taart(en)";

    }
}
