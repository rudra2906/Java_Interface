package com.system.queue;
import java.util.*;

public class PractiseMethod {
	
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		
		//enqueue
		queue.add(1);
		queue.offer(2);
		queue.add(3);
		
		System.out.println(queue);
		
		//inspect
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.element());
		System.out.println(queue.peekLast());
		
		
		//remove
		//System.out.println(queue.remove(1));
		System.out.println(queue.poll());
		System.out.println(queue);
		//System.out.println(queue.removeLast());

	}
}
