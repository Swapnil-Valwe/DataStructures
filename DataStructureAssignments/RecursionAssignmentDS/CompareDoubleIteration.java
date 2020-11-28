package RecursionAssignmentDS;
import java.util.Scanner;
public class CompareDoubleIteration {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the 1st Double Number: ");
		Double a = sc.nextDouble();
		System.out.print("Enter the 2nd Double Number: ");
		Double b = sc.nextDouble();
		System.out.print("Enter the 3rd Double Number: ");
		Double c = sc.nextDouble();
		
		Double d = c > ((a>b) ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("The largest Double Number is: "+d);
		sc.close();
	}
}
