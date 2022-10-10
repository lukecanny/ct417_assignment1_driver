package assignment1_ct417_driver;

import assignment1_ct417.*;
import assignment1_ct417.Module;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.joda.time.*;

public class Database {
	
	// Creating Lecturers
	// Lecturers are created first.
	Lecturer johndoe = new Lecturer("John Doe", new LocalDate(1955,1,5));
	Lecturer rachelappelese = new Lecturer("Rachel Appelese", new LocalDate(1970,6,8));
	Lecturer jimbeam = new Lecturer("Jim Beam", new LocalDate(1965,10,10));
	
	// Modules to be taught are created second, and lecturers are assigned.
	Module software = new Module(johndoe, "Software Engineering", "CT417");
	Module realtimesystems = new Module(johndoe, "Real Time Systems", "CT4101");
	Module learning = new Module(rachelappelese, "Learning 101", "LL121");
	Module professionalskills = new Module(rachelappelese, "Professional Skills", "EE193");
	Module beams = new Module(jimbeam, "Beams", "JB10");
	Module fishing = new Module(jimbeam, "Fishing 101", "FF101");
	
	// Courses are created next, modules are added to each course.
	Course engineeringCourse = new Course("Computer Engineering", "ECE", new ArrayList<Module>(Arrays.asList(software, realtimesystems, beams)),
			new LocalDate(2019, 9, 5), new LocalDate(2023, 6,5));
	
	Course fishingCourse = new Course("Learn to be a Fisher", "FSH", new ArrayList<Module>(Arrays.asList(fishing, professionalskills, beams)), 
			new LocalDate(2019, 8, 31), new LocalDate(2026, 6,5));
	
	Course computerScience = new Course("Computer Science", "CS", new ArrayList<Module>(Arrays.asList(software, learning, professionalskills)), 
			new LocalDate(2019, 9, 12), new LocalDate(2023, 7,1));
	
	// Students are created last, in the constructor, students enroll to different courses,
	Student stu1 = new Student("Jack Daniel", new LocalDate(2001, 10,10));
	Student stu2 = new Student("James Bond", new LocalDate(1980, 6,1));
	Student stu3 = new Student("Bob Ross", new LocalDate(1972, 12,19));
	Student stu4 = new Student("Michelle Doe", new LocalDate(2000,1,1));
	Student stu5 = new Student("Jane Carl", new LocalDate(1999,11, 30));
	Student stu6 = new Student("Cristiano Ronaldo", new LocalDate(1990, 1,30));
	

	
	
	// List of Students
	ArrayList<Student> allStudents = new ArrayList<Student>(Arrays.asList(stu1, stu2,stu3,stu4,stu5,stu6));
	// List of Lecturers
	ArrayList<Lecturer> allLecturers = new ArrayList<Lecturer>(Arrays.asList(johndoe, rachelappelese, jimbeam));
	// List of Modules
	ArrayList<Module> allModules = new ArrayList<Module>(Arrays.asList(software, realtimesystems, learning, professionalskills, beams, fishing));
	// List of Courses
	ArrayList<Course> allCourses = new ArrayList<Course>(Arrays.asList(engineeringCourse, fishingCourse, computerScience));
	
	// Scanner object
	PrintStream printer;
	Scanner scan;
	
	Database(InputStream inputStream, PrintStream printStream) {
		this.scan = new Scanner(inputStream);
		this.printer = new PrintStream(printStream);
		stu1.enroll(fishingCourse);
		stu2.enroll(fishingCourse);
		stu3.enroll(computerScience);
		stu4.enroll(computerScience);
		stu5.enroll(engineeringCourse);
		stu6.enroll(engineeringCourse);
		
		stu6.disenroll();
	}
	public static void main (String[] args) {
		Database db = new Database(System.in, System.out);
		db.startProgram();
	}
	
	public void startProgram() {
		
		while (true){
			printer.println("\n======================================================");
			printer.println("Unversity of Galway Database. Please select an option:\n");
			printer.printf("1) View Students\n2) View Lecturers\n3) View Courses\n4) View Modules\n5) Quit\n");
			printer.println("======================================================");
			String input;
			input = scan.nextLine();
			int inputNum;
			try {
				inputNum = Integer.valueOf(input);
			} catch (Exception e) {
				printer.println("Invalid Input");
				continue;
			}
			if (inputNum == 1) 
				viewList(allStudents);
			else if (inputNum == 2)
				viewList(allLecturers);
			else if (inputNum == 3)
				viewList(allCourses);
			else if (inputNum == 4)
				viewList(allModules);
			else if (inputNum == 5)
				System.exit(0);
			
	}
}

	
	private void viewList(ArrayList<?> list) {
		for (int i = 1; i < list.size()+1; i++) {
			printer.println(i + ") "+ ((UniversityElement) list.get(i-1)).getName());
		}
		
		printer.println("Select an item for more options or press enter to return");
		String input = scan.nextLine();
		if (input.equals("")){
			return;
		}
		try { 
			int inputNum = Integer.valueOf(input);
			printer.print(list.get(inputNum-1));
		} catch (Exception e) {
			printer.println("Please enter a valid input");
			viewList(list);
		}
	}

}
