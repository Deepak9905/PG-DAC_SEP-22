/*02.	Write a program that takes radius of a circle as input.
 Read the entered radius using Scanner class. Then calculate and print 
 the area and circumference of the circle.*/
import java.util.Scanner;
public class Q2{
	
	public static void main(String args[]){
		double Area,circum;
		int n;
		do {
		System.out.print("Enter radius of circle : ");
		Scanner sc = new Scanner(System.in);
		double r =sc.nextInt();
		
		Area = 3.142*r*r;
		circum =2*3.142*r;
		System.out.println("Area : "+Area);
		System.out.println("circum : " +circum);
		System.out.println("Do You want to Exit (Yes=1/ No=0)");
		Scanner bc = new Scanner(System.in);
		n = bc.nextInt();
		}
		while(n==0);
	}
	
}