package People;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehiclesOwned;

public Customer(int money){
    this.money = money;
    this.vehiclesOwned = new ArrayList<Vehicle>();

}

    public int getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehiclesOwned() {
        return vehiclesOwned;
    }

    public void addVehicleToOwnedVehicles(Vehicle vehicleToAdd){
    this.vehiclesOwned.add(vehicleToAdd);
    }
    public void buyVehicle(Vehicle vehicle){
        int cost = vehicle.getValue();
        if(money >= cost){
        money -= cost;
        addVehicleToOwnedVehicles(vehicle);}

    }

}
