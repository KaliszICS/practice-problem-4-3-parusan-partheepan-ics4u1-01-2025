/**
 * Represents a Chair with legs and material attributes.
 * This class provides multiple constructors for creating chairs
 * with different initialization patterns and default values.
 * 
 * @author Parusan
 * @version 1.0
 */
public class Chair {
    private int legs;
    private String material;
    
    /**
     * Constructs a default Chair with 4 legs and "wood" material.
     * This no-argument constructor creates a standard wooden chair.
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }
    
    /**
     * Constructs a Chair with specified number of legs and default "wood" material.
     * This constructor allows custom leg count while maintaining wood as the default material.
     *
     * @param legs the number of legs for the chair, must be a positive integer
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }
    
    /**
     * Constructs a Chair with specified number of legs and material.
     * This constructor allows full customization of both chair attributes.
     *
     * @param legs the number of legs for the chair, must be a positive integer
     * @param material the material of the chair, cannot be null
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }
    
    /**
     * Returns the number of legs of this chair.
     *
     * @return the number of legs as an integer
     */
    public int getLegs() {
        return legs;
    }
    
    /**
     * Returns the material of this chair.
     *
     * @return the chair material as a String
     */
    public String getMaterial() {
        return material;
    }
}