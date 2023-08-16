import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Student s1;
	private Student s2;
	private User u1;
	private User u2;
	private Course c1;
	private Course c2;
	private Enrolment e1;
	private Enrolment e2;
	private Fee f1;
	private Fee f2;
	private Attendance a1;
	private Attendance a2;

	private ArrayList<Student> studentList;
	private ArrayList<User> userList;
	private ArrayList<Course> courseList;
	private ArrayList<Enrolment> enrolmentList;
	private ArrayList<Attendance> attendanceList;

	private ArrayList<Fee> feeList;

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("22028513","junwei");

		s2 = new Student("22021234","skye");
		c1 = new Course ("ms lim", "C123", "English");
		c2 = new Course ("mr goh", "C456", "Maths");
		s2 = new Student("22021234","skye");
		//u1 = new User("Bob", "Republ!c02", "Admin");
		//u2 = new User("Alan", "Republ!c01", "Teacher");
		e1 = new Enrolment("22005047", "C110");
		e2 = new Enrolment("22028513", "C123");
		f1 = new Fee("22028513", "Exam", 70.0);
		f2 = new Fee("22021234", "Tuition", 100.0);
		a1= new Attendance("Haowen", "22021111", "Present");
		a2 = new Attendance("Tom", "22023333", "Absent");
		
		studentList = new ArrayList<Student>();
		userList = new ArrayList<User>();
		courseList = new ArrayList<Course>();
		enrolmentList = new ArrayList<Enrolment>();
		feeList = new ArrayList<Fee>();
		attendanceList = new ArrayList<Attendance>();
	}

	// Surendar Mayan
	@Test
	public void testAddUser() {
		// User list is not null, so that can add a new user - boundary.
		assertNotNull("Check if there is valid User arraylist to add to", userList);
		// Given an empty list, after adding 1 user, the size of the list is 1 - normal
		// The user just added is as same as the first users of the list
		C206_CaseStudy.addUser(userList, u1);
		assertEquals("Check that User arraylist size is 1", 1, userList.size());
		assertSame("Check that User is added", u1, userList.get(0));
		// Add another user. test The size of the list is 2? -normal
		// The student just added is as same as the second user of the list
		C206_CaseStudy.addUser(userList, u2);
		assertEquals("Check that User arraylist size is 2", 2, userList.size());
		assertSame("Check that user is added", u2, userList.get(1));
	}

	@Test
	public void testRetrieveUser() {
		// Test if Item list is not null but empty - boundary
		// ArrayList<User> testList = new ArrayList<User>();
		// ArrayList testOutput = "[]";
		assertNotNull("Test if there is valid User arraylist to retrieve user from", userList);

		// test if the list of Attendance retrieved from the C206_CaseStudy is empty -
		// boundary
		String user = C206_CaseStudy.retrieveUser(userList);
		String testOutput1 = "";
		assertEquals("Test that the retrieved userList is empty?", testOutput1, user);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addUser(userList, u1);
		C206_CaseStudy.addUser(userList, u2);
		assertEquals("Test that fee arraylist size is 2", 2, userList.size());

		// test if the expected output string same as the list of attendance retrieved
		// from the C206_CaseStudy
		user = C206_CaseStudy.retrieveUser(userList);

		testOutput1 = String.format("%-8s | %-8s | %-2s\n", "Bob", "Republ!c02", "Admin");
		testOutput1 += String.format("%-8s | %-8s | %-2s\n", "Alan", "Republ!c01", "Teacher");
		assertEquals("Test that ViewAllUserlist", testOutput1, user);
	}

	@Test
	public void testDeleteUser() {
		// boundary
		assertNotNull("test if there is valid User arrayList to delete from", userList);
		C206_CaseStudy.addUser(userList, u1);
		// normal
		Boolean ok = C206_CaseStudy.deleteUser(userList, "Admin1");
		assertFalse("Test if user name is ok to delete?", ok);
		// error condition
		ok = C206_CaseStudy.deleteUser(userList, "00005555");
		assertFalse("Test if non-esiting user name is NOT ok to delete?", ok);
	}

	// JUN WEI
	@Test
	public void testAddStudent() {
		// student list is not null, so that can add a new student - boundary.
		assertNotNull("Check if there is valid Student arraylist to add to", studentList);
		// Given an empty list, after adding 1 student, the size of the list is 1 -
		// normal
		// The student just added is as same as the first student of the list
		C206_CaseStudy.addStudent(studentList, s1);
		assertEquals("Check that Student arraylist size is 1", 1, studentList.size());
		assertSame("Check that Student is added", s1, studentList.get(0));

		// Add another student. test The size of the list is 2? -normal
		// The student just added is as same as the second student of the list
		C206_CaseStudy.addStudent(studentList, s2);
		assertEquals("Check that Student arraylist size is 2", 2, studentList.size());
		assertSame("Check that Student is added", s2, studentList.get(1));
	}

	// JUN WEI
	@Test
	public void testRetreieveStudent() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Student arraylist to retrieve item from", studentList);

		// test if the list of Student retrieved from the C206_CaseStudy is empty -
		// boundary
		String students = C206_CaseStudy.retrieveStudent(studentList);
		String testOutput = "";
		assertEquals("Test that the retrieved StudentList is empty?", testOutput, students);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addStudent(studentList, s1);
		C206_CaseStudy.addStudent(studentList, s2);
		assertEquals("Test that Student arraylist size is 2", 2, studentList.size());

		// test if the expected output string same as the list of student retrieved from
		// the C206_CaseStudy
		students = C206_CaseStudy.retrieveStudent(studentList);
		testOutput = String.format("%-8s | %-2s\n", "22028513", "junwei");
		testOutput += String.format("%-8s | %-2s\n", "22021234", "skye");
		assertEquals("Test that ViewStudentlist", testOutput, students);
	}

	// JUN WEI
	@Test
	public void testDeleteStudent() {
		// boundary
		assertNotNull("test if there is valid Student arrayList to delete from", studentList);
		C206_CaseStudy.addStudent(studentList, s1);
		// normal
		Boolean ok = C206_CaseStudy.deleteStudent(studentList, "22028513");
		assertTrue("Test if student id is ok to delete?", ok);
		// error condition
		ok = C206_CaseStudy.deleteStudent(studentList, "00001111");
		assertFalse("Test if non-existing student id is NOT ok to delete?", ok);
	}

	@Test
	public void testAddFee() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Fee arraylist to add to", feeList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addFee(feeList, f1);
		assertEquals("Test that Fee arraylist size is 1", 1, feeList.size());
		assertSame("Test that Fee is added", f1, feeList.get(0));

		// Add another item. test The size of the list is 2? - normal
		// The item just added is as same as the second item of the list
		C206_CaseStudy.addFee(feeList, f2);
		assertEquals("Test that Fee arraylist size is 2", 2, feeList.size());
		assertSame("Test that Fee is added", f2, feeList.get(1));
	}

	@Test
	public void testRetrieveFee() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Fee arraylist to retrieve item from", feeList);

		// test if the list of Attendance retrieved from the C206_CaseStudy is empty -
		// boundary
		String fee = C206_CaseStudy.retrieveFee(feeList);
		String testOutput = "";
		assertEquals("Test that the retrieved feeList is empty?", testOutput, fee);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addFee(feeList, f1);
		C206_CaseStudy.addFee(feeList, f2);
		assertEquals("Test that fee arraylist size is 2", 2, feeList.size());

		// test if the expected output string same as the list of attendance retrieved
		// from the C206_CaseStudy
		fee = C206_CaseStudy.retrieveFee(feeList);
		testOutput = String.format("%-8s | %-8s | %-2.2f\n", "22028513", "Exam", 70.0);
		testOutput += String.format("%-8s | %-8s | %-2.2s\n", "22021234", "Tuition", 100.0);
		assertEquals("Test that ViewAllFeelist", testOutput, fee);
	}

	@Test
	public void testDeleteFee() {
		// boundary
		assertNotNull("test if there is valid Fee arrayList to delete from", feeList);
		C206_CaseStudy.addFee(feeList, f1);
		// normal
		Boolean ok = C206_CaseStudy.deleteFee(feeList, "22027890");
		assertTrue("Test if student id is ok to delete?", ok);
		// error condition
		ok = C206_CaseStudy.deleteFee(feeList, "22020000");
		assertFalse("Test if non-existing student id is NOT ok to delete?", ok);
	}

	// SKYE 22019995
	@Test
	public void testAddCourse() {
		// Item list is not null, so that can add a new item - boundary.
		assertNotNull("Check if there is valid Course arraylist to add to", courseList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addCourse(courseList, c1);
		assertEquals("Check that Course arraylist size is 1", 1, courseList.size());
		assertSame("Check that Course is added", c1, courseList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		C206_CaseStudy.addCourse(courseList, c2);
		assertEquals("Check that Course arraylist size is 2", 2, courseList.size());
		assertSame("Check that Course is added", c2, courseList.get(1));
	}

	// SKYE 22019995
	@Test
	public void testDeleteCourse() {
		// boundary
		assertNotNull("test if there is valid Course arrayList to delete from", courseList);
		C206_CaseStudy.addCourse(courseList, c1);
		// normal
		Boolean ok = C206_CaseStudy.deleteCourse(courseList, "C123");
		assertTrue("Test if course id is ok to delete?", ok);
		// error condition
		ok = C206_CaseStudy.deleteCourse(courseList, "AAAA");
		assertFalse("Test if non-existing course id is NOT ok to delete?", ok);
	}

	// SKYE 22019995
	@Test
	public void testRetrieveCourse() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Course in arraylist to retrieve item from", courseList);

		// test if the list of Courses retrieved from the C206_CaseStudy is empty -
		// boundary
		String courses = C206_CaseStudy.retrieveCourse(courseList);
		String testOutput = "";
		assertEquals("Test if CourseList is empty?", testOutput, courses);

		// Given an empty list, after adding 2 courses, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addCourse(courseList, c1);
		C206_CaseStudy.addCourse(courseList, c2);
		assertEquals("Test that Course arraylist size is 2", 2, courseList.size());

		// test if the expected output string same as the list of courses retrieved from
		// the C206_CaseStudy
		courses = C206_CaseStudy.retrieveCourse(courseList);
		testOutput = String.format("%-8s | %-8s | %-2s", "ms lim", "C123", "English");
		testOutput += String.format("%-8s | %-8s | %-2s", "mr goh", "C456", "Maths");
		assertEquals("Test that ViewCourselist", testOutput, courses);
	}

	@Test
	public void testAddEnrolment() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Enrolment arraylist to add to", enrolmentList);

		// Test the method with different scenario
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
	public void testRetreieveAttendance() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Attendance arraylist to retrieve item from", attendanceList);

		// test if the list of Attendance retrieved from the C206_CaseStudy is empty -
		// boundary
		String attendance = C206_CaseStudy.retrieveAttendance(attendanceList);
		String testOutput = "";
		assertEquals("Test that the retrieved Attendancelist is empty?", testOutput, attendance);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addAttendance(attendanceList, a1);
		C206_CaseStudy.addAttendance(attendanceList, a2);
		assertEquals("Test that attendance arraylist size is 2", 2, attendanceList.size());

		// test if the expected output string same as the list of attendance retrieved
		// from the C206_CaseStudy
		attendance = C206_CaseStudy.retrieveAttendance(attendanceList);
		testOutput = String.format("%-8s | %-8s | %-2s\n", "Haowen", "22021111", "Present");
		testOutput += String.format("%-8s | %-8s | %-2s\n", "Tom", "22023333", "Absent");
		assertEquals("Test that ViewAllAttendancelist", testOutput, attendance);
	}

	@Test
	public void testDeleteAttendance() {
		// boundary
		assertNotNull("test if there is valid Attendance arrayList to delete from", attendanceList);
		C206_CaseStudy.addAttendance(attendanceList, a1);
		// normal
		Boolean ok = C206_CaseStudy.deleteAttendance(attendanceList, "22021111");
		assertTrue("Test if student id is ok to delete?", ok);
		// error condition
		ok = C206_CaseStudy.deleteAttendance(attendanceList, "00001111");
		assertFalse("Test if non-existing student id is NOT ok to delete?", ok);
	}

	@After
	public void tearDown() throws Exception {
		s1 = null;
		s2 = null;
		studentList = null;
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
