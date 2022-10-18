package Vehicles;

import VehicleParts.Battery;
import VehicleParts.Engine;
import VehicleParts.Tyre;


public class ElectricCar extends Vehicle{

    Battery battery;

    public ElectricCar(String colour, int value, Engine engine, Tyre tyre, Battery battery){
        super(colour, value, engine, tyre);
        this.battery = battery;

    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
