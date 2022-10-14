/*08.	In a company an employee is paid as under: 
If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
If the employee's salary is input by the user write a program to find his gross salary.
 [ formula : GS= Basic + DA + HRA ]
*/
import java.util.*;
class Q8{
	public static void main(String args[]){
	float BS,HRA,DA,GS;
	System.out.println("Enter your Basic Salary");
	Scanner sc = new Scanner(System.in);
	BS=sc.nextFloat();
	
	if(BS>=10000){
		HRA=2000;
		DA=BS*98/100;
}
	else{
		HRA=BS*10/100;
		DA= BS*90/100;
}
	GS=BS+DA+HRA;
	System.out.println("Gross Salary : "+GS);

}
}