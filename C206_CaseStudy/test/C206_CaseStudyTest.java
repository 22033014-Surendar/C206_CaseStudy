import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Student s1;
	private Student s2;
	private Enrolment e1;
	private Enrolment e2;
	
	private ArrayList<Student> studentList;
	private ArrayList<Enrolment> enrolmentList;

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("22028513","junwei");
		s2 = new Student("22021234","skye");
		e1 = new Enrolment("22005047", "C110");
		e2 = new Enrolment("22028513", "C123");
		
		studentList = new ArrayList<Student>();
		enrolmentList = new ArrayList<Enrolment>();
	}
	
	


	@Test
	public void testAddStudent() {
		//....
	}
	
	@Test
	public void testViewStudent() {
		//......
	}
	
	@Test 
	public void testDelete() {
		//......
	}
	@Test
	public void testAddEnrolment() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Enrolment arraylist to add to", enrolmentList);
		
        //Test the method with different scenario
        // Test Case 1: Adding to an empty list
        // After adding 1 enrolment, the size of the list should be 1
        C206_CaseStudy.addEnrolment(enrolmentList);
        assertEquals("Test that enrolment list size is 1", 1, enrolmentList.size());
        assertSame("Test that enrolment is added", e1, enrolmentList.get(0));

        // Test Case 2: Adding to a non-empty list
        // After adding another enrolment, the size of the list should be 2
        C206_CaseStudy.addEnrolment(enrolmentList);
        assertEquals("Test that enrolment list size is 2", 2, enrolmentList.size());
        assertSame("Test that enrolment is added", e2, enrolmentList.get(1));
    }
	@Test
	public void testviewEnrolment() {
		
	}
	 @Test
	    public void testdeleteEnrolment() {
	        // Test if Enrolment list is not null but empty
	        assertNotNull("Test if there is valid Enrolment arraylist to add an Enrolment", enrolmentList);

	        // Add test cases for deleteEnrolment method here
	    }
	
	@After
	public void tearDown() throws Exception {
		s1 = null;
		s2 = null;
		studentList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
