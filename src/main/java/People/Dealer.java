package People;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealer {

    private int till;
    private ArrayList<Vehicle> stock;

    public Dealer(int till){
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Vehicle> stock) {
        this.stock = stock;
    }

    public void addVehicleToStock(Vehicle vehicleToAdd){
        this.stock.add(vehicleToAdd);
    }

    public void removeVehicleFromStock(Vehicle vehicleToRemove){
        this.stock.remove(vehicleToRemove);
    }
}
