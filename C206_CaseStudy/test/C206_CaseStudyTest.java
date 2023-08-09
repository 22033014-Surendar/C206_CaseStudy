import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Student s1;
	private Student s2;
	
	private ArrayList<Student> studentList;

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("22028513","junwei");
		s2 = new Student("22021234","skye");
		
		studentList = new ArrayList<Student>();
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

}
