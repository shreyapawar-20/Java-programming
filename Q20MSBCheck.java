import java.util.Scanner;
public class Q20MSBCheck
{
public static void main(String[] arg)
{
int num,msbMask;
Scanner s=new Scanner(System.in);
System.out.print("Enter number");
num=s.nextInt();
msbMask=1<<31;
if((num &msbMask)!=0)
{
System.out.println("MSB is SET(1)");
}
else
{
System.out.println("MSB is not set(0)");
}
}
}