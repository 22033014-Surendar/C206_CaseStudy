import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Student s1;
	private Student s2;
	private Course c1;
	private Course c2;
	private Enrolment e1;
	private Enrolment e2;
	private Fee f1;
	private Fee f2;
	private Attendance a1;
	private Attendance a2;
	
	private ArrayList<Student> studentList;
	private ArrayList<Course> courseList;
	private ArrayList<Enrolment> enrolmentList;
	private ArrayList<Attendance> attendanceList;

	private ArrayList<Fee> feeList;

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("22028513","junwei");
		s2 = new Student("22021234","skye");
		c1 = new Course ("Mr bob", "A123", "info tech");
		c2 = new Course ("Ms Yeo", "B123", "engineering");
		e1 = new Enrolment("22005047", "C110");
		e2 = new Enrolment("22028513", "C123");
		f1 = new Fee("22028513", "Exam", 70.0);
		f2 = new Fee("22021234", "Tuition", 100.0);
		a1= new Attendance("Haowen", "22021111", "Present");
		a2 = new Attendance("Haowen", "22023333", "Absent");
		
		studentList = new ArrayList<Student>();
		courseList = new ArrayList<Course>();
		enrolmentList = new ArrayList<Enrolment>();
		feeList = new ArrayList<Fee>();
		attendanceList = new ArrayList<Attendance>();
	}
	
	


	@Test
	public void testAddStudent() {
		// Item list is not null, so that can add a new item - boundary.
		assertNotNull("Check if there is valid Student arraylist to add to", studentList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The student just added is as same as the first item of the list
		C206_CaseStudy.addStudent(studentList, s1);
		assertEquals("Check that Student arraylist size is 1", 1, studentList.size());
		assertSame("Check that Student is added", s1, studentList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The student just added is as same as the second item of the list
		C206_CaseStudy.addStudent(studentList, s2);
		assertEquals("Check that Student arraylist size is 2", 2, studentList.size());
		assertSame("Check that Student is added", s2, studentList.get(1));
	}
	
	@Test
	public void testRetreieveStudent() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Chromebook arraylist to retrieve item from", studentList);
		
		//test if the list of Student retrieved from the C206_CaseStudy is empty - boundary
		String students= C206_CaseStudy.retrieveStudent(studentList);
		String testOutput = "";
		assertEquals("Test that the retrieved Chromebooklist is empty?", testOutput, students);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addStudent(studentList, s1);
		C206_CaseStudy.addStudent(studentList, s2);
		assertEquals("Test that chromebook arraylist size is 2", 2, studentList.size());
		
		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy	
		students = C206_CaseStudy.retrieveStudent(studentList);
		testOutput = String.format("%-8s | %-2s\n", "22028513", "junwei");
		testOutput += String.format("%-8s | %-2s\n", "22021234", "skye");	
		assertEquals("Test that ViewAllChromebooklist", testOutput, students);
	}
	
	@Test 
	public void testDeleteStudent() {
		// boundary
		assertNotNull("test if there is valid Student arrayList to delete from",studentList);
		C206_CaseStudy.addStudent(studentList, s1);
		// normal
		Boolean ok = C206_CaseStudy.deleteStudent(studentList, "22028513");
		assertTrue("Test if student id is ok to delete?",ok);
		// error condition
		ok = C206_CaseStudy.deleteStudent(studentList,"00001111");
		assertFalse("Test if non-esiting student id is NOT ok to delete?",ok);
	}

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
		// Item list is not null, so that can add a new item - boundary.
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
	 
	 @Test
		public void testAddAttendance() {
			assertNotNull("Check if there is valid Attendance arraylist to add to", attendanceList);
			C206_CaseStudy.addAttendance(attendanceList, a1);
			assertEquals("Check that Attendance arraylist size is 1", 1, attendanceList.size());
			assertSame("Check that attendance is added", a1, attendanceList.get(0));
				
			
			C206_CaseStudy.addAttendance(attendanceList, a2);
			assertEquals("Check that Attendance arraylist size is 2", 2, attendanceList.size());
			assertSame("Check that Attendance is added", a2, attendanceList.get(1));

		}
	 @Test
		public void testViewAttendance() {
			assertNotNull("Test if there is valid Attenndance arrayList to view item", attendanceList);
			
			String allAttendance = C206_CaseStudy.viewAttendance(attendanceList);
			String testOutput = "";
			assertEquals("Check the ViewAttendanceList", testOutput, allAttendance);
			
			C206_CaseStudy.addAttendance(attendanceList, a1);
			assertEquals("Test that the Attendance arrayList size is 1", 1 , attendanceList.size());
			
			allAttendance = C206_CaseStudy.viewAttendance(attendanceList);
			testOutput = String.format("%-8s | %-8s | %-2s\n", "Name", "Student ID", "Attendance");
			
			assertEquals("Test the ViewAttendance", testOutput, allAttendance);
		}
		
	 @Test
		public void testDeleteAttendance() {
			assertTrue("Test that valid attendance is deleted", C206_CaseStudy.deleteAttendance(attendanceList));
			assertEquals("Test that attendanceList size is reduced", 1, attendanceList.size());
			
			assertFalse("Test that invalid attendance is not deleted", C206_CaseStudy.deleteAttendance(attendanceList));
			assertEquals("Test that attendanceList size remains the same", 1, attendanceList.size());
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
