/*	Losujemy liczbe z zakresu od 1 do 200. 
 *	Zadaniem uzytkownika jest podanie wlasciwej wylosowanej liczby. 
 *	Jezeli wczytana liczba jest mniejsza od wylosowanej uzytkownik zostanie o tym poinformowany, 
 *	tak samo jak w przypadku podania wartosci wyzszej. 
 *	W przypadku odgadniecia wartosci wylosowanej liczby uzytkownik otrzyma odpowiedni komunikat.
 */
package lab3;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3
{
	public static void main(String[] args)
	{
		int i = 0,
			liczba = 0;
		String output;
		Random generator = new Random();
		i = Math.abs(generator.nextInt() % 200);
		System.out.println("Wylosowalem dla Ciebie pewna liczbe z zakresu 1 - 200. \nOdgadnij jaka:");
		try (Scanner keyboard = new Scanner(System.in))
		{		
			while (i != 5)
			{
				try
				{
					liczba = keyboard.nextInt();
					if (liczba > 200 || liczba < 1)
						throw new InputMismatchException();
					output = (liczba == i) ? "Zgadles." : 
						(liczba > i) ? "Troche za duzo." : "Troche za malo.";
					System.out.println(output);
				}
				catch (InputMismatchException IME)
				{
					System.out.println("Podano nieprawid³ow¹ liczbê... \nPodaj liczbe z zakresu 1 - 200: ");
					keyboard.nextLine();
				}
			}
		}
	}
}