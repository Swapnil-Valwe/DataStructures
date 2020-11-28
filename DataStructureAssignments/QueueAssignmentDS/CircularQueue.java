package QueueAssignmentDS;
import java.util.*;
class Queue
{
   // int capacity=5;
    int size=0;
    int front =-1;
    int rear =-1;
    int arr[]=new int[5];
    void enque(int x)
    {
        if(size==5)
        {
            System.out.println("full");
        }
        else
         if(front>=0 && rear==4 )
        {
           // front=-1;
            rear=-1;
            arr[++rear]=x;
            size++;
            System.out.println("push"+arr[rear]+"index="+rear);
        }else   
        {
        arr[++rear]=x;
        size++;
        System.out.println("push"+arr[rear]+"index="+rear);
        }
        
    }
    void deque()
    {
        if(size==0)
        {
            System.out.println("empty");
        }else
        if(front==4)
        {
            front=-1;
            front++;
            System.out.println("pop"+arr[front]+"index="+front);
            
            size--;
        }else    
        {
            front++;
            System.out.println("pop"+arr[front]+"index="+front);
            size--;
        }
    }
    void status()
    {
        System.out.println("rearIndex="+rear+"  frontIndex="+front);
        if(size==5)
        {
            System.out.println("queue is full");
        }
        if(size==0)
        {
            System.out.println("queue is empty");
        }
        if((size!=0) && (size!=5))
        {
            System.out.println("you can add value or remove value");
        }
    }
}
class CircularQueue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue();
        int n;
        do
        {
            System.out.println("Enter your choice");
            System.out.println("1=enque  2=deque  3=status  0=EXIT");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    int a=sc.nextInt();
                    q.enque(a);
                    break;
                case 2:
                    q.deque();
                    break;
                case 3:
                    q.status();
                    break;
            }
        }while(n!=0);
        System.out.println("EXIT");
      
    }
}