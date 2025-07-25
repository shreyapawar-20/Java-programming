import java.util.Scanner;
public class Q18Compoundinterest
{
public static void main(String[] arg)
{
double p,t,r,amount,Compoundinterest;
Scanner s=new Scanner(System.in);
System.out.println("Enter principle:");
p=s.nextDouble();
System.out.println("Enter time:");
t=s.nextDouble();
System.out.println("Enter rate:");
r=s.nextDouble();
amount=p*Math.pow((1+r/100),t);
Compoundinterest=amount-p;
System.out.print("Compound interest are :"+Compoundinterest);
}
}



