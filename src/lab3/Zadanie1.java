/*	Napisaæ program, który po wczytaniu wartoœci liczby ca³kowitej,
 *	oblicza stosunek œredniej arytmetycznej cyfr nieparzystych do œredniej arytmetycznej cyfr parzystych 
 *	oraz sprawdza, czy podana liczba jest liczb¹ pierwsz¹.
 */
package lab3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 
{
	public static void main(String[] args) 
	{
		Scanner 
			keyboard = new Scanner(System.in);
		List<Integer> 
			tempList = new ArrayList<Integer>(),	
			lista1 = new ArrayList<Integer>(),
			listaNieparzyste = new ArrayList<Integer>(),
			listaParzyste = new ArrayList<Integer>();
		int 
			pierwotnaLiczba = 0;
		double
			sumaParzyste = 0,
			sumaNieparzyste = 0,
			sredniaParzyste = 0,
			sredniaNieparzyste = 0;
		String
			stosunekNieparzysteParzyste = "";
		do
		{
			System.out.print("Podaj liczbe: ");
			pierwotnaLiczba = keyboard.nextInt();
		}
		while (pierwotnaLiczba < 0);
		int temp = pierwotnaLiczba;
		do
		{
			tempList.add(temp%10);
			temp/=10;
		}
		while (temp > 0);
		for (int i = tempList.size() - 1; i >= 0; i--)
		{
			lista1.add(tempList.get(i));
		}
		for (int element : lista1)
		{
			if (element %2 != 0)
				{
				listaNieparzyste.add(element);
				sumaParzyste += element;
				}
			else
				{
				listaParzyste.add(element);
				sumaNieparzyste += element;
				}
		}
		if (listaNieparzyste.size() > 0)
		{
			sredniaParzyste = sumaParzyste / listaNieparzyste.size();
			if (listaParzyste.size() > 0)
				{
					sredniaNieparzyste = sumaNieparzyste / listaParzyste.size();
					stosunekNieparzysteParzyste = Double.toString(sredniaNieparzyste / sredniaParzyste);
				}
			else
				stosunekNieparzysteParzyste = "Wszystkie cyfry s¹ nieparzyste.";
		}
		else if (listaParzyste.size() > 0)
			stosunekNieparzysteParzyste = "Wszystkie cyfry s¹ parzyste.";
		System.out.println("Czy wprowadzona liczba jest liczba pierwsza? " + czyLiczbaJestPierwsza(pierwotnaLiczba));
		System.out.println("Lista 1: " + lista1);
		System.out.println("Nieparzyste: " + listaNieparzyste);
		System.out.println("Parzyste: " + listaParzyste);
		System.out.println("Stosunek srednia nieparzystych / srednia parzystych: " + stosunekNieparzysteParzyste);
		keyboard.close();
	}
	public static boolean czyLiczbaJestPierwsza(int liczba)
	{
		if (liczba < 2)
			return false;
		for (int i = 2; i * i <= liczba ; i++)
			if (liczba %i == 0)
				return false;
		return true;
	}
}