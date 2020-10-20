# StudentDatabaseApp

This application performs the following tasks:
1. Ask the user how many new students will be added to the database
2. The user should be prompted to enter the name and year for each student
3. The student should have a 5-digit unique ID, with the first number being their grade level
4. A student can enroll in the following courses:
- History 101
- Mathematics 101
- English 101
- Chemistry 101
- Computer Science 101
5. Each course costs $600 to enroll
6. The student should be able to view their balance and pay the tuition
7. To see the status of the student, we should see their name, ID, courses enrolled, and balance.

### Example:

#### Sample Input and Output

```

Enter number of students to enroll: 2
Enter students first name: 
Riya
Enter students last name: 
Gupta
1 Freshmen
2 Sophomore
3 Junior
4 Senior
Enter students grad year: 
1
Enter course to enroll (Q to Quit): Maths 101
Enter course to enroll (Q to Quit): English 101
Enter course to enroll (Q to Quit): Q
Your Balance is: 1200
Enter your payment: $ 40
Thank You for Payment of $ 40
Your Balance is: 1160
Name: Riya Gupta
GradYear: 1
student ID: 1 1001
Courses Enrolled: null
 Maths 101
 English 101
Balance: $1160
Enter students first name: 
Akarsh
Enter students last name: 
Gupta
1 Freshmen
2 Sophomore
3 Junior
4 Senior
Enter students grad year: 
3
Enter course to enroll (Q to Quit): Chemistry 101
Enter course to enroll (Q to Quit): History 101
Enter course to enroll (Q to Quit): Q
Your Balance is: 1200
Enter your payment: $ 50
Thank You for Payment of $ 50
Your Balance is: 1150
Name: Akarsh Gupta
GradYear: 3
student ID: 3 1002
Courses Enrolled: null
 Chemistry 101
 History 101
Balance: $1150


```
