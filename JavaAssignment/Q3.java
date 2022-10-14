/* calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks03.	Write a program to from user using Scanner class.
 Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.*/
 import java.util.Scanner;
public class Q3{
	
	private static Scanner s;
	public static void main(String args[]){
		int m1,m2,m3,m4,m5,n;
		double Percentage,total;
		do{
		s= new Scanner(System.in);
		System.out.println("Enter marks of  Subject : ");
		
		m1= s.nextInt();
		m2= s.nextInt();
		m3= s.nextInt();
		m4= s.nextInt();
		m5= s.nextInt();
		
		total = (m1 + m2 + m3 + m4 + m5	);
		Percentage = (total/ 500)*100 ;
		System.out.println("Total Marks : "+total);
		System.out.println("Percentage Marks  : "+Percentage+"%");
		System.out.println("Do You want to Exit (Yes=1/ No=0)");
		Scanner bc = new Scanner(System.in);
		n = bc.nextInt();
		}
		while(n==0);
	}
}