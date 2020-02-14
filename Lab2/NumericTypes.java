/**
This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		double score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double fahrenheit;
		
		System.out.print("Enter score 1: ");
		score1 = userInput.nextInt();
		System.out.print("Enter score 2: ");
		score2 = userInput.nextInt();
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output + "\n");
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = (BOILING_IN_F-32)*5/9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.print("Enter Temperature in fahrenheit: ");
		fahrenheit = userInput.nextDouble();
		fToC = (fahrenheit-32)*5/9;
		output = fahrenheit + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		userInput.close();
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
