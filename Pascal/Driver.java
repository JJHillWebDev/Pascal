import java.util.*;

public class Driver
{
    public static void main(String args[]) 
    { 
    	Scanner keyboard = new Scanner(System.in);
    	System.out.print("Choose the size of your Pascal Triangle: ");
    	int in = keyboard.nextInt();
    	PascalTriangle pasc = new PascalTriangle();
    	pasc.pascal(in); 
    }
}

