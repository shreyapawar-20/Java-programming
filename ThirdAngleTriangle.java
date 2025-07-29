import java.util.Scanner;
public class ThirdAngleTriangle
{
public  static void main(String[] arg)
{
int angle1,angle2,thirdAngle;
Scanner s=new Scanner(System.in);
System.out.println("Enter first angle");
angle1=s.nextInt();
System.out.println("Enter second angle");
angle2=s.nextInt();
thirdAngle=180-(angle1+angle2);
if(angle1<=0 || angle2<=0 ||thirdAngle<=0)
{
System.out.println("The angles of triangle must be greater than 0 and their sum must be less than 180.");
}
else
{
System.out.println("The third angle angle of the triangle is:" +thirdAngle +"degrees");
}
}
}
