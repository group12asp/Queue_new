package com.asp.queue;

public class QueueOp {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.toString();
		queue.enqueue("def", 300);
		queue.toString();
		queue.enqueue("pqr",6);
		queue.toString();
		queue.enqueue("xyz",17 );
		queue.toString();
		queue.enqueue("zhi", 150);
		queue.toString();
		queue.enqueue("donald", 301);
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
		System.out.println("After Clone queue!=new_queue is "+(queue!=new_queue));
		new_queue.toString();
		System.out.println("\nequal = "+queue.equals(new_queue));
		System.out.println("\nequal = "+queue.equals(null));
		Queue q2 = queue;
		System.out.println("\nequal = "+queue.equals(q2));
		System.out.println("hash="+queue.hashCode());
		System.out.println("hash="+queue.hashCode());
		System.out.println("hash of q2="+q2.hashCode());
	}

}
