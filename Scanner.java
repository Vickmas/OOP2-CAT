package QuestionOne;
//Use of Scanner Class
import java.util.Scanner;

public class NumberThree 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first floating-point value: ");
        float value1 = scanner.nextFloat();
        //Input of the First Floating Value

        System.out.println("Enter the second floating-point value: ");
        float value2 = scanner.nextFloat();
        //Input of the Second Floating Value

        float product = value1 * value2;
        //Description of The Product

        System.out.println("The product is: " + product);
        //Display of the Product

        scanner.close();
    }
}