package QuestionTwo;

public class Cube 
{
    private double length;
    private double height;
    private double width;

    // Constructor to initialize the Cube's Details
    public Cube(double length, double height, double width) 
    {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    
    // Method to Calculate the Volume of the Cube
    public double calculateVolume() 
    {
        return length * height * width;
    }

    public static void main(String[] args) 
    {
        // Creation of an instance of the Cube class with length 20cm, height 15cm, and width 10cm
        Cube myCube = new Cube(20, 15, 10);

        // Calculation of the volume of the cube using the calculateVolume method
        double volume = myCube.calculateVolume();

        // Displaying the result
        System.out.println("The Volume of the cube is: " + volume + " cubic cm");
    }
}