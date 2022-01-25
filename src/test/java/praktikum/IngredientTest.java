package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    @Test
    public void getNameReturnsCorrectName() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);

        String expectedName = "hot sauce";
        String actualName = ingredient.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceReturnsCorrectPrice() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);

        float expectedPrice = 100;
        float actualPrice = ingredient.getPrice();

        assertEquals(expectedPrice, actualPrice, 2);
    }

    @Test
    public void getTypeReturnsCorrectType() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);

        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredient.getType();

        assertEquals(expectedType, actualType);
    }
}