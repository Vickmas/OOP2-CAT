package QuestionThree;
public class Exam extends Student 
{
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;

   // Constructor to initialize the Student properties
   // Constructor to also add math, science and English marks properties to the Student properties
    public Exam(String studentName, String course, String department, double mathMarks, double scienceMarks, double englishMarks)
    {
        super(studentName, course, department);
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }
    
    // The Getters and setters for the added properties in the Student's property
    public double getMathMarks() 
    {   return mathMarks; }

    public void setMathMarks(double mathMarks) 
    {   this.mathMarks = mathMarks; }

    public double getScienceMarks() 
    {   return scienceMarks; }

    public void setScienceMarks(double scienceMarks) 
    {   this.scienceMarks = scienceMarks; }

    public double getEnglishMarks() 
    {   return englishMarks; }

    public void setEnglishMarks(double englishMarks) 
    {   this.englishMarks = englishMarks; }

    // Method to Calculate the Total Marks of the Subjects
    public double calculateTotalMarks() 
    {   return mathMarks + scienceMarks + englishMarks; }

    // Method to Calculate the Average Marks of the Subjects
    public double calculateAverageMarks() 
    {   return calculateTotalMarks() / 3; }

    public static void main(String[] args) 
    {
        // Creation of an instance of the Exam class
        Exam myExam = new Exam("Victor Maina", "Computer Science", "Computing and IT", 87.5, 98.0, 82.0);

        // Accessing and displaying the student's information from the inherited Student class
        System.out.println("Student Name: " + myExam.getStudentName());
        System.out.println("Course: " + myExam.getCourse());
        System.out.println("Department: " + myExam.getDepartment());

        // Accessing and displaying the exam marks
        System.out.println("Math Marks: " + myExam.getMathMarks());
        System.out.println("Science Marks: " + myExam.getScienceMarks());
        System.out.println("English Marks: " + myExam.getEnglishMarks());

        // Calculating and displaying total and average marks
        System.out.println("Total Marks: " + myExam.calculateTotalMarks());
        System.out.println("Average Marks: " + myExam.calculateAverageMarks());
    }
}