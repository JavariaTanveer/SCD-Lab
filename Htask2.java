package j;

import java.util.Scanner;

public class Htask2{
	
	    public static void main(String[] args) {
	        char c;
	        Scanner scanner;
	        scanner = new Scanner(System.in);
	 
	        System.out.println("Enter an Alphabet to check whether it is vowel or consonant");
	        c = scanner.next().charAt(0);
	 
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
	        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
	            System.out.println(c + " is Vowel");
	        } else {
	            System.out.println(c + " is Consonant");
	        }
	    }
}
