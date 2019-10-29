// Zrealizuj kod, który dla zadanej liczby całkowitej wyświetla jej wszystkie dzielniki.
package lab3;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class Zadanie2 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Podaj liczbe, ktorej dzielniki chcesz wyznaczyc: ");
		int podanaLiczba = 0;
		boolean wystapilWyjatek = true;
		do
		{
			try
			{
				podanaLiczba = keyboard.nextInt();
				wystapilWyjatek = false;
			}
			catch (InputMismatchException IME)
			{
				System.out.println("Blad. Uzyto niedoswolonych znakow, co wywolalo wyjatek InputMismatchException.\n" +
						   "W podanym wyrazeniu mozesz uzywac tylko znakow z zakresu 0 - 9.");
				System.out.println("Podaj liczbe calkowita: ");
				keyboard.nextLine();
			}
			catch (NoSuchElementException NSE)
			{
				System.out.println("Blad. Podaj liczbe calkowita: ");
				keyboard.nextLine();
			}
		}
		while (wystapilWyjatek == true);
		Vector<Integer> tablicaDzielnikow = new Vector<Integer>();
		wyznaczDzielniki(podanaLiczba, tablicaDzielnikow);
		System.out.println("Oto lista dzielnikow podanej liczby: \n"+ tablicaDzielnikow);
		keyboard.close();
	}
	public static void wyznaczDzielniki(int liczba, Vector<Integer> tablicaDzielnikow)
	{
		for (int i = 1; i * i <= Math.abs(liczba); i++)
		{
			if (liczba %i == 0)
				tablicaDzielnikow.add(i);
		}
	}
}
/*
 * TO-DO: dodać opisy błędów
 */ 
