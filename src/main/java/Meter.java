/**
 * Created by sunjing on 9/26/16.
 */
public class Meter extends Length{
    public Meter(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        else if (o.getClass() == Millimetre.class) {
            Millimetre that = (Millimetre) o;
            if(Double.compare(that.length, length *1000) != 0) {
                return false;
            }
            return true;
        }

        else if (o.getClass() == Centimeter.class) {
            Centimeter that = (Centimeter) o;
            if (Double.compare(that.length, length *100) != 0) {
                return false;
            }
            return true;
        }

        Meter meter1 = (Meter) o;

        return Double.compare(meter1.length, length) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public double toCentimeter() {
        return this.length * 100;
    }

    @Override
    public double toMilimetre() {
        return this.length * 1000;
    }

    @Override
    public double toMeter() {
        return this.length;
    }
}
