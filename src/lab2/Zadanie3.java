// Wczytaj kilka (x) liczb i wyznacz wartoœci min, max, œredni¹, oraz iloœæ podanych liczb.

package lab2;
import java.util.Scanner;

public class Zadanie3 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Podaj predkosc w mph: ");
		double mph = keyboard.nextDouble();
		double kmh = mph * 1.61;
		System.out.print("Predkosc w km/h wynosi: "+kmh);
		keyboard.close();
	}
}