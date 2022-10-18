import People.Customer;
import People.Dealer;
import VehicleParts.Battery;
import VehicleParts.Tyre;
import Vehicles.Car;
import VehicleParts.Engine;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer testDealer;
    Car testCar;
    Engine testEngine;
    Tyre testTyre;
    ElectricCar testElectricCar;
    Battery testBattery;

    @Before
    public void before(){
        testDealer = new Dealer(100);
        testCar = new Car("Yellow", 50, testEngine, testTyre);
        testElectricCar = new ElectricCar("Red", 99, testEngine, testTyre, testBattery);
    }

    @Test
    public void tillHasMoney(){ assertEquals(100, testDealer.getTill());}

    @Test
    public void vehiclesOwnedBeginsEmpty(){ assertEquals(0, testDealer.getStock().size());}

    @Test
    public void canAddVehicleToVehiclesOwned(){
        testDealer.addVehicleToStock(testCar);
        assertEquals(1, testDealer.getStock().size());}

    @Test
    public void canRemoveVehicle(){
        testDealer.addVehicleToStock(testCar);
        testDealer.removeVehicleFromStock(testCar);
        assertEquals(0, testDealer.getStock().size());}


}


