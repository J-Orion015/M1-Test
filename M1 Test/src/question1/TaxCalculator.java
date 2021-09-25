package question1;
import java.util.*;
public class TaxCalculator
{
	public static void main(String[] args) {
		double t=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter monthly income:");
		double monthlySalary=sc.nextDouble();
		t= taxableAmount(monthlySalary);
		System.out.println("Income tax amount is:"+t);
		TaxCalculator.taxableAmount(250001);
	}
	public static double taxableAmount(double monthlySalary)
	{
		double sal=0, tax=0;
		sal= monthlySalary*12;
		if(sal<=250000) {
			System.out.println("No tax is to be deducted");
			tax=0;
		}
		else if(sal>250000 && sal <= 500000) {
			tax= (sal-250000)*0.10;
		}
		else if(sal> 500000 && sal <= 1000000) {
			tax= (sal-250000)*0.20;
		}
		else if(sal> 1000000) {
			tax= (sal-250000)*0.30;
		}
		return tax;
	}
	
}