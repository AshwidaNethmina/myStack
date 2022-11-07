import java.util.Scanner;

public class stackPractice
{
	static int top = -1;
	static int limit = 1000;
	static int myStack[] = new int[limit];
	
	public static void main(String[] args)
	{
		push(5);
		push(10);
		push(50);
		push(500);
		pop();
		push(25);
		push(400);
		push(11);
		pop();
		push(42150);
		push(4545);
		push(11);
		push(789);
		pop();
		pop();
		display();
	}
	
	public static void push(int n)
	{
		if(!isFull())
		{
			top++;
			myStack[top] = n;
			System.out.println(n+" is pushed to myStack");
		}
		else
		{
			System.out.println("myStack is full!");
		}
		
	}
	
	public static int pop()
	{
		if(!isEmpty())
		{
			top--;
			System.out.println(myStack[top+1]+" is popped from myStack");
			return myStack[top+1];
		}
		else
		{
			System.out.println("myStack is empty!");
			return 0;
		}
	}
	
	public static boolean isFull()
	{
		if(top == limit-1)
			return true;
		else
			return false;
	}
	
	public static boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;		
	}
	
	public static void display()
	{
		for(int i=0; i<=top; i++)
		{
			System.out.print(myStack[i] + " ");
		}
	}
}