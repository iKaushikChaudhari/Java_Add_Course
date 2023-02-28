package Feb28.Day3;
//import java.util.Stack;

public class MyStack {
	int maxsize;
	long [] StackArray;
	int top;
	
	public MyStack(int s) 
	{
		maxsize=s;
		StackArray=new long[maxsize];
		top=-1;	
	}
	
	public void push(long j)
	{
		StackArray[++top]=j;
		System.out.println("The Pushed Element is "+j);
	}
	
	public void pop() 
	{
		long i=StackArray[top];
		top--;
		System.out.println("The Popped Element is "+i);
	}
	
	public boolean Isempty()
	{
		return(top==-1);
	}
	
	public boolean Isfull()
	{
		return(top==maxsize-1);
	}
	
	public static void main(String []args) 
	{
		MyStack ms1=new MyStack(3);
		if(!ms1.Isfull())
		{
			ms1.push(10);
			ms1.push(20);
			//ms1.push(10);
			ms1.pop();
			ms1.push(30);
			ms1.pop();
			ms1.pop();
			
		}
		
		
	}

}
