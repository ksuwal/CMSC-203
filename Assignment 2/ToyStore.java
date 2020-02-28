import javax.swing.JOptionPane;
import java.util.Random;
import _solution.Toy;
import java.text.DecimalFormat;


public class ToyStore {
	public static void main(String[] args) {
		
		Toy toy=new Toy();
		Random randomNumbers = new Random();
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		
		String name, age,nextTry,tryAgain;
		double totalCost=0;
		
		JOptionPane.showMessageDialog(null, "Welcome to Automated Toy Selector");
		
		do {
			do {
				
				nextTry="no";
				name = JOptionPane.showInputDialog("Enter The child's name.");
				age =  JOptionPane.showInputDialog("Enter The child's age.");
				toy.setAge(Integer.parseInt(age));
				toy.setToy(JOptionPane.showInputDialog("Choose a toy: Plushie, Block, Book"));
				toy.setCost(toy.getToy());
				if(toy.ageOK()==false) {
					nextTry=JOptionPane.showInputDialog("The toy you chose is not age appropriate.\n Would you like to try again? (yes/no)");
				}
			}while(nextTry.equalsIgnoreCase("yes"));
			
			
			
		toy.addCard(JOptionPane.showInputDialog("Do you want to add a card? (yes/no)"));
		toy.addBalloon(JOptionPane.showInputDialog("Do you want to add a baloon? (yes/no)"));
		
		System.out.println("The gift for "+name+toy.toString());
		
		totalCost+=toy.getCost();
		
		tryAgain= JOptionPane.showInputDialog("Do you want another toy? (yes/no)");
		}while(tryAgain.equalsIgnoreCase("yes"));
		
		
		System.out.println("The total cost of your order is $"+dollar.format(totalCost)+" Order number is "+randomNumbers.nextInt(100000));
		System.out.println("Programmer Name: Kabindra Raj Suwal\nHave a wonderful day ahead.");
	}

}
