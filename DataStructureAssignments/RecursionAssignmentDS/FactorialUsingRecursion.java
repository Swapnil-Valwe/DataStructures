package RecursionAssignmentDS;
import java.util.*;
public class FactorialUsingRecursion {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the number: ");
			 int number = sc.nextInt();
		  int fact=1;  
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);   
		  sc.close();
		 }  
		
}
