package HOMEWORK;

import java.util.Scanner;

public class School extends Student {
    private String[] registeredCourses;


    //creating a constructor
    public School(int rollNo, String firstName, String lastName, String grade, String course, int noOfStudents) {
        super(rollNo, firstName, lastName, grade, course, noOfStudents);
        Student student=new Student();
        this.registeredCourses = new String[10];
    }
    Scanner scanner =new Scanner(System.in);
    public void registerCourse(   )

    {
        System.out.print("Enter course to register: ");
        String course = scanner.nextLine();

        for (int i = 0; i < registeredCourses.length; i++) {
            if (registeredCourses[i] == null) {
                registeredCourses[i] = course;
                System.out.println("Course registered successfully!");
                break;

            }
        }

    }


    public void dropCourse(   )

    {
        System.out.print("Enter course to drop: ");
        String course = scanner.nextLine();

        for (int i = 0; i < registeredCourses.length; i++) {
            if (course.equals(registeredCourses[i])) {
                //The equals method in Java is used to compare two objects for equality.
                // Checks if the current course matches the course to be dropped
                registeredCourses[i] = null;
                System.out.println("Course dropped successfully!");
                return;
            }
        }
        System.out.println("Course not found in registered courses.");
    }

    public void displayRegisteredCourses() {

        for (int i = 0; i < registeredCourses.length; i++) {
            String course = registeredCourses[i];

            if (course != null) {


                System.out.println(course);


            }

        }
    }
}
