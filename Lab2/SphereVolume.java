import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) {
		
		System.out.println("Java program to calculate the volume of a Sphere\n");
		
		double diam;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the diameter of a sphere: ");
		diam = userInput.nextDouble();
		
		double radius = diam/2;
		
		double volume = Math.PI * Math.pow(radius,3)* 4/3;
		
		System.out.println("Volume= "+volume);
		userInput.close();
		
	}

}
