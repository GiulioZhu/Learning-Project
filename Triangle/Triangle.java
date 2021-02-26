import java.util.*;
import java.lang.Math;
public class Triangle{
	static Double Perimeter(double a, double b, double c) {
		double perimeter = a + b + c;
		return perimeter;
	}
	static Double HeronFormula(double a, double b, double c) {
		double s = (a + b + c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	static Double Area(double a, double b, double angle) {
		double area = 1/2 * a * b * Math.sin(angle);
		return area;
	}
	static Double LawOfCosine(double a, double b, double angle) {
		double side = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(angle));
		return side;
	}
	static Double SSA(double a, double b, double angleb) {
		double angle = Math.asin(a*Math.sin(angleb)/b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> sides = new ArrayList<Double>();
		List<Double> lowerSides = new ArrayList<Double>();
		System.out.println("Enter number of known sides");
		int numOfSides = sc.nextInt();
		if (numOfSides == 3) {
			for (int i = 0; i < numOfSides; i++) {
			System.out.println("Enter a side");
			double side = sc.nextDouble();
			sides.add(side);
			}
			double max = Math.max(sides.get(0), sides.get(1));
			max = Math.max(max, sides.get(2));
			double min = Math.min(sides.get(0), sides.get(1));
				lowerSides.add(min);
			min = Math.min(min, sides.get(2));
				lowerSides.add(min);
			try {
				if (max - lowerSides.get(0) - lowerSides.get(1) >= 0) {
					double area = HeronFormula(sides.get(0), sides.get(1), sides.get(2));
					System.out.println("Area = " + area);
					double perimeter = Perimeter(sides.get(0), sides.get(1), sides.get(2));
					System.out.println("Perimeter = " + perimeter);
				}
			} catch (Exception e) {
					throw new UnsupportedOperationException("The triangle doesn't exist, retry");
			}
		} else if (numOfSides == 2) {
			for (int i = 0; i < numOfSides; i++) {
				System.out.println("Enter a side");
				double side = sc.nextDouble();
				sides.add(side);
			}
			System.out.println("Enter the angle measure");
			double angle = sc.nextDouble();
			angle = Math.toRadians(angle);
			System.out.println("Is the triangle SAS or SSA (S = side, A = angle), write in capital letters");
			String answer1 = sc.nextLine();
				if (answer1 == "SAS") {
					double unknownSide = LawOfCosine(sides.get(0), sides.get(1), angle);
					double area = Area(sides.get(0), sides.get(1), angle);
					System.out.println("Area = " + area);
					double perimeter = Perimeter(sides.get(0), sides.get(1), unknownSide);
					System.out.println("Perimeter = " + perimeter);
				} else if (answer1 == "SSA") {
					double unknownAngle = SSA(sides.get(0), sides.get(1), angle);
				}
		}
	}
}