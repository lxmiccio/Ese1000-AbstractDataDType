package adt;

import java.util.Vector;

public class Stack
{
	private Vector<Object> stack;
	
	public Stack()
	{
		this.stack = new Vector<Object>(1, 1);
	}
	
	public void push(Object object)
	{
		this.stack.add(0, object);
	}
	
	public void setFirst(Object object)
	{
		this.stack.set(0, object);
	}
	
	public Object pop()
	{
		Object object = new Object();
		object = stack.elementAt(0);
		this.stack.remove(0);
		return object;
	}
	
	public Object getFirst()
	{
		return this.stack.elementAt(0);
	}
	
	public void empty()
	{
		this.stack.removeAllElements();
	}
	
	public int getSize()
	{
		return this.stack.size();
	}
	
	public int getCapacity()
	{
		return this.stack.capacity();
	}

	@Override public String toString()
	{
		return "Stack [stack=" + stack + "]";
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stack == null) ? 0 : stack.hashCode());
		return result;
	}

	@Override public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stack other = (Stack) obj;
		if (stack == null) {
			if (other.stack != null)
				return false;
		} else if (!stack.equals(other.stack))
			return false;
		return true;
	}
}