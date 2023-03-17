package test.model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import model.Ingredient;
import model.Recipe;
public class IngredientTest {
    private Ingredient ingredient;
    public void setupStage1(){
        ingredient = new Ingredient();
        ingredient.setName("Tomate");
        ingredient.setWeight(245);
    }
}
