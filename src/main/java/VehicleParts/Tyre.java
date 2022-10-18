package VehicleParts;

public class Tyre {

    private int thickness;
    private String colour;

    public Tyre(int thickness, String colour){
        this.thickness = thickness;
        this.colour = colour;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
