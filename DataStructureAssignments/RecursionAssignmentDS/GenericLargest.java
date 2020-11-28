package RecursionAssignmentDS;
public class GenericLargest 
{
	  public static <T extends Comparable<T>> T maximum(T x, T y, T z)
{
	    T max = x;

	    if (y.compareTo(max) > 0)
	      max = y; 
	    
	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max;
	  } 

	  public static void main(String args[]) {
	    System.out.println("Maximum of String    = "+ maximum("Liverpool","Barcelona","Chelsea"));
	    System.out.println("Maximum of character = "+ maximum('a','z','r'));
	    System.out.println("Maximum of integer   = "+ maximum(98,45,27));
	    System.out.println("Maximum of float     = "+ maximum(7.5,88.9,0.7));
	    System.out.println("Maximum of double    = "+ maximum(5.55,7.777,9.9999));
	    
	  }
	}
