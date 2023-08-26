import java.util.Scanner;
public class Convert
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter 1 for foot to meters or enter 2 for meters to foot");
int type = input.nextInt();
if (type == 1)
{
System.out.println(" foot?");
double foot = input.nextDouble();
double conversionResult = footToMeter(foot);
System.out.println(foot + " foot equals " + conversionResult + " meters");
}
else if (type == 2)
{
System.out.println(" meters?");
double meter = input.nextDouble();
double conversionResult = meterToFoot(meter);
System.out.println(meter + " meters equals " + conversionResult + " foot");
}
}
public static double footToMeter(double foot)
{
double meter = (0.3048 * foot);
return meter;
}
public static double meterToFoot(double meter)
{
double foot = (meter / 0.3048);
return foot;
}
}

