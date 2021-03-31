import java.util.Random;
public class DieDemo {

	public static void main(String[] args) {
		
		Random random = new Random();
		int totalNumberOfTurns = 10;
		int computerDie;
		int userDie;
		int computerScore = 0;
		int userScore = 0;
		
		for( int turn = 1; turn <= totalNumberOfTurns; turn++ ) {
			computerDie = random.nextInt(6) + 1;
			userDie = random.nextInt(6) + 1;
			
			System.out.println("Roll #" + turn + ":");
			System.out.println("The computer rolled a " + computerDie + " and the user rolled a " + userDie);
			
			if( computerDie > userDie ) {
				computerScore = computerScore + 1;
				System.out.println("The computer won this round!\n");
			} else if( userDie > computerDie ) {
				userScore = userScore + 1;
				System.out.println("The user won this round!\n");
			} else {
				System.out.println("Tie\n");
			}
		}
		
		System.out.println("The user won a grand total of " + userScore + " times");
		System.out.println("The computers won a grand total of " + computerScore + " times\n");
		
		if( computerScore > userScore ) {
			System.out.println("The computer is the grand winner!!!!");
		} else if( userScore > computerScore ) {
			System.out.println("The user is the grand winner!!!!");
		} else if( computerScore == userScore ) {
			System.out.println("Tie");
		}

	}

}
