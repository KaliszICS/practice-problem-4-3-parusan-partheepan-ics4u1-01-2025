public class Rectangle {
    private double length;
    private double width;
    
    // Constructor 1: No parameters - length=4, width=8
    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }
    
    // Constructor 2: One parameter - sets length, width=8
    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }
    
    // Constructor 3: Two parameters - sets both length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Getters
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
}