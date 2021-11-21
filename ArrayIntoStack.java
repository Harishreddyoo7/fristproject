package stack;

public class ArrayIntoStack {
	static int top = 0;
	static int current = 0;
	static int max = 10;
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		push(1,arr);
		System.out.println(peek(arr));
		pop(arr);
		peek(arr);
		pop(arr);
	}
	static void push(int n, int[] arr)
	{
		if(top == max)
		{
			System.out.println("overflow");
			return;
		}
		arr[top] = n;
		current = top;
		top++;
		push(n+1,arr);
	}
	static int pop(int[] arr)
	{
		if(top == 0)
		{
			System.out.println("stack have no elements");
			return 0;
		}
		int n = arr[current];
		top--;
		current--;
		return n; 
	}
	static int peek(int[] arr)
	{
		if(top == 0)
		{
			System.out.println("stack have no elements");
			return 00;
		}
		return arr[current];
	}
}
