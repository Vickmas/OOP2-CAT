package QuestionOne;

public class Integer 
{
    private int val; 
    // Data member named "val"

    // Member method named input for setting the value of "val" to 300
    public void input() 
    {
        val = 300;
    }

    // Member method named display for outputting the value of "val"
    public void display() 
    {
        System.out.println("The value of val is: " + val);
    }

    public static void main(String[] args) 
    {
        // Creating an instance of the Integer class
        Integer myInteger = new Integer();

        // Setting the value of "val" using the input method
        myInteger.input();

        // Displaying the value of "val" using the display method
        myInteger.display();
    }
}