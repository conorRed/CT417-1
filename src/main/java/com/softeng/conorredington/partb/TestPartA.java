package com.softeng.conorredington.partb;

import java.util.ArrayList;

import org.joda.time.DateTime;

import com.softeng.conorredington.assignment1.*;

/*
 * @Author Conor Redington
 */

public class TestPartA {
	ArrayList<Student> students1, students2, students3;
	ArrayList<Module> modules;
	/*
	 *  creating a handful of fictional students with mock data
	 *  adding the students to a number of modules and adding a number of modules to a course.
	 *  print out a list of all the courses, their respective modules,and all students, 
	 *  their usernames, assigned modules and the course(s) they are registered
	 */
	public TestPartA() {
		// make some students
		students1 = new ArrayList<Student>();
		students2 = new ArrayList<Student>();
		students3 = new ArrayList<Student>();
		modules = new ArrayList<Module>();
		students1.add(new Student("Tom", 18, "4/3/1998", "154356789"));
		students1.add(new Student("Terry", 19, "4/5/1997", "154356843"));
		students2.add(new Student("Mary", 20, "14/12/1996", "154356567"));
		students2.add(new Student("Martha", 20, "14/12/1996", "154356521"));
		students3.add(new Student("Gerry", 20, "14/12/1996", "1543565325"));
		students3.add(new Student("Confuscious", 20, "14/12/1996", "154353453"));
		
		modules.add(new Module("Networking", students1));
		modules.add(new Module("Software Engineering", students2));
		modules.add(new Module("Professional Skills", students3));
		students1.addAll(students2);
		Course course = new Course("Computer Science", modules, students1, 
				new DateTime(2015, 9, 1,1, 0), new DateTime(2019, 9, 1,1, 0));
		System.out.println("\nCourse " + course.getName());
		for (int m = 0; m < modules.size(); m++) {
			System.out.println("-- Module " + m + " is " + modules.get(m).getName());
			System.out.println("-- The students for this module are:");
			for (int s = 0; s < modules.get(m).getStudents().size(); s++) {
				System.out.println("-- -- " + modules.get(m).getStudents().get(s).getUserName());
			}
		}
		modules.remove(1);
		modules.remove(1);
		Course bis = new Course("Business and Information Systems", modules, students3, new DateTime(2015, 9, 1,1, 0), new DateTime(2019, 9, 1,1, 0));
		System.out.println("\nCourse " + course.getName());
		for (int m = 0; m < modules.size(); m++) {
			System.out.println("-- Module " + m + " is " + modules.get(m).getName());
			System.out.println("-- The students for this module are:");
			for (int s = 0; s < modules.get(m).getStudents().size(); s++) {
				System.out.println("-- -- " + modules.get(m).getStudents().get(s).getUserName());
			}
		}
		
	}
	
	public static void main(String[] args) {
		new TestPartA();
	}

}
