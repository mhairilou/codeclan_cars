package VehicleParts;

public class Battery {

    int capacity;
    int currentCharge;

    public Battery(int capacity, int currentCharge){
        this.capacity = capacity;
        this.currentCharge = currentCharge;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentCharge() {
        return currentCharge;
    }

    public void setCurrentCharge(int currentCharge) {
        this.currentCharge = currentCharge;
    }

    public void charge(int amount){
        this.currentCharge += amount;
        if(this.currentCharge > this.capacity){
            this.currentCharge = this.capacity;
        }
    }


}
