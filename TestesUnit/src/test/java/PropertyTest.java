import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {

    private Property property1;

    @BeforeEach
    public void setUp() {
        property1 = new Property("T3 Monte Belo", 150000.0);
    }

    @Test
    public void testConstructor(){
        assertEquals(150000.0, property1.getPrice());
        assertEquals("T3 Monte Belo", property1.getDescription());
    }

    @Test
    public void testToString(){
        String expected =   "Propriedade:\n" +
                            "Modelo: T3 Monte Belo\n" +
                            "Preço: 150000.0 Euros";

        assertEquals(expected, property1.toString());
    }

}