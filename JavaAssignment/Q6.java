/*06.	Write a program to convert temperature from 
Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class.
 [ formula : C= 5*(f-32)/9 ]*/
import java.util.*;
class Q6{
	public static void main(String args[]){
		float F,C,n;
		do
		{
		System.out.print("Enter Fahrenheit : ");
		Scanner sc = new Scanner (System.in);
		F=sc.nextInt();
		C= 5*(F-32)/9;
		System.out.println("Temperature in Celcius is : "+C);
		System.out.println("Do You want to Exit (Yes=1/ No=0)");
		Scanner bc = new Scanner(System.in);
		n = bc.nextInt();
		}
		while(n==0);
	}
}
