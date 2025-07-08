package com.shanInfotech.collectionExtendedApp;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InterviewScheduler {
	public Queue<Interview> scheduleQueue = new LinkedList<>();
	public Deque<Interview> walkInDequeue = new ArrayDeque<>();
	public PriorityQueue<Interview> topPerformanceQueue =new PriorityQueue<>(
			(a , b)-> Integer.compare(b.getScore(), a.getScore()));
	
	public void scheduledInterview(Interview i) {
		scheduleQueue.offer(i);
		topPerformanceQueue.offer(i);
		
	}
	public void walkInCandidate(Interview i) {
		walkInDequeue.addFirst(i);
		topPerformanceQueue.offer(i);
	}
	public void displaySchedule() {
		System.out.println("Scheduled Interview(FIFO) :");
		scheduleQueue.forEach(System.out::println);
	}
	public void displayWalkIns() {
		System.out.println("Walk-In Candidates(Deque):");
		walkInDequeue.forEach(System.out::println);
	}
		public void displayTopScorers(int threshold) {
			System.out.println("Shortlisted candidate(Score >"+threshold+"):");
			topPerformanceQueue.stream().filter(i -> i.getScore() > threshold)
			.sorted(Comparator.comparing(Interview::getCandidateName)).forEach(System.out::println);
			
		
		
	}
}
