import java.util.Scanner;
public class Q6CircleAreaCircumferance
{
public static void main(String[] arg)
{
double r,area,circumferance;
Scanner s=new Scanner(System.in);
System.out.println("enter radius");
r=s.nextDouble();
area=3.14*r*r;
System.out.print("Area of circle:" +area);
circumferance=2*3.14*r;
System.out.print("circumferance of circle:" +circumferance);
}
}

