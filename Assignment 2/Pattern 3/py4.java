import java.util.Scanner; 
 class py4{

public static void main(String args[]){
	
	for(int i=1;i<=9;i++)//rows
	{
			for(int j=i;j<=8;j++)//space
			{
				
				System.out.print(" ");
			}	 
	for(int j=1;j<=i;j++)//col
	{
		System.out.print(j+"");
			 
	}
	for(int j=i-1;j>=1;j--)//col
	{
		System.out.print(j+"");
			 
	}
		System.out.println( );
	}
}
}
