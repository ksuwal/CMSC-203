import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title,rating;
		int soldTickets;
		char choice;
		Scanner input = new Scanner (System.in);
		Movie movie = new Movie();
		
		do {
			System.out.println("Enter the name of a movie: ");
			title=input.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the movie's rating: ");
			rating=input.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold: ");
			soldTickets=input.nextInt();
			movie.setSoldTickets(soldTickets);
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another movie? y/n");
			choice= input.next().charAt(0);
			input.nextLine();
			}while(choice=='y');
		
		System.out.println("Thank you\n"+"Have a wonderful day ahead!!");
		input.close();
	}
}
