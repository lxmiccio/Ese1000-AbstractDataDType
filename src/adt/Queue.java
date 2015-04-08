package adt;

import java.util.Vector;

public class Queue
{
	private Vector<Object> queue;
		
	public Queue()
	{
		this.queue = new Vector<Object>(1, 1);
	}

	public void add(Object object)
	{
		this.queue.add(0, object);
	}
	
	public void setFirst(Object object)
	{
		this.queue.set(0, object);
	}
	
	public Object delete()
	{
		Object object = new Object();
		object = queue.elementAt(this.queue.size());
		this.queue.remove(this.queue.size());
		return object;
	}
	
	public Object getLast()
	{
		return this.queue.elementAt(queue.size());
	}
	
	public void empty()
	{
		this.queue.removeAllElements();
	}
	
	public int getSize()
	{
		return this.queue.size();
	}
	
	public int getCapacity()
	{
		return this.queue.capacity();
	}

	@Override public String toString()
	{
		return "Queue [queue=" + queue + "]";
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((queue == null) ? 0 : queue.hashCode());
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
		Queue other = (Queue) obj;
		if (queue == null) {
			if (other.queue != null)
				return false;
		} else if (!queue.equals(other.queue))
			return false;
		return true;
	}
}