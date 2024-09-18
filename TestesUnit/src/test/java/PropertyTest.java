import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {

    private Property property1;

    @Test
    public void testConstructor(){
        property1 = new Property("T3 Monte Belo", 150000.0);
        assertEquals(150000.0, property1.getPrice());
        assertEquals("T3 Monte Belo", property1.getDescription());
    }


}