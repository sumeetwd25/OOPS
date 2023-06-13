package com.demo.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(1);
		q1.offer(43);
		q1.offer(9);
		q1.offer(56);
		System.out.println(q1);

		Comparator<Integer> c = (o1, o2) -> {
			System.out.println("In comparator " + o1 + "---" + o2);
			return o1 - o2;
		};

		/*
		 * when you save data it is always ordered but when you use peek or poll to
		 * retrieve the data then it follows comparator order
		 */

		PriorityQueue<Integer> q2 = new PriorityQueue<>(c);
		q2.offer(1);
		q2.offer(43);
		q2.offer(9);
		q2.offer(56);
		System.out.println(q2);
		Iterator<Integer> it = q2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		while (!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
	}

}
