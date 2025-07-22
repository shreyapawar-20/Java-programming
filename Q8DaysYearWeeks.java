import java.util.Scanner;
public class Q8DaysYearWeeks
{
public static void main(String[] arg)
{
int totalDays,years,weeks,remainingDays,days;
Scanner s=new  Scanner(System.in);
System.out.println("Enter total number of days");
totalDays=s.nextInt();
years=totalDays/365;
remainingDays=totalDays%365;
weeks=remainingDays/7;
days=remainingDays/7;
System.out.println("Equivalent time");
System.out.println("years:"+years);
System.out.println("weeks:"+weeks);
System.out.println("days:"+days);
}
}





