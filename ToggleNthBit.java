//write java program to toggle nth bit of number
import java.util.Scanner;
public class ToggleNthBit
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int number=s.nextInt();
System.out.print("Enter the bit position to toggle (starting from 0):");
int n=s.nextInt();
int result=number^(1<<n);
System.out.print("Number after toggle "+n+"nth bit:"+result);
}
}


