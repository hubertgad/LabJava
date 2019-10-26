// Napisz program realizuj�cy funkcje kalkulatora, z uwzgl�dnieniem, ograniczenia dzielenia przez 0.

package lab2;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Zadanie5 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String wyrazenie = "NULL";
		int[] argumentyIntTabl = new int [2];
		int wynik = 0;
		boolean[] wyjatek = new boolean[1];
		wyjatek[0] = false;
		System.out.print("Witaj we wspanialym kalkulatorze. Podaj wyra�enie w formacie: \"liczba1 [znak] liczba2\" na przyk�ad: 2 + 2.\n"
				+ "Obs�ugiwane dzia�ania: +, -, *, /, %. \t\t //Aby zakonczyc wpisz \"koniec\"\n\n");
		System.out.println("Podaj wyra�enie do obliczenia: ");
		wyrazenie = keyboard.next();
		while (!wyrazenie.equals("koniec"))
		{
			do
			{
				try
				{
					if (wyrazenie.contains("*"))
					{
							zamaniaNaInt(argumentyIntTabl, wyrazenie.split("[*]", 2));
							wynik = argumentyIntTabl[0] * argumentyIntTabl[1];
					}
					else if (wyrazenie.contains("/"))
					{
							zamaniaNaInt(argumentyIntTabl, wyrazenie.split("[/]", 2));
							wynik = argumentyIntTabl[0] / argumentyIntTabl[1];
							}
					else if (wyrazenie.contains("%"))
					{		zamaniaNaInt(argumentyIntTabl, wyrazenie.split("[%]", 2));
							wynik = argumentyIntTabl[0] % argumentyIntTabl[1];
					}
					else if (wyrazenie.contains("+"))
					{
							zamaniaNaInt(argumentyIntTabl, wyrazenie.split("[+]", 2));
							wynik = argumentyIntTabl[0] + argumentyIntTabl[1];
					}
					else if (wyrazenie.contains("-"))
					{
							zamaniaNaInt(argumentyIntTabl, wyrazenie.split("[-]", 2));
							wynik = argumentyIntTabl[0] - argumentyIntTabl[1];
					}
					else
					{
						System.out.print("Podano nieobs�ugiwany format wyra�enia.\n");
					}
					System.out.println("Wynik: " + wynik + "\n");
				}
				catch (NullPointerException containsnpe)
				{
					NullPointerException(wyjatek);
				}
				catch (ArithmeticException AE)
				{
					dzieleniePrzezZero(wyjatek);
				}
				catch (PatternSyntaxException split)
				{
					bladSkladni(wyjatek);
				}
				catch (NumberFormatException NFE)
				{
					bladSkladni(wyjatek);
				}
				System.out.println("Podaj wyra�enie do obliczenia: ");
				wyrazenie = keyboard.next();
			}
			while (wyjatek[0] == true);
		}
		keyboard.close();
	}
	static void bladSkladni(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("B�ad sk�adni. Wprowad� dane ponownie.\n");
	}
	static void dzieleniePrzezZero(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("Omg, nie dziel przez zero...\n");
	}
	static void NullPointerException(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("Nie podano �adnej warto�ci. Wprowad� dane.\n");		
	}
	static void zamaniaNaInt(int[] argumentyIntTabl, String[] argumentyStringTabl)
	{
		argumentyIntTabl[0] = Integer.parseInt(argumentyStringTabl[0]);
		argumentyIntTabl[1] = Integer.parseInt(argumentyStringTabl[1]);
	}
}