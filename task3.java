package j;
import java.util.Scanner;

public class task3 {
	

	 public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("ENTER first number: ");
	        double x = input.nextDouble();
	        System.out.print("ENTER second number: ");
	        double y = input.nextDouble();
	        System.out.print("ENTER third number: ");
	        double z = input.nextDouble();
	        System.out.print("The average  is " + average(x, y, z)+"\n" );
	    }

	  public static double average(double x, double y, double z)
	    {
	        return (x + y + z) / 3;
	    }
}

