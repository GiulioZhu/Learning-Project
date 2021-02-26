import java.util.*;
import java.lang.*;
public class RandomGame {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int x = 0
		int y = 100

		int randomNumber = (int) Math.random();
		randomNumber *= 100;
		System.out.println("Enter a Integer (eg: 1, 5, 10...)");
		int enteredNumber = rd.nextInt();

		while (enteredNumber != randomNumber) {
			while (enteredNumber != randomNumber) {
			if (enteredNumber < randomNumber) {
				System.out.println("Your number is less than the Random Number, enter again"); 
				break;
			} else if (enteredNumber > randomNumber) {
				System.out.println("Your number is less than the Random Number, enter again");
				break;
			} else if (enteredNumber == randomNumber) {
				System.out.println("Correct! Your Won.");
				break;
			} 
		}
		enteredNumber = rd.nextInt();
		}
		

		

	}
}