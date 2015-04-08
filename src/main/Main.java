package main;

import adt.*;

public class Main
{
private static final int MAX_LENGHT = 30;
	
	public static void main(String[] args)
	{
		List list = new List();
		Queue queue = new Queue();
		Stack stack = new Stack();
		for(int counter = MAX_LENGHT-1; counter >= 0; counter--)
		{
			list.insertAtBeginning(counter);
			queue.add(counter);
			stack.push(counter);
		}
		System.out.println(list);
		System.out.println(queue);
		System.out.println(stack);
	}
}