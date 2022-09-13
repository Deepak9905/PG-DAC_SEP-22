import java.util.Scanner; 
 class AP13{

public static void main(String args[]){
	
	for(char i='A';i<='E';i++)//rows
	{
			for(char j='D';j>=i;j--)//space
			{
				
				System.out.print(" ");
			}	 
	for(char j='A';j<=i;j++)//col
	{
		System.out.print(i+" ");
			 
	}
		System.out.println( );
	}
}
}
