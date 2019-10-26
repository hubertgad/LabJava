// Napisz program realizuj�cy funkcje kalkulatora, z uwzgl�dnieniem, ograniczenia dzielenia przez 0.

package lab2;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Zadanie5 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String wyrazenie = "NULL";
		String[] argumentyStringTabl = new String[2];
		int wynik = 0,
			argumentyIntTabl[] = new int [2];
		boolean[] wyjatek = new boolean[1];
		wyjatek[0] = false;
		System.out.print("Witaj we wspanialym kalkulatorze. Podaj wyra�enie w formacie: \"liczba1 [znak] liczba2\" na przyk�ad: 2 + 2.\n"
				+ "Obs�ugiwane dzia�ania: +, -, *, /, %.\n");
		while (!wyrazenie.equals("koniec"))
		{
			do
			{
				System.out.println("Podaj wyra�enie do obliczenia: ");
				wyrazenie = keyboard.next();
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
						System.out.print("Podano nieobs�ugiwany format wyra�enia. ");
					}
					System.out.println("Wynik: "+wynik);
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
			}
			while (wyjatek[0] == true);
		}
		keyboard.close();
	}
	static void bladSkladni(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("B�ad sk�adni. Wprowad� dane ponownie.");
	}
	static void dzieleniePrzezZero(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("Omg, nie dziel przez zero...");
	}
	static void NullPointerException(boolean[] wyjatek)
	{
		wyjatek[0] = false;
		System.out.println("Nie podano �adnej warto�ci. Wprowad� dane.");		
	}
	static void zamaniaNaInt(int[] argumentyIntTabl, String[] argumentyStringTabl)
	{
		argumentyIntTabl[0] = Integer.parseInt(argumentyStringTabl[0]);
		argumentyIntTabl[1] = Integer.parseInt(argumentyStringTabl[1]);
		
	}
}
