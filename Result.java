package QuestionThree;

public class Result extends Student 
{
    public Result(String studentName, String course, String department) 
    {
		super(studentName, course, department);
		// TODO Auto-generated constructor stub
	}


    public static void main(String[] args) 
    {
        // Creating an instance of the Exam class
        Exam myExam = new Exam("Victor Maina", "Computer Science", "Computing", 87.5, 98.0, 82.0);

        // Calculating and displaying total and average marks
        double totalMarks = myExam.calculateTotalMarks();
        double averageMarks = myExam.calculateAverageMarks();

        // Displaying the calculated marks
        //System.out.println("Student Name: " + myExam.getStudentName());
        //System.out.println("Course: " + myExam.getCourse());
        //System.out.println("Department: " + myExam.getDepartment());
        System.out.println("Math Marks: " + myExam.getMathMarks());
        System.out.println("Science Marks: " + myExam.getScienceMarks());
        System.out.println("English Marks: " + myExam.getEnglishMarks());
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}