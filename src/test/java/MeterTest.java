import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sunjing on 10/10/16.
 */
public class MeterTest {
    @Test
    public void oneMeterEqualsOneMeter() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(1);

        assertEquals(meter1.length,meter2.toMeter(),0);
    }

    @Test
    public void oneMeterEqualsHandredCentimeter() throws Exception {
        Centimeter centimeter = new Centimeter(100);
        Meter meter = new Meter(1);

        assertEquals(centimeter.length,meter.toCentimeter(), 0);
    }

    @Test
    public void oneMeterEqualsThousandMillimetre() throws Exception {
        Meter meter = new Meter(1);
        Millimetre millimetre = new Millimetre(1000);

        assertEquals(millimetre.length, meter.toMilimetre(), 0);
    }
}