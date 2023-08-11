import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Student s1;
	private Student s2;
<<<<<<< HEAD
	private Course c1;
	private Course c2;
=======
	private Enrolment e1;
	private Enrolment e2;
>>>>>>> branch 'master' of https://github.com/22033014-Surendar/C206_CaseStudy.git
	private Fee f1;
	private Fee f2;
	
	private ArrayList<Student> studentList;
<<<<<<< HEAD
	private ArrayList<Course> courseList;
=======
	private ArrayList<Enrolment> enrolmentList;
>>>>>>> branch 'master' of https://github.com/22033014-Surendar/C206_CaseStudy.git
	private ArrayList<Fee> feeList;

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("22028513","junwei");
		s2 = new Student("22021234","skye");
<<<<<<< HEAD
		c1 = new Course ("Mr bob", "A123", "info tech");
		c2 = new Course ("Ms Yeo", "B123", "engineering");
=======
		e1 = new Enrolment("22005047", "C110");
		e2 = new Enrolment("22028513", "C123");
>>>>>>> branch 'master' of https://github.com/22033014-Surendar/C206_CaseStudy.git
		f1 = new Fee("22028513", "Exam", 70.0);
		f2 = new Fee("22021234", "Tuition", 100.0);
		
		studentList = new ArrayList<Student>();
<<<<<<< HEAD
		courseList = new ArrayList<Course>();
=======
		enrolmentList = new ArrayList<Enrolment>();
>>>>>>> branch 'master' of https://github.com/22033014-Surendar/C206_CaseStudy.git
		feeList = new ArrayList<Fee>();
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
	
<<<<<<< HEAD
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
	
=======
>>>>>>> branch 'master' of https://github.com/22033014-Surendar/C206_CaseStudy.git
	@Test
	public void testAddFee() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Fee arraylist to add to", feeList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addFee(feeList, f1);		
		assertEquals("Test that Fee arraylist size is 1", 1, feeList.size());
		assertSame("Test that Fee is added", f1, feeList.get(0));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addFee(feeList, f2);
		assertEquals("Test that Fee arraylist size is 2", 2, feeList.size());
		assertSame("Test that Fee is added", f2, feeList.get(1));
	}
	
	@Test
	public void testDeleteFee() {
		// Item list is not null, so that can delete a fee - boundary
		assertNotNull("Test if there is valid Fee arraylist to delete from", feeList);
		
		//Given a list with two fees, after deleting 1 fee, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.deleteFee(feeList, f1);		
		assertEquals("Test that Fee arraylist size is 2", 2, feeList.size());
		assertSame("Test that Fee is deleted", f1, feeList.get(0));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addFee(feeList, f2);
		assertEquals("Test that Fee arraylist size is 2", 2, feeList.size());
		assertSame("Test that Fee is added", f2, feeList.get(1));
	}
	@Test
	public void testAddCourse() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Course arraylist to add to", courseList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCourse(courseList, c1);
		assertEquals("Check that Course arraylist size is 1", 1, courseList.size());
		assertSame("Check that Course is added", c1, courseList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCourse(courseList, c2);
		assertEquals("Check that Course arraylist size is 2", 2, courseList.size());
		assertSame("Check that Course is added", c2, courseList.get(1));
	}
	@Test
	public void testDeleteCourse() {
		// Item list is not null, so that can delete a course - boundary
		assertNotNull("Test if there is valid Course arraylist to delete from", courseList);
		
		//Given a list with two courses, after deleting 1 fee, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.deleteCourse(courseList, c1);		
		assertEquals("Test that Course arraylist size is 2", 2, courseList.size());
		assertSame("Test that Course is deleted", c1, courseList.get(0));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCourse(courseList, c2);
		assertEquals("Test that Course arraylist size is 2", 2, courseList.size());
		assertSame("Test that Course is added", c2, courseList.get(1));
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

	        // Add test cases for deleteEnrolment method here.
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
