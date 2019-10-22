package lab2;
import java.lang.Math.*;
import java.util.Scanner;

public class Zadanie2 {

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Podaj a:");
		double a = keyboard.nextInt();
		System.out.println("Podaj b:");
		double b = keyboard.nextInt();
		System.out.println("Podaj c:");
		double c = keyboard.nextInt();
		double delta = (b * b) - (4 * a * c);
		System.out.println("\nDelta = " + delta);
		if (delta > 0.0)
			{
				double x1 = (- b - (Math.sqrt(delta))) / (2 * a);
				double x2 = (- b + (Math.sqrt(delta))) / (2 * a);
				System.out.println("\nx1 = " + x1);
				System.out.println("\nx2 = " + x2);
			}
		else if (delta == 0.0)
			{
				double x = (- b - (Math.sqrt(delta))) / (2 * a);
				System.out.println("\nx = " + x);
			}
		else if (delta < 0.0)
			System.out.println("Brak rozwiazan w zbiorze liczb rzeczywistych.");
		keyboard.close();
	}
}