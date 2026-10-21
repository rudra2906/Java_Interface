package com.system.practiseQueue;
import java.util.*;
public class PractiseQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.add(1);
		queue.add(2);
		
		System.out.println(queue);
	
		//single ended
		queue.add(3);// if not able to add the value will thorw exception
		System.out.println(queue.offer(13)); // offer will not thow an exception
		
		// inspect
		System.out.println( queue.element() ); // give exception when queue is empty
		System.out.println(queue.peek()); //return null if empty
		
		//remove
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	
}
