import java.util.Scanner; 
 class py7{

public static void main(String args[]){
	
	for(int i=9;i>=1;i--)//rows
	{
			for(int j=8;j>=i;j--)//space
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
