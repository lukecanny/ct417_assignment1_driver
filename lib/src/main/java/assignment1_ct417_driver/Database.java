package assignment1_ct417_driver;

import assignment1_ct417.*;
import assignment1_ct417.Module;
import assignment1_ct417.Student;
import java.util.ArrayList;
import java.util.Arrays;

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
	
	
	
	
	Database() {
		ArrayList<Student> allStudents = new ArrayList<Student>(Arrays.asList(stu1, stu2,stu3,stu4,stu5,stu6));
		for (int i = 0; i < allStudents.size(); i++) {
			Student curr = (Student) allStudents.get(i);
		    curr.getCourseCode();
		}
		
	}
	public static void main (String[] args) {
		
	}
}
