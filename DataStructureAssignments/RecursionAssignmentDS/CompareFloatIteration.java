package RecursionAssignmentDS;
import java.util.Scanner;
public class CompareFloatIteration {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the 1st  Float Number: ");
		Float a = sc.nextFloat();
		System.out.print("Enter the 2nd  Float Number: ");
		Float b = sc.nextFloat();
		System.out.print("Enter the 3rd  Float Number: ");
		Float c = sc.nextFloat();
		
		Float d = c > (a>b ? a : b) ? c : ((a>b) ? a : b);
		System.out.println("The Largest Float Number is : "+d);
		sc.close();
	}
}
