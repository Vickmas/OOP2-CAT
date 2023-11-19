package QuestionThree;

public class Student 
{
    private String studentName;
    private String course;
    private String department;

    // Constructor to initialize the Student properties
    public Student(String studentName, String course, String department) 
    {
        this.studentName = studentName;
        this.course = course;
        this.department = department;
    }

    // The Getters and setters for each Student's property
    public String getStudentName() 
    {   return studentName; }

    public void setStudentName(String studentName) 
    {  this.studentName = studentName; }

    public String getCourse() 
    {   return course; }

    public void setCourse(String course) 
    {  this.course = course; }

    public String getDepartment() 
    {   return department; }

    public void setDepartment(String department) 
    {  this.department = department; }

    public static void main(String[] args) 
    {
        // Creation of an instance of the Student's class
        Student myStudent = new Student("Victor Maina", "Computer Science", "Computing & Information Technology");

        // Access and Display of the student's information
        System.out.println("Student Name: " + myStudent.getStudentName());
        System.out.println("Course: " + myStudent.getCourse());
        System.out.println("Department: " + myStudent.getDepartment());
    }
}