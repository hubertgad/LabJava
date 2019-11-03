// Po wczytaniu nieujemnej liczby ca³kowitej wyœwietlone zostan¹ 
// wszystkie wartoœci potêgi liczby 3 mniejsze ni¿ wartoœæ wczytana.
package lab3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;
import static java.lang.System.out;

public class Zadanie5
{
	public static void main(String[] args)
	{
		boolean wyjatek = true;
		int wczytanaLiczba = 0,
				potegiTrojki = 1;
		Vector<Integer> tablicaPoteg = new Vector<>();
		out.println("Podaj nieujemna liczbe calkowita: ");
		Scanner keyboard = new Scanner(System.in);
		while (wyjatek == true)
		{
			try 
			{
				wczytanaLiczba = keyboard.nextInt();
				if (wczytanaLiczba < 0)
					throw new InputMismatchException();
				wyjatek = false;
			}
			catch (InputMismatchException IME)
			{
				out.println("Podano liczbe spoza zakresu. Podaj nieujemna liczbe calkowita: ");
				keyboard.nextLine();
			}
		}
		keyboard.close();
		while (potegiTrojki < wczytanaLiczba)
		{
			tablicaPoteg.add(potegiTrojki);
			potegiTrojki *= 3;
		}
		out.println("Oto potegi liczby 3 mniejsze niz podana liczba: \n" + tablicaPoteg);
	}
}