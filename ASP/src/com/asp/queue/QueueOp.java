package com.asp.queue;

public class QueueOp {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.toString();
		queue.enqueue("gwu", 300);
		queue.toString();
		queue.enqueue("gmu",6);
		queue.toString();
		queue.enqueue("uncc",17 );
		queue.toString();
		queue.enqueue("sjsu", 150);
		queue.toString();
		queue.enqueue("csus", 301);
		queue.toString();
		System.out.println("\nString of deleted item is "+queue.dequeue());
		queue.toString();
		System.out.println("\nString of deleted item is "+queue.dequeue());
		queue.toString();
		System.out.println("\nString of deleted item is "+queue.dequeue());
		queue.toString();
		queue.empty();
		queue.toString();
		Queue new_queue = (Queue)queue.clone();
		System.out.println("\nAfter Clone queue!=new_queue is "+(queue!=new_queue));
		new_queue.toString();
		System.out.println("\nqueue.equals(new_queue) = "+queue.equals(new_queue));
		System.out.println("\nqueue.equals(null) = "+queue.equals(null));
		Queue q2 = queue;
		System.out.println("\nqueue.equals(q2) = "+queue.equals(q2));
		System.out.println("\nhash of queue="+queue.hashCode());
		System.out.println("\nhash of queue="+queue.hashCode());
		System.out.println("\nhash of q2="+q2.hashCode());
	}

}
