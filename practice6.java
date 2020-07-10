package week4Practice;
import java.util.Scanner;
public class practice6 {

	public static void main(String[] args) {

		
		double h;
		double w;
		double l;
		Scanner input = new Scanner(System.in);
			System.out.print("Room length: ");
			l = input.nextDouble();
			System.out.print(" Room width: ");
			w = input.nextDouble();
			System.out.print("Room height: ");
			h = input.nextDouble();
			
			System.out.printf("User entered dimensions:\n\tLength: %.1f\n\t Width: %.1f\n\tHeight: %.1f\n",l,w,h);
		
			
			double cost = calcCost(l,w,h);
			System.out.printf("\nCost to paint a 25 by 20 foot room with 12 foot ceilings is $%,.2f.",cost);
	}

			private static double calcCost(double l, double w, double h) {
				double galCost = 32;
				double wallArea = ((2*l*h)+(2*w*h));
				System.out.printf("Wall Area: %,.2f",wallArea);
				double gallons = numGal(wallArea);
				double roomCost = (gallons*galCost);
				return roomCost;
			}

			private static double numGal(double wallArea) {
				double sqftPaint = 350;
				double gallons = (wallArea / sqftPaint);
				System.out.printf("\nNumber of gallons needed: %.0f (Round up to the nearest gallon)", gallons);
				return (gallons);
			}
		
}
