package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructor: prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter students first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter students last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 Freshmen\n2 Sophomore\n3 Junior\n4 Senior\nEnter students grad year: ");
		this.gradYear = in.nextInt();
		
		setStudentID();
		
	
		//System.out.println(firstName + " " + lastName + " " + gradYear + " " + studentID);
		
		
		
	}
	//Generate ID
	private void setStudentID() {
		//grad level+ id
		id++;
		this.studentID = gradYear + " " + id;
		
	}
	
	//Enroll in courses
	public void enroll() {
		//get in a loop for user hitting 0
		do {
		System.out.print("Enter course to enroll (Q to Quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if ( !course.equals("Q")) {
		courses = courses + "\n " + course;
		tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			break;
		}
		}while (1 != 0);
		//System.out.println("Enrolled In: " + courses);
		//System.out.println("Tuition Balance: " + tuitionBalance);
	}
	//View balance
	public void viewBalance() { 
		System.out.println("Your Balance is: " + tuitionBalance);
	}
	
	
	//Pay tuition
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $ ");
		Scanner in  = new Scanner(System.in);
		int payment = in.nextInt();
		
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for Payment of $ " + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {

		return "Name: " + firstName + " " + lastName +
				"\nGradYear: " + gradYear +
				"\nstudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
		
	}
}
