import VehicleParts.Tyre;
import Vehicles.Car;
import VehicleParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car testCar;
    Engine testEngine;
    Tyre testTyre;


    @Before
    public void before(){
        testEngine = new Engine("Combustion", 7);
        testTyre = new Tyre(6, "Sparklerainbows");
        testCar = new Car("Blue", 60, testEngine, testTyre);

    }

    @Test
    public void carHasColour(){
        assertEquals("Blue", testCar.getColour());
    }

    @Test
    public void canChangeCarColour(){
        testCar.setColour("Pink");
        assertEquals("Pink", testCar.getColour());
    }

    @Test
    public void carHasValue(){
        assertEquals(60, testCar.getValue());
    }

    @Test
    public void canSetCarValue(){
        testCar.setValue(80);
        assertEquals(80, testCar.getValue());
    }

    @Test
    public void hasEngine(){
        assertEquals("Combustion", testCar.getEngine().getType());
    }

    @Test
    public void hasTyre(){
        assertEquals("Sparklerainbows", testCar.getTyre().getColour());
    }


}
