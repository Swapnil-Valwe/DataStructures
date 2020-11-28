package RecursionAssignmentDS;
import java.util.*;
public class FactorialUsingLoop {
	static Scanner sc;
	public static void main(String args[]){ 
		sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		  int i,fact=1;
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
