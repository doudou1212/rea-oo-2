/**
 * Created by sunjing on 10/9/16.
 */
public class Calculator {
    public Length and(Length length1, Length length2) {
        if (length1.getClass() == Centimeter.class) {
            return new Centimeter(length1.length + length2.toCentimeter());
        } else if (length1.getClass() == Meter.class) {
            return new Meter(length1.length + length2.toMeter());
        } else if (length1.getClass() == Millimetre.class) {
            return new Millimetre(length1.length + length2.toMilimetre());
        }
        return length1;
    }

    public Length minus(Length length1, Length length2) {
        if (length1.getClass() == Centimeter.class) {
            return new Centimeter(length1.length - length2.toCentimeter());
        } else if (length1.getClass() == Meter.class) {
            return new Meter(length1.length - length2.toMeter());
        } else if (length1.getClass() == Millimetre.class) {
            return new Millimetre(length1.length - length2.toMilimetre());
        }
        return length1;
    }

    public Length multiples(Length length1, Length length2) {
        if (length1.getClass() == Centimeter.class) {
            return new Centimeter(length1.length * length2.toCentimeter());
        } else if (length1.getClass() == Meter.class) {
            return new Meter(length1.length * length2.toMeter());
        } else if (length1.getClass() == Millimetre.class) {
            return new Millimetre(length1.length * length2.toMilimetre());
        }
        return length1;
    }

    public Length divide(Length length1, Length length2) {
        if (length1.getClass() == Centimeter.class) {
            return new Centimeter(length1.length / length2.toCentimeter());
        } else if (length1.getClass() == Meter.class) {
            return new Meter(length1.length / length2.toMeter());
        } else if (length1.getClass() == Millimetre.class) {
            return new Millimetre(length1.length / length2.toMilimetre());
        }
        return length1;
    }
}
