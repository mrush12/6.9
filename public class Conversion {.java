public class Conversion {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}

public class ConversionTest {
    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t\tMeters\tFeet");
        System.out.println("----\t------\t\t------\t----");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = Conversion.footToMeter(feet);
            double meters2 = 20.0 + 5.0 * (feet - 1.0);
            double feet2 = Conversion.meterToFoot(meters2);
            System.out.printf("%.1f\t%.3f\t\t%.1f\t%.3f%n", feet, meters, meters2, feet2);
        }
    }
}