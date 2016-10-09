import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by sunjing on 9/26/16.
 */
public class SameUnitEquals {
    @Test
    public void shouldReturnTrueWhenReceiveTwoSameMeterObjs() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(1);

        assertTrue(meter1.equals(meter2));
    }

    @Test
    public void shouldReturnFalseWhenReceiveTwoDifferentMeterObjs() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(2);

        assertFalse(meter1.equals(meter2));
    }

    @Test
    public void shouldReturnTrueWhenReceiveTwoSameCentimeterObjs() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(1);

        assertTrue(centimeter1.equals(centimeter2));
    }

    @Test
    public void shouldReturnFalseWhenReceiveTwoDifferentCentimeterObjs() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(2);

        assertFalse(centimeter1.equals(centimeter2));
    }

    @Test
    public void shouldReturnTrueWhenReceiveTwoSameMillimetreObjs() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(1);

        assertTrue(millimetre1.equals(millimetre2));
    }

    @Test
    public void shouldReturnFalseWhenReceiveTwoDifferentMillimetre2Objs() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(2);

        assertFalse(millimetre1.equals(millimetre2));
    }

}

