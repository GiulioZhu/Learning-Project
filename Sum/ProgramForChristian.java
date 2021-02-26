import java.util.*;
public class ProgramForChristian{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		double number = 0;
		System.out.println("Dammi un numero. 0 per terminare");
		double nextNumber = sc.nextDouble();
		number += nextNumber;
		while (nextNumber != 0){
			System.out.println("Dammi un numero. 0 per terminare");
			nextNumber = sc.nextDouble();
			number += nextNumber;
		}
		System.out.println("La somma è: " + number);
	}
}