import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialise Student arraylist with Student objects
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("22028513", "jun wei"));
		studentList.add(new Student("22021234", "skye"));
		studentList.add(new Student("22024321", "amos"));

		// initialise Course arraylist with Course objects
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("ms lim", "C123", "English"));
		courseList.add(new Course("mr goh", "C456", "Maths"));
		
		// initialise Grade arraylist with Grade objects
		ArrayList<Grade> gradeList = new ArrayList<Grade>();
		gradeList.add(new Grade( "22028513", "C123", "A"));
		gradeList.add(new Grade("22021234", "C346", "A"));
		gradeList.add(new Grade("22024321", "C123", "F"));

		// display menu and ask for option
		int option = 99;
		mainMenu();
		// while loop for the option
		while (option != 7) {
			option = Helper.readInt("\nEnter option or 0 for main menu > ");
			if (option == 0) {
				// display main menu
				mainMenu();
			} else if (option == 1) {
				// add,view, delete user
			} else if (option == 2) {
				// add,view, delete course
				manageCourse(courseList);
			} else if (option == 3) {
				// add,view, delete student
				manageStudent(studentList);
			} else if (option == 4) {
				// edit,update, delete grade
			} else if (option == 5) {
				// add,view, delete enrolment
			} else if (option == 6) {
				// add,view, delete attendance
			} else if (option == 7) {
				// quit
				System.out.println("\n Sayonara!");
			} else {
				// invalid input
				System.out.println("\n*** Invalid option ***\n");
			}
		}
	}

	// ====== main menu ======
	public static void mainMenu() {
		System.out.println();
		Helper.line(33, "*");
		System.out.println("*** TUITION MANAGEMENT SYSTEM ***");
		Helper.line(33, "*");
		System.out.println("1. Manage User");
		System.out.println("2. Manage Course");
		System.out.println("3. Manage Student");
		System.out.println("4. Manage Grade???");
		System.out.println("5. Manage Enrolment");
		System.out.println("6. Manage Attendance");
		System.out.println("7. Quit");

	}

	// ====== manage student ===============================================
	public static void manageStudent(ArrayList<Student> studentList) {
		int option = 0;
		while (option != 4) {
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Delete Student");
			option = Helper.readInt("\nEnter option or 0 for student menu > ");
			if (option == 1) {
				addStudent(studentList);
			} else if (option == 2) {
				viewStudent(studentList);
			} else if (option == 3) {
				deleteStudent(studentList);
			} else if (option == 4) {
				break;
			} else {
				// invalid input
				System.out.println("\n*** Invalid option ***\n");
			}
		}
	}

	// ====== add student
	// ===========================================================
	public static void addStudent(ArrayList<Student> studentList) {
		String id = Helper.readString("Enter student id: ");
		String name = Helper.readString("Enter student name: ");
		studentList.add(new Student(id, name));
		studentList.get(studentList.size() - 1).display();
		System.out.println("***new student has been added***\n");
	}

	// ====== view student ======
	public static void viewStudent(ArrayList<Student> studentList) {
		Helper.line(20, "=");
		System.out.println(String.format("%-8s | %-2s", "ID", "Name"));
		Helper.line(20, "=");
		for (Student s : studentList) {
			System.out.println(String.format("%-8s | %-2s", s.getId(), s.getName()));

		}
		System.out.println();
	}

	// ====== delete student
	// ==========================================================
	public static boolean deleteStudent(ArrayList<Student> studentList) {
		boolean studentFound = false;
		String id = Helper.readString("Enter student id: ");
		System.out.println();

		for (Student s : studentList) {
			if (id.equalsIgnoreCase(s.getId())) {
				s.display();
				studentFound = true;

				String confirm = Helper.readString("\nConfirm Delete (y/n) >");
				if (confirm.equalsIgnoreCase("y")) {
					studentList.remove(s);
					System.out.println("\n*** Student has been deleted ***");
					break;
				} else if (confirm.equalsIgnoreCase("n")) {
					System.out.println("\n*** Deletion was cancel ***");
				} else {
					System.out.println("\nInvalid input");
				}
			}
		}
		return studentFound;
	}

	// ====== manage course ===============================================
	public static void manageCourse(ArrayList<Course> courseList) {
		int option = 0;
		while (option != 4) {
			System.out.println("1. Add Course");
			System.out.println("2. View Course");
			System.out.println("3. Delete Course");
			option = Helper.readInt("\nEnter option or 0 for course menu > ");
			if (option == 1) {
				addCourse(courseList);
			} else if (option == 2) {
				viewCourse(courseList);
			} else if (option == 3) {
				deleteCourse(courseList);
			} else if (option == 4) {
				break;
			} else {
				// invalid input
				System.out.println("\n*** Invalid option ***\n");
			}
		}
	}

	// ====== add course ===============================================
	public static void addCourse(ArrayList<Course> courseList) {
		String teacher = Helper.readString("Enter teacher's name: ");
		String id = Helper.readString("Enter course id: ");
		String name = Helper.readString("Enter course name: ");
		courseList.add(new Course(teacher, id, name));
		courseList.get(courseList.size() - 1).display();
		System.out.println("***Course successfully added!***\n");
	}

	// ====== view course ===============================================
	public static void viewCourse(ArrayList<Course> courseList) {
		Helper.line(40, "=");
		System.out.println(String.format("%-8s | %-8s | %-2s", "Teacher", "Course ID", "Course"));
		Helper.line(40, "=");
		for (Course c : courseList) {
			System.out.println(String.format("%-8s | %-8s | %-2s", c.getTeacher(), c.getId(), c.getName()));

		}
		System.out.println();
	}

	// ====== delete course ===============================================

	public static boolean deleteCourse(ArrayList<Course> courseList) {
		boolean courseFound = false;
		String id = Helper.readString("Enter course id: ");
		System.out.println();

		for (Course c : courseList) {
			if (id.equalsIgnoreCase(c.getId())) {
				c.display();
				courseFound = true;

				String confirm = Helper.readString("\nConfirm Delete (y/n) >");
				if (confirm.equalsIgnoreCase("y")) {
					courseList.remove(c);
					System.out.println("\n*** Course successfully deleted! ***");
					break;
				} else if (confirm.equalsIgnoreCase("n")) {
					System.out.println("\n*** Deletion cancelled ***");
				} else {
					System.out.println("\nInvalid input");
				}
			}
		}
		return courseFound;

	}
	// ====== delete course ===============================================

		public static boolean deleteCourse(ArrayList<Course> courseList) {
			boolean courseFound = false;
			String teacher = Helper.readString("Enter teacher name: ");
			System.out.println();

			for (Course c : courseList) {
				if (teacher.equalsIgnoreCase(c.getTeacher())) {
					c.display();
					courseFound = true;

					String confirm = Helper.readString("\nConfirm Delete (y/n) >");
					if (confirm.equalsIgnoreCase("y")) {
						courseList.remove(c);
						System.out.println("\n*** Course successfully deleted! ***");
						break;
					} else if (confirm.equalsIgnoreCase("n")) {
						System.out.println("\n*** Deletion cancelled ***");
					} else {
						System.out.println("\nInvalid input");
					}
				}
			}
			return courseFound;

		}
		
		// ====== add grade ==================================================
		public static boolean addGrade(ArrayList<Grade> gradeList) {
			String courseID = Helper.readString("Enter course id: ");
			String studentID = Helper.readString("Enter student id: ");
			String grade = Helper.readString("Enter student grade: ");
			gradeList.add(new Grade(courseID, studentID, grade));
			gradeList.get(gradeList.size() - 1).display();
			System.out.println("***new grade has been added***\n");
		}
		
		// ====== edit grade =================================================
		public static boolean editGrade(ArrayList<Grade> gradeList) {
			boolean gradeFound = false;
			String courseID = Helper.readString("Enter course id: ");
			String studentID = Helper.readString("Enter student id: ");
			for (Grade g : gradeList) {
				if (studentID.equalsIgnoreCase(g.getStudentID()) && courseID.equalsIgnoreCase(g.getCourseID())) {
					g.display();
					gradeFound = true;
					
					String grade = Helper.readString("\nEnter new grade > ");
					String confirm = Helper.readString("Confirm Delete (y/n) >");
					if (confirm.equalsIgnoreCase("y")) {
						g.setGrade(grade);
						System.out.println("\n*** Grade successfully edited! ***");
						break;
					} else if (confirm.equalsIgnoreCase("n")) {
						System.out.println("\n*** Editing process cancelled ***");
					} else {
						System.out.println("\nInvalid input");
					
					}
				}
			}
		return gradeFound;
}
		
		// ====== delete grade ===============================================
		public static boolean deleteGrade(ArrayList<Grade> gradeList) {
			boolean gradeFound = false;
			String studentID = Helper.readString("Enter student ID: ");
			System.out.println();

			for (Grade g : gradeList) {
				if (studentID.equalsIgnoreCase(g.getStudentID())) {
					g.display();
					gradeFound = true;

					String confirm = Helper.readString("\nConfirm Delete (y/n) >");
					if (confirm.equalsIgnoreCase("y")) {
						gradeList.remove(g);
						System.out.println("\n*** Grade successfully deleted! ***");
						break;
					} else if (confirm.equalsIgnoreCase("n")) {
						System.out.println("\n*** Deletion cancelled ***");
					} else {
						System.out.println("\nInvalid input");
					}
				}
			}
			return gradeFound;

		}
}