import java.util.Scanner;
public class Q20nthBitCheck
{
public static void main(String[] args)
{
int num,n,mask;
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
num=s.nextInt();
System.out.println(" Enter the bit position to check (0 for LSB):");
n=s.nextInt();
mask=1<<n;
if((num &mask)!=0)
{
System.out.println("Bit at position"+n+"is SET(1)");
}
else
{
System.out.println("Bit at position"+n+"is NOt sET(0)");
}
}
}

