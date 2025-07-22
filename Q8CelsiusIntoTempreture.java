import java.util.Scanner;
public class Q8CelsiusIntoTempreture
{
public static void main(String[] arg)
{
double celsius,fehrenheit;
Scanner s=new Scanner(System.in);
System.out.println("Enter tempreture in Celsius");
celsius=s.nextDouble();
fehrenheit=(celsius*9/5)+32;
System.out.println("Tempreture in Fahrenheit :" +fehrenheit);
}
}