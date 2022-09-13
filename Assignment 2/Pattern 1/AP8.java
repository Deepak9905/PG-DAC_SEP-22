import java.util.Scanner; 
 class AP8{

public static void main(String args[]){
	
	for(int i=5;i>=1;i--)//rows
	{
			for(int j=i;j>=1;j--)//space
			{
				
				System.out.print(" ");
			}	 
	for(int j=i;j<=5&&j>=1;j++)//col
	{
		System.out.print(j+" ");
			 
	}
		System.out.println();
	}
}
}
