import java.util.Scanner; 
 class AP10{

public static void main(String args[]){
	
	for(char i='E';i>='A';i--)//rows
	{
			for(char j='A';j<i;j++)//space
			{
				
				System.out.print(" ");
			}	 
	for(char j=i;j<='E';j++)//col
	{
		System.out.print(j+" ");
			 
	}
		System.out.println();
	}
}
}
