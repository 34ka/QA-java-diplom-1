package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest  {

    @Test
    public void getNameReturnsCorrectName() {

        Bun bun = new Bun("Name", 10);

        String expectedName = "Name";
        String actualName = bun.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceReturnsCorrectPrice() {

        Bun bun = new Bun("Name", 10);

        float expectedPrice = 10;
        float actualPrice = bun.getPrice();

        assertEquals(expectedPrice, actualPrice, 2);
    }
}