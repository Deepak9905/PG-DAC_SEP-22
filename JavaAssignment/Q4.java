/*04.	Write a program to find the simple interest. 
Take the principle amount, rate of interest and time 
from user using Scanner class.*/
import java.util.*;
class Q4{
	public static void main(String args[]){
		float SI,P,R,N,n;
		do{
		System.out.print("Enter the principal amount : ");
		Scanner sc = new Scanner(System.in);
		P=sc.nextInt();
		System.out.print("Enter the Rate : ");
		Scanner bc = new Scanner(System.in);
		R=bc.nextInt();
		System.out.print("ENter the Year : ");
		Scanner ac = new Scanner(System.in);
		N=ac.nextInt();
		
		SI = (P*N*R)/100;
		System.out.println("Simple Interest = "+SI);
		
		System.out.println("Do You want to Exit (Yes=1/ No=0)");
		Scanner a = new Scanner(System.in);
	    n = a.nextInt();
		}
		while(n==0);
	}
}
