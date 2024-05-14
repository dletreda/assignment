package HOMEWORK;

public class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private String grade;
    private String course;
    private int noOfSubjects;

    public Student(int rollNo, String firstName, String lastName, String grade, String course, int noOfStudents) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.course = course;
        this.noOfSubjects = noOfStudents;
    }
 public Student(){

 }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNoOfStudents() {

        return noOfSubjects;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfSubjects = noOfStudents;
    }
}
