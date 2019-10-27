// Zrealizuj kod, który dla zadanej liczby ca³kowitej wyœwietla jej wszystkie dzielniki.
package lab3;
import java.util.Scanner;
import java.util.Vector;

public class Zadanie2 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Podaj liczbe, ktorej dzielniki chcesz wyznaczyc: ");
		int podanaLiczba = keyboard.nextInt();
		Vector<Integer> tablicaDzielnikow = new Vector<Integer>();
		wyznaczDzielniki(podanaLiczba, tablicaDzielnikow);
		System.out.println("Oto lista dzielnikow podanej liczby: \n"+ tablicaDzielnikow);
		keyboard.close();
	}
	public static void wyznaczDzielniki(int liczba, Vector<Integer> tablicaDzielnikow)
	{
		for (int i = 1; i * i <= liczba; i++)
		{
			if (liczba %i == 0)
				tablicaDzielnikow.add(i);
		}
	}
}