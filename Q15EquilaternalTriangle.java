import java.util.Scanner;
public class Q15EquilaternalTriangle
{
public static void main(String[] arg)
{
double side,area;
Scanner s=new Scanner(System.in);
System.out.println("Enter side of the equilaternal triangle:");
side=s.nextDouble();
area=(Math.sqrt(3)/4)*side*side;
System.out.print("The area of the equilaternal is:"+area);
}
}