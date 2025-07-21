import java.util.Scanner;
public class Q4PerimeterRectangle
{
public static void main(String[] arg)
{
int l,b,peri;
Scanner s=new Scanner(System.in);
System.out.println("Enter length rectangle");
l=s.nextInt();
System.out.println("Enter breadth rectangle");
b=s.nextInt();
peri=2*(l+b);
System.out.println("perimeter of rectangle:"+peri);
}
}




