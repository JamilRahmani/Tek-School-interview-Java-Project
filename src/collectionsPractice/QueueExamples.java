package collectionsPractice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
	public static void main(String[] args) {

		// Queue
		Queue<String> q = new PriorityQueue<String>();

//		PriorityQueue<String> pq = new PriorityQueue<String>();

		q.add("value 1");
		q.add("value 2");
		q.add("value 3");
		q.add("value 4");

		System.out.println(q);
		System.out.println("peek:  " + q.peek());
		System.out.println("poll:  " + q.poll());
		System.out.println(q);
		
		
		System.out.println("-----------------------");
		Deque<String> dq = new LinkedList<String>();

		dq.add("1");
		dq.add("2");
		dq.add("3");
		dq.add("4");
		dq.add("5");

		System.out.println(dq);
		System.out.println("poll: " + dq.poll());
		System.out.println(dq);
		System.out.println("pollLast: " + dq.pollLast());
		System.out.println(dq);
		
		
	}
}
