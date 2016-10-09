import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by sunjing on 9/26/16.
 */
public class DifferentUnitEquals {
    @Test
    public void TenMillimetreShouldEqualsOneCentimeter() throws Exception {
        Millimetre millimetre = new Millimetre(10);
        Centimeter centimeter = new Centimeter(1);

        assertTrue(millimetre.equals(centimeter));
    }

    @Test
    public void OneCentimeterShouldEqualsTenMillimetre() throws Exception {
        Millimetre millimetre = new Millimetre(10);
        Centimeter centimeter = new Centimeter(1);

        assertTrue(centimeter.equals(millimetre));
    }

    @Test
    public void OneThousandMillimetreShouldEqualsOneMeter() throws Exception {
        Millimetre millimetre = new Millimetre(1000);
        Meter meter = new Meter(1);

        assertTrue(millimetre.equals(meter));
    }

    @Test
    public void OneMeterShouldEqualsOneThousandMillimetre() throws Exception {
        Millimetre millimetre = new Millimetre(1000);
        Meter meter = new Meter(1);

        assertTrue(meter.equals(millimetre));
    }

    @Test
    public void TenCentimeterShouldEqualsOneMeter() throws Exception {
        Centimeter centimeter = new Centimeter(10);
        Meter meter = new Meter(1);

        assertTrue(centimeter.equals(meter));

    }
}
