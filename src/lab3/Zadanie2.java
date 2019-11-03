// Zrealizuj kod, ktory dla zadanej liczby calkowitej wyswietla jej wszystkie dzielniki.
package lab3;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class Zadanie2 
{
	public static void main(String[] args)
	{
		System.out.println("Podaj liczbe, ktorej dzielniki chcesz wyznaczyc: ");
		int podanaLiczba = 0;
		boolean wystapilWyjatek = true;
		do
		{
			try (Scanner keyboard = new Scanner(System.in))
			{
				try
				{
					podanaLiczba = keyboard.nextInt();
					wystapilWyjatek = false;
				}
				catch (InputMismatchException IME)
				{
					System.out.println("Blad. W wyrazeniu mozesz uzywac tylko znakow z zakresu 0 - 9.\n"
						+ "Podaj liczbe calkowita: ");
					keyboard.nextLine();
				}
			}
		}
		while (wystapilWyjatek == true);
		Vector<Integer> tablicaDzielnikow = new Vector<Integer>();
		wyznaczDzielniki(podanaLiczba, tablicaDzielnikow);
		System.out.println("Oto lista dzielnikow podanej liczby: \n"+ tablicaDzielnikow);
	}
	public static void wyznaczDzielniki(int liczba, Vector<Integer> tablicaDzielnikow)
	{
		for (int i = 1; i <= Math.abs(liczba) / 2; i++)
		{
			if (liczba %i == 0)
				tablicaDzielnikow.add(i);
		}
		tablicaDzielnikow.add(liczba);
	}
}