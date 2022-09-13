import java.util.Scanner; 
 class A2SP10{

public static void main(String args[]){
	
	for(int i=1;i<=5;i++)//rows
	{
			for(int j=4;j>=i;j--)//space
			{
				
				System.out.print(" ");
			}	 
	for(int j=5;j>=i;j--)//col
	{
		System.out.print("*");
			 
	}
	for(int j=i-1;j>=1;j--)//col
	{
		System.out.print("*");
			 
	}
		System.out.println( );
	}
}
}
