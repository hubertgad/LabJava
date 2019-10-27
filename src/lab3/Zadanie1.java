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
		System.out.println("Dodaj element do listy element z zakresu 0 do 9. Aby przerwać dodawanie wpisz \"10\".");
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
		System.out.println("Lista 2: " + listaNieparzyste);
		System.out.println("Lista 3: " + listaParzyste);
		System.out.println("L2 srednia: " + sredniaParzyste);
		System.out.println("L3 srednia: " + sredniaNieparzyste);
		System.out.println("Stosunek srednich: " + stosunekNieparzysteParzyste);
		System.out.println("pierwotnaLiczba = " + pierwotnaLiczba);
		keyboard.close();
	}
	public static boolean czyLiczbaJestPierwsza(int liczba)
	{
		return false;
	}
}
