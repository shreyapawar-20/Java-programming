import java.util.Scanner;
public class Q3menudriven
{
public static void main(String[] arg)
{
int num1,num2,ch,result;
Scanner s=new Scanner(System.in);
System.out.println("enter number");
num1=s.nextInt();
num2=s.nextInt();
System.out.println("1. Addition\n2. substraction\n3.multiplication\n4.Division\n enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:
result=num1+num2;
System.out.println("Addition is:"+ result);
break;
case 2:
result=num1-num2;
System.out.println("subtraction is:"+ result);
break;
case 3:
result=num1*num2;
System.out.println("multiplication is:"+ result);
break;
case 4:
result=num1/num2;
System.out.println("Division is is:"+ result);
break;
default :
System.out.println("enter between 1 to 4");
break;
}
}
}










