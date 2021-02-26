
import java.util.Scanner;
public class MonthlyMoney{
	public static void main (String[] args)
	{
		Scanner myMoney = new Scanner(System.in);
		Double SavedMoney = 100.0;
//1		
				System.out.println("Enter Money received");
				Double Income = myMoney.nextDouble();

				SavedMoney += Income;
				System.out.println("Your current money is " + SavedMoney);
				System.out.println("-");

//Loop of "//1"
		for (int i = 2; i < 20; i++){
			System.out.println("Enter Money received");
				Income = myMoney.nextDouble();

				SavedMoney += Income;
				System.out.println("Your current money is " + SavedMoney);
				System.out.println("-");
		}						

		

		
	}
	

					

	
}