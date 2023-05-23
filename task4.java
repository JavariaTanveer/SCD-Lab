package j;

import java.util.Scanner;

public class task4 {
	
	  public static void main(String args[])
	  {
	    int n, c, f = 1;

	    System.out.println("Enter any no to calculate factorial");
	    Scanner input = new Scanner(System.in);

	    n = input.nextInt();

	    if (n < 0)
	      System.out.println(" number cannot be less than 0");
	    else
	    {
	      for (c = 1; c <= n; c++)
	        f = f*c;
	      System.out.println("Factorial of "+n+" is = "+f);
	    }
	  }
	}

