package Vehicles;

import VehicleParts.Engine;
import VehicleParts.Tyre;

public abstract class Vehicle {

    private String colour;
    private int value;
    private Engine engine;
    private Tyre tyre;
    public Vehicle(String colour, int value, Engine engine, Tyre tyre){
        this.colour = colour;
        this.value = value;
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public String drive(){
        return("Broom broom I am being driven yay");
    }


}
