import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sunjing on 10/10/16.
 */
public class MillimetreTest {
    @Test
    public void oneMillimetreEqualsOneMillitre() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(1);

        assertEquals(millimetre1.length, millimetre2.toMilimetre(), 0);
    }

    @Test
    public void tenMillimetreEqualsOneCentimeter() throws Exception {
        Millimetre millimetre = new Millimetre(10);
        Centimeter centimeter = new Centimeter(1);

        assertEquals(centimeter.length, millimetre.toCentimeter(), 0);
    }

    @Test
    public void thousandMillimetreEqualsOneMeter() throws Exception {
        Millimetre millimetre = new Millimetre(1000);
        Meter meter = new Meter(1);

        assertEquals(meter.length, millimetre.toMeter(), 0);
    }
}