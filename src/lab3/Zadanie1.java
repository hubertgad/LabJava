package lab3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner 
			keyboard = new Scanner(System.in);
		List<Integer> 
			lista1 = new ArrayList<Integer>(),
			listaNieparzyste = new ArrayList<Integer>(),
			listaParzyste = new ArrayList<Integer>();
		int 
			podanaLiczba = 0,
			pierwotnaLiczba = 0;
		double
			sumaParzyste = 0,
			sumaNieparzyste = 0,
			sredniaParzyste = 0,
			sredniaNieparzyste = 0,
			stosunekNieparzysteParzyste = 0;
		System.out.println("Dodaj element do listy element z zakresu 0 do 9. Aby przerwac dodawanie wpisz \"10\".");
		while (podanaLiczba != 10) 
		{
			podanaLiczba = keyboard.nextInt();
			if ((podanaLiczba >= 0) & (podanaLiczba <= 9))
				lista1.add(podanaLiczba);
			else if (podanaLiczba == 10)
				;
			else
				System.out.println("Podano liczbe spoza zakresu. Nie dodano do listy!");
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
			pierwotnaLiczba *= 10;
			pierwotnaLiczba += element;
		}
		sredniaParzyste = sumaParzyste / listaNieparzyste.size();
		sredniaNieparzyste = sumaNieparzyste / listaParzyste.size();
		stosunekNieparzysteParzyste = sredniaNieparzyste / sredniaParzyste;
		System.out.println("Lista 1: " + lista1);
		System.out.println("Nieparzyste: " + listaNieparzyste);
		System.out.println("Parzyste: " + listaParzyste);
//		System.out.println("L2 srednia: " + sredniaParzyste);
//		System.out.println("L3 srednia: " + sredniaNieparzyste);
		System.out.println("Stosunek srednia parzystych / srednia nieparzystych: " + stosunekNieparzysteParzyste);
//		System.out.println("pierwotnaLiczba = " + pierwotnaLiczba);
		System.out.println("Czy wprowadzona liczba jest liczba pierwsza? " + czyLiczbaJestPierwsza(pierwotnaLiczba));
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