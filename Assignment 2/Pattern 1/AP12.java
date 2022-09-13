import java.util.Scanner; 
 class AP12{

public static void main(String args[]){
	
	for(int i=1;i<=5;i++)//rows
	{
			for(int j=4;j>=i;j--)//space
			{
				
				System.out.print(" ");
			}	 
	for(int j=1;j<=i;j++)//col
	{
		System.out.print(i+" ");
			 
	}
		System.out.println( );
	}
}
}
