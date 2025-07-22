import java.util.Scanner;
public class Q7KilometerMeter
{
public static void main(String[] args)
{
double meter,kilometer,cm;
Scanner s=new Scanner(System.in);
System.out.println("Enter length in centimeter:");
cm=s.nextDouble();
meter=cm/100;
kilometer=cm/100000;
System.out.println("length in meter:" + meter);
System.out.println("length in kilometer:" +kilometer);
}
}


