package com.shanInfotech.collectionExtendedApp.queuePQue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Qpque {
	
	private static void queMethod() {
		Queue<String> eventQue=new LinkedList<String>();
	//	ArrayDeque<String> eventQue=new ArrayDeque<String>();
		
		eventQue.add("Sameer");
		eventQue.add("Amith");
		eventQue.add("apollo");
		eventQue.add("manju");
		System.out.println("ArrayDequeue:"+eventQue);
		System.out.println("removed from the first uses FIFO:"+eventQue.remove());
		System.out.println("offering new values for the que:"+eventQue.offer("Lama"));
		System.out.println(""+eventQue.offer("Lama"));
		System.out.println(eventQue);
		System.out.println("gets the peek elements:"+eventQue.peek());
		System.out.println("retrive and removes the element:"+eventQue.poll());
		System.out.println(eventQue.element());
		System.out.println(eventQue);
	}
	
	public static void arrayDequeMethod() {
		ArrayDeque<String> eventQue=new ArrayDeque<String>();
		eventQue.add("Sameer");
		eventQue.add("Amith");
		eventQue.add("apollo");
		eventQue.add("manju");
		System.out.println("ArrayDequeue:"+eventQue);
		System.out.println("removed from the first uses LIFO using RemoveLast:"+eventQue.removeLast());
		System.out.println("offering new values for the que:"+eventQue.offerFirst("Lama"));
		System.out.println(""+eventQue.offer("Lama"));
		System.out.println(eventQue);
		System.out.println("gets the peek elements:"+eventQue.peekLast());
		System.out.println("retrive and removes the element:"+eventQue.pollFirst());
		System.out.println(eventQue.element());
		System.out.println(eventQue);
	}
	public static void priorityQueMethod() {
		PriorityQueue<String> eventQue=new PriorityQueue<String>();
		eventQue.add("Sameer");
		eventQue.add("Amith");
		eventQue.add("apollo");
		eventQue.add("manju");
		System.out.println("ArrayDequeue:"+eventQue);
		System.out.println("removed from the first uses FIFO:"+eventQue.remove());
		System.out.println("offering new values for the que:"+eventQue.offer("Lama"));
		System.out.println(""+eventQue.offer("Lama"));
		System.out.println(eventQue);
		System.out.println("gets the peek elements:"+eventQue.peek());
		System.out.println("retrives and removes the element:"+eventQue.poll());
		System.out.println(eventQue.element());
		System.out.println(eventQue);
	}
	public static void main(String args[]) {
		queMethod();
		arrayDequeMethod();
		priorityQueMethod();
	}
}
