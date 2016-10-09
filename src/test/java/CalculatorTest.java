import org.junit.Test;

/**
 * Created by sunjing on 10/10/16.
 */
public class CalculatorTest {

    //Meter
    @Test
    public void oneMeterAndOneMeterEqualsTwoMeter() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(1);
        Meter result = new Meter(2);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.and(meter1,meter2)));
    }

    @Test
    public void oneMeterMinuxOneMeterEqualsZeroMeter() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(1);
        Meter result = new Meter(0);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.minus(meter1,meter2)));
    }

    @Test
    public void oneMeterMultiplesOneMeterEqualsOneMeter() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(1);
        Meter result = new Meter(1);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.multiples(meter1,meter2)));
    }

    @Test
    public void oneMeterDivideOneMeterEqualsOneMeter() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(1);
        Meter result = new Meter(1);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.divide(meter1,meter2)));
    }

    //Centimeter
    @Test
    public void oneCentimeterAndOneCentimeterEqualsTwoCentimeter() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(1);
        Centimeter result = new Centimeter(2);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.and(centimeter1,centimeter2)));
    }

    @Test
    public void oneCentimeterMinusOneCentimeterEqualsZeroCentimeter() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(1);
        Centimeter result = new Centimeter(0);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.minus(centimeter1,centimeter2)));
    }

    @Test
    public void oneCentimeterMultiplesOneCentimeterEqualsOneCentimeter() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(1);
        Centimeter result = new Centimeter(1);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.multiples(centimeter1,centimeter2)));
    }

    @Test
    public void oneCentimeterDivideOneCentimeterEqualsOneCentimeter() throws Exception {
        Centimeter centimeter1 = new Centimeter(1);
        Centimeter centimeter2 = new Centimeter(1);
        Centimeter result = new Centimeter(1);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.divide(centimeter1,centimeter2)));
    }

    //Millimetre
    @Test
    public void oneMillimetreAndOneMillimetreEqualsTwoMillimetre() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(1);
        Millimetre result = new Millimetre(2);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.and(millimetre1,millimetre2)));
    }

    @Test
    public void oneMillimetreMinusOneMillimetreEqualsZeroMillimetre() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(1);
        Millimetre result = new Millimetre(0);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.minus(millimetre1,millimetre2)));
    }

    @Test
    public void oneMillimetreMultiplesOneMillimetreEqualsOneMillimetre() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(1);
        Millimetre result = new Millimetre(1);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.multiples(millimetre1,millimetre2)));
    }

    @Test
    public void oneMillimetreDivideOneMillimetreEqualsOneMillimetre() throws Exception {
        Millimetre millimetre1 = new Millimetre(1);
        Millimetre millimetre2 = new Millimetre(1);
        Millimetre result = new Millimetre(1);
        Calculator calculator = new Calculator();

        assert(result.equals(calculator.divide(millimetre1,millimetre2)));
    }
    
    //And
    @Test
    public void oneCentimeterAndOneMillimetreEquals1_1Centimeter() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        Millimetre millimetre = new Millimetre(1);
        Calculator calculator = new Calculator();
        Centimeter result = new Centimeter(1.1);

        assert(result.equals(calculator.and(centimeter,millimetre)));
    }

    @Test
    public void oneCentimeterAndOneMeterEquals101Centimeter() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        Meter meter = new Meter(1);
        Calculator calculator = new Calculator();
        Centimeter result = new Centimeter(101);

        assert(result.equals(calculator.and(centimeter,meter)));
    }

    //Minus
    @Test
    public void oneMeterMinusOneMillimetreEquals0_999Meter() throws Exception {
        Meter meter = new Meter(1);
        Millimetre millimetre = new Millimetre(1);
        Calculator calculator = new Calculator();
        Meter result = new Meter(0.999);

        assert(result.equals(calculator.minus(meter,millimetre)));
    }

    @Test
    public void oneMeterMinusOneCentimeterEquals0_99Meter() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        Meter meter = new Meter(1);
        Calculator calculator = new Calculator();
        Meter result = new Meter(0.99);

        assert(result.equals(calculator.minus(meter, centimeter)));
    }

    //Multiples
    @Test
    public void oneMeterMultiplesOneMillimetreEquals0_001Meter() throws Exception {
        Meter meter = new Meter(1);
        Millimetre millimetre = new Millimetre(1);
        Calculator calculator = new Calculator();
        Meter result = new Meter(0.001);

        assert(result.equals(calculator.multiples(meter,millimetre)));
    }

    @Test
    public void oneMeterMultiplesOneCentimeterEquals0_01Meter() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        Meter meter = new Meter(1);
        Calculator calculator = new Calculator();
        Meter result = new Meter(0.01);

        assert(result.equals(calculator.multiples(meter, centimeter)));
    }
}