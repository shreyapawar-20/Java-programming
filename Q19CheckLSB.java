import java.util.Scanner;
public class Q19CheckLSB
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter number");
int num =s.nextInt();
if((num & 1)==1)
{
System.out.println("LSB is SET (1)");
}
else
{
System.out.println("LSB is not SET(0)");
}
}
}
