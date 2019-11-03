// Opracuj kod realizujacy wczytywanie kolejnych liczb do momentu gdy podana zostanie wartosc 5. Wyswietlic iloczyn podanych liczb.
package lab3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Zadanie4
{
	public static void main(String[] args)
	{
		Vector<Integer> liczby = new Vector<>();
		int wczytanaLiczba = 0,
				iloczyn = 1;
		System.out.println("Podaj liczby, ktorych iloczyn ma byc obliczony. Aby zakonczyc wczytywanie wpisz wartosc '5'.");
		Scanner keyboard = new Scanner(System.in);
		do
		{
			try
			{
				wczytanaLiczba = keyboard.nextInt();
				liczby.add(wczytanaLiczba);
				iloczyn *= wczytanaLiczba;
			}
			catch (InputMismatchException IME)
			{
				System.out.println("Blad. W wyrazeniu mozesz uzywac tylko znakow z zakresu 0 - 9.\n"
					+ "Podaj liczbe calkowita: ");
				keyboard.nextLine();
			}
		}
		while (wczytanaLiczba != 5);
		keyboard.close();
		System.out.println("Iloczyn podanych liczb wynosi " + iloczyn + ".");
	}
}