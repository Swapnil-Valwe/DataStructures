package Stacks;
import java.util.*;

public class IntUsingArray {
	
	int arr[];
	int top;
	int stack_Size;
	private static Scanner sc;
	
	public IntUsingArray(int a) {
		arr=new int[a];
		top=-1;
		stack_Size = a;
	}	
	
	public void push(int val) {
		
		if(isFull()) {
			System.out.println("Stack is Full");
			
			return;
		}
		top++;	//top = 0
		arr[top]= val; //arr[0] = 10
		System.out.println(arr[top] + " Pushed");
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Value "+arr[top] + " is at Top and is Popped");
		--top;	//top = 0
	}
	
	public void display() {
		
		for(int i=top; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public boolean isFull() {
		return top == stack_Size -1;
			
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void peak() {
		System.out.println(arr[top]);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int stackSize = sc.nextInt();
		IntUsingArray s1 = new IntUsingArray(stackSize);
		int value;
		
			for(;;) {
			System.out.println("*********************************");
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1 to Push");
			System.out.println("Enter 2 to Pop");
			System.out.println("Enter 3 to Display");
			System.out.println("Enter 4 to Peak");
			System.out.println("Enter 5 to Exit");
			System.out.println("*********************************");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				
				System.out.println("Enter the Value to Push");
				value = sc.nextInt();
				s1.push(value);
				break;
			case 2:
				s1.pop();
				break;
			case 3: 
				s1.display();
				break;
			case 4:
				s1.peak();
				break;
			case 5:
				System.exit(0);
				System.out.println("Stack Exited");
				break;
			}
			}
		
	}
}
