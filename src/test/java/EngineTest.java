import VehicleParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine testEngine;

    @Before
    public void before(){
        testEngine = new Engine("Combustion", 3);

    }

    @Test
    public void engineHasType(){
        assertEquals("Combustion", testEngine.getType());
    }

    @Test
    public void engineHasPower(){
        assertEquals(3, testEngine.getPower());
    }

    @Test
    public void canSetType(){
        testEngine.setType("Hybrid");
        assertEquals("Hybrid", testEngine.getType());
    }

    @Test
    public void canSetPower(){
        testEngine.setPower(5);
        assertEquals(5, testEngine.getPower());
    }



}
