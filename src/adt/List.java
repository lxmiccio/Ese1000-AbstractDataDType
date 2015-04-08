package adt;

import java.util.Vector;

public class List
{
	private Vector<Object> list;

	public List()
	{
		this.list = new Vector<Object>(1, 1);
	}
	
	public void insertAtBeginning(Object object)
	{
		this.list.add(0, object);
	}
	
	public void insertAtEnd(Object object)
	{
		this.list.add(list.size(), object);
	}
	
	public void insertAtPosition(Object object, int index)
	{
		try
		{
			if(index < 0 || index > this.list.size())
				throw new IndexOutOfBoundsException("Index is out of bounds.");
			this.list.add(index, object);
		}
		catch(IndexOutOfBoundsException error)
		{
			error.getMessage();
		}
	}
	
	public void setFirst(Object object)
	{
		this.list.set(0, object);
	}

	public void setLast(Object object)
	{
		this.list.set(list.size(), object);
	}

	public void setAtPosition(Object object, int index)
	{
		try
		{
			if(index < 0 || index > this.list.size())
				throw new IndexOutOfBoundsException("Index is out of bounds.");
			this.list.set(index, object);
		}
		catch(IndexOutOfBoundsException error)
		{
			error.getMessage();
		}
	}

	public void removeFirst()
	{
		this.list.removeElementAt(0);
	}

	public void removeLast()
	{
		this.list.removeElementAt(list.size());
	}
	
	public void removeAtPosition(int index)
	{
		try
		{
			if(index < 0 || index > this.list.size())
				throw new IndexOutOfBoundsException("Index is out of bounds.");
			this.list.removeElementAt(index);
		}
		catch(IndexOutOfBoundsException error)
		{
			error.getMessage();
		}
	}
	
	public Object getFirst()
	{
		return this.list.elementAt(0);
	}

	public Object getLast()
	{
		return this.list.elementAt(list.size());
	}

	public Object getAtPosition(int index)
	{
		Object result = null;
		try
		{
			if(index < 0 || index > this.list.size())
				throw new IndexOutOfBoundsException("Index is out of bounds.");
			result = this.list.elementAt(index);
		}
		catch(IndexOutOfBoundsException error)
		{
			error.getMessage();
		}
		return result;
	}

	public void empty()
	{
		this.list.removeAllElements();
	}
	
	public int getSize()
	{
		return this.list.size();
	} 
	
	public int getCapacity()
	{
		return this.list.capacity();
	}
	
	@Override public String toString()
	{
		return "List [list=" + list + "]";
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		List other = (List) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
}