import  java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		double temp, windSpeed, windChill;
		String programmerName="Kabindra Raj Suwal";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature between -45°F and 40°F inclusively: ");
		temp=input.nextDouble();
		
		System.out.print("Enter wind speed between 5mph and 60mph inclusively: ");
		windSpeed=input.nextDouble();
		
		windChill=35.74 + 0.6215*temp - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temp*Math.pow(windSpeed,0.16);
		
		System.out.println("Wind chill temperature= "+windChill);
		System.out.println("Programmer name: "+programmerName);
		
		input.close();
	}
 
}
