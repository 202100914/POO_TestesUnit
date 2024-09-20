

/**
 * A property to sell.
 *
 * @author POO
 * @version março/2023
 */
public class Property {

    private static int numberOfProperties = 0;
    private final int id ;
    private String model;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.id = numberOfProperties++;
        this.model = description;
        this.price = price;
    }

    /**
     * Id selector.
     */
    public String getId() {
        return null;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return model;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {

    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {

    }

    @Override
    public String toString() {
        String expected = "Propriedade:\n" +
                "Modelo: " + model +  "\n" +
                "Preço: " + price +  " Euros";

        return expected;
    }
}
