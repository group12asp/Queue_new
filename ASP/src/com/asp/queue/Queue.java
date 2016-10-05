package com.asp.queue;

import java.util.Iterator;
import java.util.LinkedList;


class Queue implements Cloneable {
	
	private LinkedList<Node> element;
	public LinkedList<Node> getElement() {
		return element;
	}
	public void setElement(LinkedList<Node> element) {
		this.element = element;
	}
	Queue()
	{
		element = new LinkedList<Node>();
	}
	public void enqueue(String add,int priority1)
	{
		Node latest = new Node(add, priority1);
		element.add(latest);
	}
	public String dequeue()
	{
		if(element.isEmpty())
		{
			System.out.println("\nQueue is empty");
			return null;
		}
		Iterator<Node> itr = element.iterator();

		int max = element.getFirst().getPriority();
		int j = 0;
		int index = 0;
	
		while(itr.hasNext())
		{
			 Node tnode = itr.next();
			 j = tnode.getPriority();
			if (j > max)
			{
				max = j;
				index = element.indexOf(tnode);
			}
		}
		String temp = element.get(index).getName();
		element.remove(index);
		return temp;
	}
	public void empty()
	{
		if(element.isEmpty())
		{
			System.out.println("\nQueue is already empty");
		}
		else{
		System.out.println("\nEmpty Function called");
		element.removeAll(element);
		}
		
	}
	public boolean equals(Object temp)
	{
		if (!(temp instanceof Queue))
		{
			return false;
		}
		if (temp == this && ((Queue)temp).element == element)
		{
			return true;
		}
		return false;
	}
	public Object clone() throws CloneNotSupportedException 
	{
		Queue temp = new Queue();
		temp.setElement(this.element);
		return temp;
	}
	@Override public String toString()
	{
		if(element.isEmpty())
		{
			System.out.println("\nQueue is empty");
			return null;
		}
		Iterator<Node> itr = element.iterator();
		System.out.println("\nCurrent Elements in Queue are:");
		while(itr.hasNext())
		{
			 Node tnode = itr.next();
			 System.out.println("String = "+tnode.getName()+"  Priority = "+tnode.getPriority());
			
		}
		return null;
	}
	public int hashCode()
	{
		int hashcode = 120;
		hashcode = 31 * hashcode + (element == null ? 0 : element.hashCode());
		
		return hashcode;
	}
}
//is there anything missing?