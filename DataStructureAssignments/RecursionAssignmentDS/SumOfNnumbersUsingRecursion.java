package RecursionAssignmentDS;
import java.util.Scanner;
public class SumOfNnumbersUsingRecursion 
{
	static Scanner s;
    int sum = 0, j = 0;
    public static void main(String[] args) 
    {
        int n;
        s = new Scanner(System.in);
        System.out.print("Enter the no. of elements you want:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the elements you want:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        SumOfNnumbersUsingRecursion obj = new SumOfNnumbersUsingRecursion();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum:"+x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }
    }
}
