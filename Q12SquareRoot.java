import java.util.Scanner;
public class Q12SquareRoot
{
public static void main(String[] arg)
{
int n;
double squareroot;
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
n=s.nextInt();
if(n<0)
{
System.out.println("square root of a negative number is not real:");
}
else
{
squareroot=Math.sqrt(n);
System.out.println("square root of" + n + "is: " + squareroot);
}
}
}



