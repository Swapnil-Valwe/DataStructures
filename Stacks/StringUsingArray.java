import java.util.Scanner;

public class StringUsingArray {
	
	String arr[];
	int top;
	int stack_Size;
	private static Scanner sc;
	
	
	public StringUsingArray(int a) {
		arr=new String[a];
		top=-1;
		stack_Size = a;
	}	
	
	public void push(String val) {
		
		if(top == stack_Size -1) {
			System.out.println("Stack is Full");
			return;
		}
		top++;	//top = 0
		arr[top]= val; //arr[0] = 10
		System.out.println(arr[top] + " Pushed");
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Value "+arr[top] + " was at Top and is Popped");
		--top;	//top = 0
	}
	
	public void display() {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	

	public void peek() {
		System.out.println(arr[top]);
	}
	
	
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int size = sc.nextInt();
		StringUsingArray s1 = new StringUsingArray(size);
		String value;
		
			for(;;) {
			System.out.println("*********************************");
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1 to Push");
			System.out.println("Enter 2 to Pop");
			System.out.println("Enter 3 to Display");
			System.out.println("Enter 4 to Peek");
			System.out.println("Enter 5 to Exit");
			System.out.println("*********************************");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				
				System.out.println("Enter the Value to Push");
				sc.nextLine();
				value = sc.nextLine();
				s1.push(value);
				break;
			case 2:
				s1.pop();
				break;
			case 3: 
				s1.display();
				break;
			case 4:
				s1.peek();
				break;
			case 5:
				System.exit(0);
				System.out.println("Stack Exited");
				break;
				
			}
			
		
			}	
	}
}
