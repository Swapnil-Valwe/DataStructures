package QueueAssignmentDS;
import java.util.*;
public class IntQueueUsingArray {
		
	int arr[];
	int front;
	int rear;
	int queueSize;
	static Scanner sc;
	
	
	 IntQueueUsingArray(int a){
		arr = new int [a];
		queueSize = a;
		rear = -1;
		front = -1;
	}
	
	
	public boolean isEmpty() {
		return front>=queueSize;
	}
	
	public boolean isFull() {
		  return front==0 && rear == queueSize -1 ;
	}
	
	public void enQueue(int val) {
		if(isFull()) {
			System.out.println("The Queue is full.");
			
		}
		else {
				if (front == -1)
					front = 0;
				rear++;
				arr[rear] = val;
		System.out.println(val+" is pushed.");
		}
		
	}
	
	
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty.");
			
		}
//		else if(front>=queueSize) {
//			System.out.println("The Queue is Empty.");
//		}
		
		
		else {
			
		System.out.println(arr[front]+" is at front and deQueued.");
		front++;
		
		}
	}
	
	
	public void display() {
		for(int i=front; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Nothing to display.");
		}
		else {
		System.out.println(arr[front]);
		}
	}
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Size of Queue: ");
		int size = sc.nextInt();
		IntQueueUsingArray q = new IntQueueUsingArray(size);
		int value;
		
		for(;;) {
			System.out.println("*********************************");
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1 to enQueue");
			System.out.println("Enter 2 to deQueue");
			System.out.println("Enter 3 to Display");
			System.out.println("Enter 4 to Peek");
			System.out.println("Enter 5 to Exit");
			System.out.println("*********************************");
		
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				
				System.out.println("Enter the Value to EnQueue");
				value = sc.nextInt();
				q.enQueue(value);
				break;
			case 2:
				q.deQueue();
				break;
			case 3: 
				q.display();
				break;
			case 4:
				q.peek();
				break;
			case 5:
				System.exit(0);
				System.out.println("Queue Exited");
				break;
				
			}
		}
	}
}
