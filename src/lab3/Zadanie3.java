/*	Losujemy liczbę z zakresu od 1 do 200. 
 *	Zadaniem użytkownika jest podanie właściwej wylosowanej liczby. 
 *	Jeżeli wczytana liczba jest mniejsza od wylosowanej użytkownik zostanie o tym poinformowany, 
 *	tak samo jak w przypadku podania wartości wyższej. 
 *	W przypadku odgadnięcia wartości wylosowanej liczby użytkownik otrzyma odpowiedni komunikat.
 */
package lab3;

public class Zadanie3
{
	public static void main(String[] args)
	{
		int i = 0;
		try (Random generator = new Random)
		{
			i = (generator.nextInt() % 200);
		}		
	}
}
