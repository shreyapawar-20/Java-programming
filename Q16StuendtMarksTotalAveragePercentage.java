import java.util.Scanner;
public class Q16StuendtMarksTotalAveragePercentage
{
public static void main(String[] arg)
{
int s1,s2,s3,s4,s5,total;
double average,percentage;
Scanner s=new Scanner(System.in);
System.out.println("Enter first subject student marks :");
s1=s.nextInt();
System.out.println("Enter second subject student marks :");
s2=s.nextInt();
System.out.println("Enter third subject student marks :");
s3=s.nextInt();
System.out.println("Enter fourth subject student marks :");
s4=s.nextInt();
System.out.println("Enter fifth subject student marks :");
s5=s.nextInt();
total=s1+s2+s3+s4+s5;
average=(total/5.0);
percentage=(total/500.0)*100;
System.out.println("total of the marks is:" +total);
System.out.println("Average of the marks is:" +average);
System.out.println("Percentage of the marks is:" +percentage);
}
}







