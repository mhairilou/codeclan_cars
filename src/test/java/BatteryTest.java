import VehicleParts.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {
    Battery testBattery;

    @Before
    public void before(){
        testBattery = new Battery(100, 90);
    }

    @Test
    public void batteryHasCapacity(){
        assertEquals(100, testBattery.getCapacity());
    }

    @Test
    public void batteryHasCharge(){
        assertEquals(90, testBattery.getCurrentCharge());
    }

    @Test
    public void canChargeBattery(){
        testBattery.charge(3);
        assertEquals(93, testBattery.getCurrentCharge());
    }

    @Test
    public void cannotChargeBatteryBeyondCapacity(){
        testBattery.charge(120);
        assertEquals(100, testBattery.getCurrentCharge());
    }
}
