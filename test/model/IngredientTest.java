package test.model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import exceptions.InvalidNumberException;
import model.Ingredient;
import model.Recipe;
public class IngredientTest {
    private Ingredient ingredient;
    public void setupStage1(){
        ingredient = new Ingredient();
        ingredient.setName("Tomate");
        ingredient.setWeight(245);
    }
    @Test
    public void addWeightSuccesfullyTest() {
        setupStage1();

        ingredient.addWeight(54);

        assertEquals(299, ingredient.getWeight());
    }

    @Test
    public void addNegativeWeightTest() {
        setupStage1();

        assertThrows(InvalidNumberException.class, () -> ingredient.addWeight(-100));
        assertEquals(245, ingredient.getWeight());
    }

    @Test
    public void removeWeightTestSuccessfully(){
        setupStage1();

        ingredient.removeWeight(45);

        assertEquals(200, ingredient.getWeight());
    }

    @Test
    public void removeNegativeWeightTest() {
        setupStage1();

        assertThrows(InvalidNumberException.class, () -> ingredient.addWeight(-100));
        assertEquals(245, ingredient.getWeight());
    }
}
