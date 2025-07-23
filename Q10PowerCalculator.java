import java.util.Scanner;
public class Q10PowerCalculator
{
public static void main(String[] args)
{
double base,exponent,result;
Scanner s=new Scanner(System.in);
System.out.println("enter the base(x):");
base=s.nextDouble();
System.out.println("enter the exponent(y):");
exponent=s.nextDouble();
result=Math.pow(base,exponent);
System.out.println(base + "raised to the power" + exponent + "is : "+result);
}
}



