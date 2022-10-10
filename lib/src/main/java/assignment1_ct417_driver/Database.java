package assignment1_ct417_driver;

import assignment1_ct417.*;
import assignment1_ct417.Module;
import assignment1_ct417.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.joda.time.*;

public class Database {
	
	// Creating Lecturers
	Lecturer johndoe = new Lecturer("John Doe", new LocalDate(1955,1,5));
	Lecturer rachelappelese = new Lecturer("Rachel Appelese", new LocalDate(1970,6,8));
	Lecturer jimbeam = new Lecturer("Jim Beam", new LocalDate(1965,10,10));
	
	// Creating Modules
	Module software = new Module(johndoe, "Software Engineering", "CT417");
	Module realtimesystems = new Module(johndoe, "Real Time Systems", "CT4101");
	Module learning = new Module(rachelappelese, "Learning 101", "LL121");
	Module professionalskills = new Module(rachelappelese, "Professional Skills", "EE193");
	Module beams = new Module(jimbeam, "Beams", "JB10");
	Module fishing = new Module(jimbeam, "Fishing 101", "FF101");
	
	// Creating Courses
	Course engineeringCourse = new Course("Computer Engineering", "ECE", new ArrayList<Student>(), new ArrayList<Module>(), 
			new LocalDate(2019, 9, 5), new LocalDate(2023, 6,5));
	
	Course fishingCourse = new Course("Learn to be a Fisher", "FSH", new ArrayList<Student>(), new ArrayList<Module>(), 
			new LocalDate(2019, 8, 31), new LocalDate(2026, 6,5));
	
	Course computerScience = new Course("Computer Science", "CS", new ArrayList<Student>(), new ArrayList<Module>(), 
			new LocalDate(2019, 9, 12), new LocalDate(2023, 7,1));
	
	// Creating Students
	Student stu1 = new Student("Jack Daniel", new LocalDate(2001, 10,10), "ECE");
	Student stu2 = new Student("James Bond", new LocalDate(1980, 6,1), "FSH");
	Student stu3 = new Student("Bob Ross", new LocalDate(1972, 12,19), "CS");
	Student stu4 = new Student("Michelle Doe", new LocalDate(2000,1,1), "ECE");
	Student stu5 = new Student("Jane Carl", new LocalDate(1999,11, 30), "CS");
	Student stu6 = new Student("Cristiano Ronaldo", new LocalDate(1990, 1,30), "FSH");
	
	// List of Students
	ArrayList<Student> allStudents = new ArrayList<Student>(Arrays.asList(stu1, stu2,stu3,stu4,stu5,stu6));
	
	
	// Scanner object
	Scanner scan = new Scanner(System.in);
	
	Database() {
//	// Creating Lecturers
//		Lecturer johndoe = new Lecturer("John Doe", new LocalDate(1955,1,5));
//		Lecturer rachelappelese = new Lecturer("Rachel Appelese", new LocalDate(1970,6,8));
//		Lecturer jimbeam = new Lecturer("Jim Beam", new LocalDate(1965,10,10));
//		
//		// Creating Modules
//		Module software = new Module(johndoe, "Software Engineering", "CT417");
//		Module realtimesystems = new Module(johndoe, "Real Time Systems", "CT4101");
//		Module learning = new Module(rachelappelese, "Learning 101", "LL121");
//		Module professionalskills = new Module(rachelappelese, "Professional Skills", "EE193");
//		Module beams = new Module(jimbeam, "Beams", "JB10");
//		Module fishing = new Module(jimbeam, "Fishing 101", "FF101");
//		
//		// Creating Courses
//		Course engineeringCourse = new Course("Computer Engineering", "ECE", new ArrayList<Student>(), new ArrayList<Module>(), 
//				new LocalDate(2019, 9, 5), new LocalDate(2023, 6,5));
//		
//		Course fishingCourse = new Course("Learn to be a Fisher", "FSH", new ArrayList<Student>(), new ArrayList<Module>(), 
//				new LocalDate(2019, 8, 31), new LocalDate(2026, 6,5));
//		
//		Course computerScience = new Course("Computer Science", "CS", new ArrayList<Student>(), new ArrayList<Module>(), 
//				new LocalDate(2019, 9, 12), new LocalDate(2023, 7,1));
//		
//		// Creating Students
//		Student stu1 = new Student("Jack Daniel", new LocalDate(2001, 10,10), "ECE");
//		Student stu2 = new Student("James Bond", new LocalDate(1980, 6,1), "FSH");
//		Student stu3 = new Student("Bob Ross", new LocalDate(1972, 12,19), "CS");
//		Student stu4 = new Student("Michelle Doe", new LocalDate(2000,1,1), "ECE");
//		Student stu5 = new Student("Jane Carl", new LocalDate(1999,11, 30), "CS");
//		Student stu6 = new Student("Cristiano Ronaldo", new LocalDate(1990, 1,30), "FSH");
//		
//		// List of Students
//		ArrayList<Student> allStudents = new ArrayList<Student>(Arrays.asList(stu1, stu2,stu3,stu4,stu5,stu6));
		
		
	}
	public static void main (String[] args) {
		Database db = new Database();
		db.startProgram();
	}
	
	public void startProgram() {
		while (true){
			System.out.println("\n======================================================");
			System.out.println("Unversity of Galway Database. Please select an option:\n");
			System.out.printf("1) View Students\n2) View Lecturers\n3) View Courses\n4) View Modules\n5) Quit\n");
			System.out.println("======================================================");
			String input = scan.nextLine();
			int inputNum;
			try {
				inputNum = Integer.valueOf(input);
			} catch (Exception e) {
				System.out.println("Invalid Input");
				continue;
			}
			if (inputNum == 1) 
				viewStudents();
			else if (inputNum == 2)
				viewLecturers();
			else if (inputNum == 3)
				viewCourses();
			else if (inputNum == 4)
				viewModules();
			else if (inputNum == 5)
				System.exit(0);
			
	}
}
	private void viewModules() {
		// TODO Auto-generated method stub
		
	}
	private void viewCourses() {
		// TODO Auto-generated method stub
		
	}
	private void viewLecturers() {
		// TODO Auto-generated method stub
		
	}
	private void viewStudents() {
		for (int i = 1; i < allStudents.size()+1; i++) {
			System.out.println(i + " " + allStudents.get(i-1).getName());
		}
		
		System.out.println("Select a student for more options or press enter to return");
		String input = scan.nextLine();
		if (input.equals("")){
			return;
		}
		try { 
			int inputNum = Integer.valueOf(input);
			System.out.print(allStudents.get(inputNum-1));
		} catch (Exception e) {
			System.out.println("Please enter a valid input");
			viewStudents();
		}
		
	
	}

}
