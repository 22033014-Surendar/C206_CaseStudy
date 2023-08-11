import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Student s1;
	private Student s2;
	private Fee f1;
	private Fee f2;
	
	private ArrayList<Student> studentList;
	private ArrayList<Fee> feeList;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("22028513","junwei");
		s2 = new Student("22021234","skye");
		f1 = new Fee("22028513", "Exam", 70.0);
		f2 = new Fee("22021234", "Tuition", 100.0);
		
		studentList = new ArrayList<Student>();
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

}
