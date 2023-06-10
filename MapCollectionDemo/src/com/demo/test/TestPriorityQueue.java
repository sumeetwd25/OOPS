package com.demo.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue <Integer> q1 = new PriorityQueue<>();
		q1.offer(1);
		q1.offer(43);
		q1.offer(9);
		q1.offer(56);
		System.out.println(q1);
		
		Comparator<Integer> c = (o1,o2)->{
			return o1-o2;
		};
		
		PriorityQueue<Integer> q2 = new PriorityQueue<>(c);
		q2.offer(1);
		q2.offer(43);
		q2.offer(9);
		q2.offer(56);
		System.out.println(q2);
	}

}
