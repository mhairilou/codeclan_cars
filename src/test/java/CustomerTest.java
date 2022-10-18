import People.Customer;
import VehicleParts.Battery;
import VehicleParts.Tyre;
import Vehicles.Car;
import VehicleParts.Engine;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer testCustomer;
    Car testCar;
    Car expensiveCar;
    Engine testEngine;
    Tyre testTyre;
    ElectricCar testElectricCar;
    Battery testBattery;

    @Before
    public void before(){
        testCustomer = new Customer(100);
        testCar = new Car("Yellow", 50, testEngine, testTyre);
        expensiveCar = new Car("Glitter", 200, testEngine, testTyre);
        testElectricCar = new ElectricCar("Red", 99, testEngine, testTyre, testBattery);
    }

    @Test
    public void canGetMoney(){ assertEquals(100, testCustomer.getMoney());}

    @Test
    public void vehiclesOwnedBeginsEmpty(){ assertEquals(0, testCustomer.getVehiclesOwned().size());}

    @Test
    public void canAddVehicleToVehiclesOwned(){
        testCustomer.addVehicleToOwnedVehicles(testCar);
        assertEquals(1, testCustomer.getVehiclesOwned().size());}

    @Test
    public void canBuyVehicle(){
        testCustomer.buyVehicle(testElectricCar);
        assertEquals(1, testCustomer.getMoney());
        assertEquals(1, testCustomer.getVehiclesOwned().size());}


    @Test
    public void cannotBuyIfCannotAfford(){
    testCustomer.buyVehicle(expensiveCar);
        assertEquals(100, testCustomer.getMoney());
        assertEquals(0, testCustomer.getVehiclesOwned().size());}
}


