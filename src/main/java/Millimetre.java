/**
 * Created by sunjing on 9/26/16.
 */
public class Millimetre extends Length{
    public Millimetre(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        else if (o.getClass() == Centimeter.class) {
            Centimeter that = (Centimeter) o;
            if (Double.compare(that.length *10, length) != 0) {
                return false;
            }
            return true;
        }
        else if (o.getClass() == Meter.class) {
            Meter that = (Meter) o;
            if (Double.compare(that.length *1000, length) != 0) {
                return false;
            }
            return true;
        }

        Millimetre that = (Millimetre) o;

        if (Double.compare(that.length, length) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public double toCentimeter() {
        return this.length * 0.1;
    }

    @Override
    public double toMilimetre() {
        return this.length;
    }

    @Override
    public double toMeter() {
        return this.length * 0.001;
    }
}
