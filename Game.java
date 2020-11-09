import java.util.*;

public class Game {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int guessNum = r.nextInt(99) + 1;
		System.out.print("Enter a number from 1 to 99: ");
		int guess = input.nextInt();
		while(true) {
			if(guess < guessNum) {
				System.out.println("Guess is low!");
				System.out.print("Enter a number from 1 to 99: ");
				guess = input.nextInt();
			}else if(guess > guessNum) {
				System.out.println("Guess is high!");
				System.out.print("Enter a number from 1 to 99: ");
				guess = input.nextInt();
			}
			if(guess == guessNum){
				System.out.println("You guessed it!");
				break;
			}
		}
		
	}

}
