import VehicleParts.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {


    Tyre testTyre;

    @Before
    public void before(){
        testTyre = new Tyre(5, "NEON AND FLASHY");
    }

    @Test
    public void tyreHasThickness(){
        assertEquals(5, testTyre.getThickness());
    }

    @Test
    public void tyreHasColour(){
        assertEquals("NEON AND FLASHY", testTyre.getColour());
    }

    @Test
    public void canSetThickness(){
        testTyre.setThickness(4);
        assertEquals(4, testTyre.getThickness());
    }

    @Test
    public void canSetColour(){
        testTyre.setColour("Some boring colour");
        assertEquals("Some boring colour", testTyre.getColour());
    }


}
