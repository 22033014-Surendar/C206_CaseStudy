import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int MANAGE_STUDENT = 3;
	private static final int OPTION_QUIT = 4;
	private static final int OPTION_DELETE = 3;
	private static final int OPTION_VIEW = 2;
	private static final int OPTION_ADD = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialise User arraylist with User Object
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("Admin1", "Republ!c01"));
		userList.add(new User("TeacherAlan", "Republ!c01"));

		// initialise Student arraylist with Student objects JUN WEI
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
		
		// initialise Fee arraylist with Fee objects
		ArrayList<Fee> feeList = new ArrayList<Fee>();
		feeList.add(new Fee("22028513", "Exam", 70.0));
		feeList.add(new Fee("22021234", "Tuition", 100.50));
		feeList.add(new Fee("22024321", "Exam", 60.90));
		
		//initialise Attendance arraylist with Attendance objects
		ArrayList<Attendance> attendanceList = new ArrayList<Attendance>();
		attendanceList.add(new Attendance("Haowen", "22021111", "Present"));
		attendanceList.add(new Attendance("John", "22023344", "Absent"));
		attendanceList.add(new Attendance("Tom", "22029988", "Late"));

		//Enrolment arrayList
		ArrayList<Enrolment> enrolmentList = new ArrayList<Enrolment>();
				
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
			} else if (option == MANAGE_STUDENT) {
				// add,view, delete student JUN WEI
				manageStudent(studentList);
			} else if (option == 4) {
				// add,view, delete fee
				manageFee(feeList);
			} else if (option == 5) {
				manageEnrolment(enrolmentList);
				// add,view, delete enrolment
			} else if (option == 6) {
				// add,view, delete attendance
				manageAttendance(attendanceList);
			} else if (option == 7) {
				// quit
				System.out.println("\n Sayonara!");
			} else {
				// invalid input
				System.out.println("\n*** Invalid option ***\n");
			}
		}
	}

	// ====== main menu ====================== 
	public static void mainMenu() {
		System.out.println();
		Helper.line(33, "*");
		System.out.println("*** TUITION MANAGEMENT SYSTEM ***");
		Helper.line(33, "*");
		System.out.println("1. Manage User");
		System.out.println("2. Manage Course");
		System.out.println("3. Manage Student");
		System.out.println("4. Manage Fee");
		System.out.println("5. Manage Enrolment");
		System.out.println("6. Manage Attendance");
		System.out.println("7. Quit");

	}

	// ====== manage User ===============================================
		public static void manageUser(ArrayList<User> userList) {
			int option = 0;
			while (option != 4) {
				System.out.println("1. Add Student");
				System.out.println("2. View Student");
				System.out.println("3. Delete Student");
				option = Helper.readInt("\nEnter option or 0 for student menu > ");
				if (option == 1) {
					addUser(userList);
				} else if (option == 2) {
					viewUser(userList);
				} else if (option == 3) {
					deleteUser (userList);
				} else if (option == 4) {
					break;
				} else {
					// invalid input
					System.out.println("\n*** Invalid option ***\n");
				}
			}
		}

		
		// ====== add User ===========================================

		private static void addUser(ArrayList<User> userList) {
			// TODO Auto-generated method stub
			String username = Helper.readString("Enter username: ");
			String password = Helper.readString("Enter password: ");
			userList.add(new User(username, password));
			userList.get(userList.size() - 1).display();
			System.out.println("***new user has been added***\n");
		}
			
		// ====== view User ============================================
		private static void viewUser(ArrayList<User> userList) {
			// TODO Auto-generated method stub
			Helper.line(20, "=");
			System.out.println(String.format("%-8s | %-2s", "Username", "Name"));
			Helper.line(20, "=");
			for (User s : userList) {
				System.out.println(String.format("%-8s | %-2s", s.getusername(), s.getpassword()));

			}
			System.out.println();
			
			
		}

		private static boolean deleteUser(ArrayList<User> userList) {
			// TODO Auto-generated method stub
			boolean userFound = false;
			String username = Helper.readString("Enter username: ");
			System.out.println();

			for (User u : userList) {
				if (username.equalsIgnoreCase(u.getusername())) {
					u.display();
					userFound = true;

					String confirm = Helper.readString("\nConfirm Delete (y/n) >");
					if (confirm.equalsIgnoreCase("y")) {
						userList.remove(u);
						System.out.println("\n*** User has been deleted ***");
						break;
					} else if (confirm.equalsIgnoreCase("n")) {
						System.out.println("\n*** Deletion was cancel ***");
					} else {
						System.out.println("\nInvalid input");
					}
				}
			}
			return userFound;
		}
	
	
		// ====== manage student ===================================== JUN WEI 
		public static void manageStudent(ArrayList<Student> studentList) {
			int option = 0;
			while (option != 4) {
				System.out.println("1. Add Student");
				System.out.println("2. View Student");
				System.out.println("3. Delete Student");
				option = Helper.readInt("\nEnter option or 0 for student menu > ");
				if (option == OPTION_ADD) {
					Student st = inputStudent();
					addStudent(studentList,st);
				} else if (option == OPTION_VIEW) {
					viewStudent(studentList);
				} else if (option == OPTION_DELETE) {
					String id = Helper.readString("Enter student id: ");
					deleteStudent(studentList, id);
				} else if (option == OPTION_QUIT) {
					break;
				} else {
					// invalid input
					System.out.println("\n*** Invalid option ***\n");
				}
			}
		}

		// ====== add student ======================================= JUN WEI
		public static Student inputStudent() {
			String id = Helper.readString("Enter student id: ");
			String name = Helper.readString("Enter student name: ");
			Student st = new Student(id, name);
			return st;
		}
		public static void addStudent(ArrayList<Student> studentList,Student st) {
			studentList.add(st);
			studentList.get(studentList.size() - 1).display();
			System.out.println("***new student has been added***\n");
		}
		
		// ====== view student ======================================== JUN WEI
		public static String retrieveStudent(ArrayList<Student> studentList) {
			String output = "";

			for (int i = 0; i < studentList.size(); i++ ) {
				
				String id = studentList.get(i).getId();
				String name = studentList.get(i).getName();
				output += String.format("%-8s | %-2s\n", id,name);
				
			}
			return output;
		}
		
		public static void viewStudent(ArrayList<Student> studentList) {

			String output = String.format("%-8s | %-2s\n", "ID", "Name");
			
			output += retrieveStudent(studentList);
			System.out.println(output);
		}

		// ====== delete student =========================================== JUN WEI
		public static boolean deleteStudent(ArrayList<Student> studentList, String id) {
			boolean studentFound = false;

			for (Student s : studentList) {
				String studentID = s.getId();
				if (id.equalsIgnoreCase(studentID)) {
					s.display();
					studentFound = true;
					studentList.remove(s);
				}
			}
			return studentFound;
		}


	// =================================== Course ==================================
	public static Course inputCourse() {
		String teacher = Helper.readString("Enter teacher's name : ");
		String id = Helper.readString("Enter course id: ");
		String name = Helper.readString("Enter course name: ");
		
		Course cc= new Course(teacher, id, name);
		return cc;
	}

	// ====== manage course =============================================
	public static void manageCourse(ArrayList<Course> courseList) {
		int option = 0;
		while (option != 4) {
			System.out.println("1. Add Course");
			System.out.println("2. View Course");
			System.out.println("3. Delete Course");
			option = Helper.readInt("\nEnter option or 0 for course menu > ");
			if (option == 1) {
				Course cc = inputCourse();
				addCourse(courseList, cc);
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
	public static void addCourse(ArrayList<Course> courseList, Course cc) {
		//String teacher = Helper.readString("Enter teacher's name: ");
		//String id = Helper.readString("Enter course id: ");
		//String name = Helper.readString("Enter course name: ");
		courseList.add(cc);
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
		
		// ====== add grade ==================================================
		public static void addGrade(ArrayList<Grade> gradeList) {
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
		// ====== manage enrolment ======
	    public static void manageEnrolment(ArrayList<Enrolment> enrolmentList) {
	        int option = 0;
	        while (option != 4) {
	            System.out.println("1. Add Enrolment");
	            System.out.println("2. View Enrolment");
	            System.out.println("3. Delete Enrolment");
	            option = Helper.readInt("\nEnter option or 0 for enrolment menu > ");
	            if (option == 1) {
	                addEnrolment(enrolmentList);
	            } else if (option == 2) {
	                viewEnrolment(enrolmentList);
	            } else if (option == 3) {
	                deleteEnrolment(enrolmentList);
	            } else if (option == 4) {
	                break;
	            } else {
	                System.out.println("\n*** Invalid option ***\n");
	            }
	        }
	    }

	    // ====== add enrolment ======
	    public static void addEnrolment(ArrayList<Enrolment> enrolmentList) {
	        String studentId = Helper.readString("Enter student ID: ");
	        String courseId = Helper.readString("Enter course ID: ");
	        enrolmentList.add(new Enrolment(studentId, courseId));
	        System.out.println("*** New enrolment has been added ***\n");
	    }

	    // ====== view enrolment ======
	    public static void viewEnrolment(ArrayList<Enrolment> enrolmentList) {
	        Helper.line(30, "=");
	        System.out.println(String.format("%-12s | %-10s", "Student ID", "Course ID"));
	        Helper.line(30, "=");
	        for (Enrolment enrolment : enrolmentList) {
	            System.out.println(String.format("%-12s | %-10s", enrolment.getStudentId(), enrolment.getCourseId()));
	        }
	        System.out.println();
	    }

	    // ====== delete enrolment ======
	    public static void deleteEnrolment(ArrayList<Enrolment> enrolmentList) {
	        String studentId = Helper.readString("Enter student ID: ");
	        String courseId = Helper.readString("Enter course ID: ");
	        boolean enrolmentFound = false;
	        
	        for (Enrolment enrolment : enrolmentList) {
	            if (enrolment.getStudentId().equalsIgnoreCase(studentId) && enrolment.getCourseId().equalsIgnoreCase(courseId)) {
	                enrolmentFound = true;
	                enrolmentList.remove(enrolment);
	                System.out.println("\n*** Enrolment has been deleted ***");
	                break;
	            }
	        }
	        
	        if (!enrolmentFound) {
	            System.out.println("\n*** Enrolment not found ***");
	        }
	    }
		
		// =================================== Attendance ==================================
	    public static void manageAttendance(ArrayList<Attendance> attendanceList) {
			int option = 0;
			while (option != 4) {
				System.out.println("1. Add Attendance");
				System.out.println("2. View Attendance");
				System.out.println("3. Delete Attendance");
				option = Helper.readInt("\nEnter option or 0 for attendance menu > ");
				if (option == 1) {
					Attendance ad = inputAttendance();
					addAttendance(attendanceList,ad);
				} else if (option == 2) {
					viewAttendance(attendanceList);
				} else if (option == 3) {
					String id = Helper.readString("Enter attendance id: ");
					deleteAttendance(attendanceList, id);
				} else if (option == 4) {
					break;
				} else {
					// invalid input
					System.out.println("\n*** Invalid option ***\n");
				}
			}
		}
	    
	    // =================================Input/ Add attendance============================
	    public static Attendance inputAttendance() {
			String name = Helper.readString("Enter attendace id: ");
			String id = Helper.readString("Enter attendance name: ");
			String attendance = Helper.readString("Enter attendance status > ");
			Attendance ad = new Attendance(name, id, attendance);
			return ad;
		}
		public static void addAttendance(ArrayList<Attendance> attendanceList, Attendance ad) {
			attendanceList.add(ad);
			attendanceList.get(attendanceList.size() - 1).display();
			System.out.println("***New attendance has been added***\n");
		}
		
		// ================================View Attendance=========================================
		public static String retrieveAttendance(ArrayList<Attendance> attendanceList) {
			String output = "";

			for (int i = 0; i < attendanceList.size(); i++ ) {
				
				output += String.format("%-8s | %-8s | %-2s\n", attendanceList.get(i).getName(),attendanceList.get(i).getId(), attendanceList.get(i).getAttendance());
				
			}
			return output;
		}
		
		public static void viewAttendance(ArrayList<Attendance> attendanceList) {

			String output = String.format("%-8s | %-8s | %-2s\n", "Name", "ID", "Attendance Status");
			
			output += retrieveAttendance(attendanceList);
			System.out.println(output);
		}
		
		//Delete Attendance
		public static boolean deleteAttendance(ArrayList<Attendance> attendanceList, String id) {
			boolean attendanceFound = false;
			System.out.println();

			for (Attendance a: attendanceList) {
				if (id.equalsIgnoreCase(a.getId())) {
					a.display();
					attendanceFound = true;

					String confirm = Helper.readString("\nConfirm Delete (y/n) >");
					if (confirm.equalsIgnoreCase("y")) {
						attendanceList.remove(a);
						System.out.println("\n*** Attendance successfully deleted! ***");
						break;
					} else if (confirm.equalsIgnoreCase("n")) {
						System.out.println("\n*** Deletion cancelled ***");
					} else {
						System.out.println("\nInvalid input");
					} 
				}
			}
			return attendanceFound;
			
		}
		
		// =================================== Fee ==================================
		public static Fee inputFee() {
			String studentID = Helper.readString("Enter student ID > ");
			String feeType = Helper.readString("Enter fee type > ");
			double fee = Helper.readDouble("Enter fee amount > ");

			Fee ff= new Fee(studentID, feeType, fee);
			return ff;
		}
			
		
		public static void manageFee(ArrayList<Fee> feeList) {
			int option = 0;
			while (option != 4) {
				System.out.println("1. Add Fee");
				System.out.println("2. View Fee");
				System.out.println("3. Delete Fee");
				option = Helper.readInt("\nEnter option or 0 for Fee menu > ");
				if (option == 1) {
					Fee ff = inputFee();
					addFee(feeList, ff);
				} else if (option == 2) {
					viewFee(feeList);
				} else if (option == 3) {
					String id = Helper.readString("Enter student ID: ");
					deleteFee(feeList, id);
				} else if (option == 4) {
					break;
				} else {
					System.out.println("\n*** Invalid option ***\n");
				}
			}
		}
		
		
		// ====== add fee ==================================================
		public static void addFee(ArrayList<Fee> feeList, Fee ff) {
			//String studentID = Helper.readString("Enter student id: ");
			//String feeType = Helper.readString("Enter fee type: ");
			//double fee = Helper.readDouble("Enter fee amount: ");
			feeList.add(ff);
			feeList.get(feeList.size() - 1).display();
			System.out.println("***new fee has been added***\n");
				}
				
		// ====== view fee =================================================
		public static String retrieveFee(ArrayList<Fee> feeList) {
			String output = "";

			for (int i = 0; i < feeList.size(); i++ ) {
				
				output += String.format("%-10s | %-10s | %-2.2f\n", feeList.get(i).getStudentID(),feeList.get(i).getFeeType(), feeList.get(i).getFee());
				
			}
			return output;
		}
		
		public static void viewFee(ArrayList<Fee> feeList) {

			String output = String.format("%-8s | %-10s | %-2s\n", "Student ID", "Fee Type", "Fee Amount");
			
			output += retrieveFee(feeList);
			System.out.println(output);
		}
		
		// ====== delete fee ===============================================
		public static boolean deleteFee(ArrayList<Fee> feeList, String id) {
			boolean feeFound = false;
			System.out.println();

			for (Fee f: feeList) {
				if (id.equalsIgnoreCase(f.getStudentID())) {
					f.display();
					feeFound = true;

					String confirm = Helper.readString("\nConfirm Delete (y/n) >");
					if (confirm.equalsIgnoreCase("y")) {
						feeList.remove(f);
						System.out.println("\n*** Fee successfully deleted! ***");
						break;
					} else if (confirm.equalsIgnoreCase("n")) {
						System.out.println("\n*** Deletion cancelled ***");
					} else {
						System.out.println("\nInvalid input");
					} 
				}
			}
			return feeFound;
			
		}
		
	}