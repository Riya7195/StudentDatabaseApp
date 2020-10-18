package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many users we want to add
		
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int noOfStudents = in.nextInt();
		Student[] students = new Student[noOfStudents-1];
		
		
		
		//create n number of new students
		for( int n=0; n<noOfStudents; n++) {
			students[n]= new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		
		
		
	}

}
