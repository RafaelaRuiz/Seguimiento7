package test.model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import model.Recipe;
public class RecipeTest{
    private Recipe recipe;

    public void setupStage1() {
        recipe = new Recipe();
    }

    public void setupStage2() {
        recipe = new Recipe();
        recipe.addIngredient("Cebolla", 315);
        recipe.addIngredient("Ajo", 58);
        recipe.addIngredient("Arroz", 520);
    }

    @Test
    public void addUniqueIngredientTest() {
        setupStage1();

        recipe.addIngredient("Sal", 12);

        assertTrue(recipe.contains("Sal"));
        assertEquals(12, recipe.weightCompare("Sal"));
    }

    @Test
    public void addMultipleIngredientsTest() {
        setupStage2();

        recipe.addIngredient("Pimienta", 6);

        assertEquals();
    }

    @Test
    public void addExistentIngredientTest() {
        setupStage2();

        recipe.addIngredient("Ajo", 21);

        assertTrue(recipe.contains("Ajo"));
        assertEquals(79,recipe.weightCompare("Ajo"));
    }

    @Test
    public void removeIngredientTest(){
        setupStage2();

        recipe.removeIngredient("Ajo");

        assertFalse(recipe.contains("Ajo"));
    }
}