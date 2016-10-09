import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sunjing on 10/10/16.
 */
public class CentimeterTest {
    @Test
    public void oneCentimeterEqualsOneCentimeter() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(1);

        assertEquals(centimeter1.length,centimeter2.toCentimeter(),0);
    }

    @Test
    public void handredCentimeterEqualsOneMeter() throws Exception {
        Centimeter centimeter = new Centimeter(100);
        Meter meter = new Meter(1);

        assertEquals(centimeter.toMeter(),meter.length, 0);
    }

    @Test
    public void tenMillimetreEqualsOneCentimeter() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        Millimetre millimetre = new Millimetre(10);

        assertEquals(centimeter.toMilimetre(), millimetre.length, 0);
    }
}