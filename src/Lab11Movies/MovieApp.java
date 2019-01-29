package Lab11Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MovieApp {

	public static void main(String[] args) {

		List<Movie> movies = new ArrayList<>();
		
		movies.add( new Movie("Little Mermaid", "animated") );
		movies.add( new Movie("The Godfather", "drama") );
		movies.add( new Movie("Halloween", "horror") );
		movies.add( new Movie("Solaris", "scifi") );
		movies.add( new Movie("Fantasia", "animated") );
		movies.add( new Movie("Get Out!", "drama") );
		movies.add( new Movie("An American Werewolf in London", "horror") );
		movies.add( new Movie("The Thing", "scifi") );
		movies.add( new Movie("Ladybird", "drama") );
		movies.add( new Movie("The Day the Earth Stood Still", "scifi") );
		
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies on our list, in four categories: \n animated, drama, horror, and scifi.");
		
		boolean continueCmd = true;
		
		while (continueCmd) {

			String userPrompt1 = "Which category interests you?";
			String userChoice = Validator.getStringMatchingRegex(scnr, userPrompt1, "(animated)|(drama)|(horror)|(scifi)");
			
			for (Movie thisMovie : movies) {
				
				if ( (thisMovie.getCategory() ).equals(userChoice) ) {
				//System.out.println(userChoice);  //I used this to debug when I was getting bad output
				//System.out.println(thisMovie.getCategory());  //for debugging
				
					System.out.println(thisMovie);
				}
			}
			
			String userPrompt2 = "Would you like to continue? Please enter \"yes\" or \"no\".";
			String userDecision = Validator.getStringMatchingRegex(scnr, userPrompt2, "(yes)|(no)");
			
			if (! ( userDecision.contentEquals("yes") ) ) {
				break;
			}
			
		} System.out.println("Thank you for your interest.");

	}
}