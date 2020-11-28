package RecursionAssignmentDS;
import java.util.*;
public class CompareIntIteration {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Integer number: ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd Integer number: ");
		int b = sc.nextInt();
		System.out.print("Enter the 3rd Integer number: ");
		int c = sc.nextInt();
		
		int d = c > (a>b ? a : b) ? c : ((a > b) ? a : b );
		
		System.out.println("The largest Integer number is : "+ d);
		sc.close();
	}
}
