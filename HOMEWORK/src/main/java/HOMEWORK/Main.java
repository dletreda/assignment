package HOMEWORK;
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);

        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Grade: ");
        String grade = scanner.nextLine();

        System.out.print("Number of Subjects: ");
        int noOfSubjects = scanner.nextInt();


        Student student = new Student(rollNo, firstName, lastName, grade, "", noOfSubjects);
        School school = new School(rollNo, firstName, lastName, grade, "", noOfSubjects);

        String[] registeredCourses = new String[10];

boolean exit=false;
while(!exit){
//so that it can hava a loop until the user enter 4

        System.out.println("1. Register Course");
        System.out.println("2. Drop Course");
        System.out.println("3. Display Registered Courses");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
           school.registerCourse( );
        } else if (choice == 2) {
           school.dropCourse( );
        } else if (choice == 3) {
           school.displayRegisteredCourses();
        } else if (choice == 4) {
            exit=true;
            System.out.println("you have exited");

        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

    }
        }

   }