package com.shanInfotech.collectionExtendedApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTest {
	InterviewScheduler scheduler = new InterviewScheduler();

    
    @Test
     void testSchedulerCoreFlow() {
    	scheduler.scheduledInterview(new Interview(1, "Smrithi Mv", 93,"10:00 AM"));
		scheduler.scheduledInterview(new Interview(2, "Sharanya Bk", 84,"10:30 AM"));
		scheduler.scheduledInterview(new Interview(3, "adithya", 71,"11:00 AM"));
		scheduler.walkInCandidate(new Interview(4, "Deepak", 91,"NOW"));
		
        assertEquals("Smrithi Mv", scheduler.scheduleQueue.peek().getCandidateName());
        assertEquals("Deepak", scheduler.walkInDequeue.peekFirst().getCandidateName());
        assertEquals("Smrithi Mv", scheduler.topPerformanceQueue.peek().getCandidateName());
        
    }
//    @Test
//    void testTopScoresAbove70() {
//    	List<String> exceptedNames = Arrays.asList("Deepak" ,"Smrithi Mv","Sharanya Bk");
//    	
//    	List<String> topScores = scheduler.topPerformanceQueue.stream()
//    			.filter(i -> i.getScore() >70).map(Interview::getCandidateName)
//    			.sorted().toList();
//    	
//    	assertEquals(exceptedNames, topScores);
//    }
}
