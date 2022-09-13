import java.util.Scanner; 
 class py6{

public static void main(String args[]){
	
	for(int i=1;i<=9;i++)//rows
	{
			for(int j=0;j<i;j++)//space
			{
				
				System.out.print(" ");
			}	 
	for(int j=9;j>=i;j--)//col
	{
		System.out.print("* ");
			 
	}
		System.out.println( );
	}
}
}
