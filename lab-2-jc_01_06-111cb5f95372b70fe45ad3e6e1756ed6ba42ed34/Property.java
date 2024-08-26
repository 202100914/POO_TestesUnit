

/**
 * A property to sell.
 *
 * @author POO
 * @version março/2023
 */
public class Property {

    private static int numberOfProperties = 0;
    private final String id;
    private String model;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {

    }

    /**
     * Id selector.
     */
    public String getId() {
    }

    /**
     * Description selector.
     */
    public String getDescription() {

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
    }
}
