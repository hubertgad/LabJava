/*	Losujemy liczbę z zakresu od 1 do 200. 
 *	Zadaniem użytkownika jest podanie właściwej wylosowanej liczby. 
 *	Jeżeli wczytana liczba jest mniejsza od wylosowanej użytkownik zostanie o tym poinformowany, 
 *	tak samo jak w przypadku podania wartości wyższej. 
 *	W przypadku odgadnięcia wartości wylosowanej liczby użytkownik otrzyma odpowiedni komunikat.
 */
package lab3;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3
{
	public static void main(String[] args)
	{
		int i = 0;
		Random generator = new Random();
		i = (generator.nextInt() % 200);
		System.out.println("Wylosowalem dla Ciebie pewna liczbe. \nOdgadnij jaka:");
		int liczba = 0;
		do
		{
			try (Scanner keyboard = new Scanner(System.in))
			{
				liczba = keyboard.nextInt();
				String output = (liczba == i) ? "Zgadles." : 
					(liczba > i) ? "Troche za duzo." : "Troche za malo."; 
				System.out.println(output);
			}
		}
		while (liczba != i);		
	}
}
