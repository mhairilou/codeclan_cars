import VehicleParts.Tyre;
import Vehicles.Car;
import VehicleParts.Engine;
import VehicleParts.Battery;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar testElectricCar;
    Engine testEngine;
    Tyre testTyre;

    Battery testBattery;


    @Before
    public void before(){
        testEngine = new Engine("Combustion", 7);
        testTyre = new Tyre(6, "Sparklerainbows");
        testBattery = new Battery(100, 77);
        testElectricCar = new ElectricCar("Blue", 60, testEngine, testTyre, testBattery);

    }

    @Test
    public void carHasColour(){
        assertEquals("Blue", testElectricCar.getColour());
    }

    @Test
    public void canChangeCarColour(){
        testElectricCar.setColour("Pink");
        assertEquals("Pink", testElectricCar.getColour());
    }

    @Test
    public void carHasValue(){
        assertEquals(60, testElectricCar.getValue());
    }

    @Test
    public void canSetCarValue(){
        testElectricCar.setValue(80);
        assertEquals(80, testElectricCar.getValue());
    }

    @Test
    public void hasEngine(){
        assertEquals("Combustion", testElectricCar.getEngine().getType());
    }

    @Test
    public void hasTyre(){
        assertEquals("Sparklerainbows", testElectricCar.getTyre().getColour());
    }

    @Test
    public void hasBattery(){
        assertEquals(77, testElectricCar.getBattery().getCurrentCharge());
    }


}
