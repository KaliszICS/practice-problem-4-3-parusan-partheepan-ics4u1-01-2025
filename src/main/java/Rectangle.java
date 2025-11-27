/**
 * Represents a geometric rectangle with length and width dimensions.
 * This class provides multiple constructors for creating rectangles
 * with different initialization patterns.
 * 
 * @author Parusan
 * @version 1.0
 */
public class Rectangle {
    private double length;
    private double width;
    
    /**
     * Constructs a default Rectangle with length 4 and width 8.
     * This no-argument constructor creates a rectangle with predefined dimensions.
     */
    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }
    
    /**
     * Constructs a Rectangle with specified length and default width of 8.
     * This constructor allows custom length while maintaining a standard width.
     *
     * @param length the length of the rectangle, must be positive
     */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }
    
    /**
     * Constructs a Rectangle with specified length and width dimensions.
     * This constructor allows full customization of both dimensions.
     *
     * @param length the length of the rectangle, must be positive
     * @param width the width of the rectangle, must be positive
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Returns the length of this rectangle.
     *
     * @return the length dimension as a double value
     */
    public double getLength() {
        return length;
    }
    
    /**
     * Returns the width of this rectangle.
     *
     * @return the width dimension as a double value
     */
    public double getWidth() {
        return width;
    }
}