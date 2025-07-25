import java.util.Scanner;
public class Q17SimpleInterest
{
public static void main(String[] arg)
{
float p,t,r,simpleinterest;
Scanner s=new Scanner(System.in);
System.out.println("Enter principle :");
p=s.nextFloat();
System.out.println("Enter time :");
t=s.nextFloat();
System.out.println("Enter rate :");
r=s.nextFloat();
simpleinterest=(p*t*r)/100;
System.out.println("Simple interest is :" + simpleinterest);
}
}








