public class Chair {
    private int legs;
    private String material;
    
    // Constructor 1: No parameters - legs=4, material="wood"
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }
    
    // Constructor 2: One parameter - sets legs, material="wood"
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }
    
    // Constructor 3: Two parameters - sets both legs and material
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }
    
    // Getters
    public int getLegs() {
        return legs;
    }
    
    public String getMaterial() {
        return material;
    }
}