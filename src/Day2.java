import java.util.Scanner;

public class Day2 {
	public static void main(String[] args) {
		
		int totalCost;
		
		Scanner scan = new Scanner(System.in);
		double meal_cost = scan.nextDouble();
		double tip_percent = scan.nextDouble();
		double tax_percent = scan.nextDouble();
		scan.close();
		
		tip_percent = (meal_cost * (8/100.0));
		tax_percent = (meal_cost * (20/100.0));
		
		totalCost = (int) (meal_cost + tip_percent + tax_percent);
		
		System.out.println(("The total meal cost is ") + totalCost + (" dollars."));
	}
}
