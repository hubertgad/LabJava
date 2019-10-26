// Napisz program realizujπcy funkcje kalkulatora, z uwzglÍdnieniem, ograniczenia dzielenia przez 0.

package lab2;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Zadanie5 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String wyrazenie = "NULL";
		int wynik = 0;
		boolean[] wyjatek = new boolean[1];
		wyjatek[0] = false;
		while (wyrazenie != "koniec")
		{
			do
			{
				System.out.println("Podaj wyraøenie do obliczenia: ");
				wyrazenie = keyboard.next();
				try
				{
					if (wyrazenie.contains("*"))
					{
						try
						{
							String[] czesci = wyrazenie.split("[*]");
							int i = Integer.parseInt(czesci[0]);
							int j = Integer.parseInt(czesci[1]);
							wynik = i * j;
						}
						catch (PatternSyntaxException split)
						{
							bladSkladni(wyjatek);
						}
					}
					else if (wyrazenie.contains("/"))
					{
						try
						{
							String[] czesci = wyrazenie.split("[/]");
							int i = Integer.parseInt(czesci[0]);
							int j = Integer.parseInt(czesci[1]);
							wynik = i / j;
						}
						catch (ArithmeticException AE)
						{
							dzieleniePrzezZero(wyjatek);
						}
						catch (PatternSyntaxException split)
						{
							bladSkladni(wyjatek);
						}
					}
					else if (wyrazenie.contains("%"))
					{
						try
						{
							String[] czesci = wyrazenie.split("[%]");
							int i = Integer.parseInt(czesci[0]);
							int j = Integer.parseInt(czesci[1]);
							wynik = i % j;
						}
						catch (PatternSyntaxException split)
						{
							bladSkladni(wyjatek);
						}
					}
					else if (wyrazenie.contains("+"))
					{
						try
						{
							String[] czesci = wyrazenie.split("[+]");
							int i = Integer.parseInt(czesci[0]);
							int j = Integer.parseInt(czesci[1]);
							wynik = i + j;
						}
						catch (PatternSyntaxException split)
						{
							bladSkladni(wyjatek);
						}
					}
					else if (wyrazenie.contains("-"))
					{
						try
						{
							String[] czesci = wyrazenie.split("[-]");
							int i = Integer.parseInt(czesci[0]);
							int j = Integer.parseInt(czesci[1]);
							wynik = i - j;
						}
						catch (PatternSyntaxException splitpse)
						{
							bladSkladni(wyjatek);
						}
					}
					else
					{
						System.out.print("Podano nieobs≥ugiwany format wyraøenia. ");
					}
				}
				catch (NullPointerException containsnpe)
				{
					NullPointerException(wyjatek);
				}
				System.out.println("Wynik: "+wynik);
			}
			while (wyjatek[0] == true);
		}
		keyboard.close();
	}
	static void bladSkladni(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("B≥ad sk≥adni. Wprowadü dane ponownie.");
	}
	static void dzieleniePrzezZero(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("Omg, nie dziel przez zero...");
	}
	static void NullPointerException(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("Nie podano øadnej wartoúci. Wprowadü dane.");		
	}
	static void oblicz(String[] czesci, char znak)
	{
		if (znak == '*')
			;
		int i = Integer.parseInt(czesci[0]);
		int j = Integer.parseInt(czesci[1]);
		int wynik = i + j;
		System.out.println("Wynik: "+wynik);
	}
}
