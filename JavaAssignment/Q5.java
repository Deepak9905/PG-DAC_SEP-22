/*05.	Write a program to read the days (eg. 670 days)
 as integer value using Scanner class.
 Now convert the entered days into complete years, 
months and days and print them.*/
import java.util.*;
class Q5{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
System.out.println("Enter the numbeer of days");
	int n = s.nextInt();

	int y, m, d;
	int temp = 0;

	
	y = n/365;		// Calculation of yars
	
	temp = n%365;	// Calculation of months
	m = temp/30;
	
	d = temp % 30;	// Calculation of days
	
	System.out.println("Years = "+y);
	System.out.println("Month = "+m);
	System.out.println("Days = "+d);	
		
	}
}
