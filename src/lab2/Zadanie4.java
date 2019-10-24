//	Wczytaj kilka (x) liczb i wyznacz wartoœci min, max, œredni¹ oraz iloœæ podanych liczb.


package lab2;
import java.util.Scanner;

public class Zadanie4 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ile liczb zamierzasz wprowadzic? ");
		int x = keyboard.nextInt();
		int[] tab = new int[x];
		double min = 0, max = 0, sum = 0;
		for (int i = 0; i < x; i++)
		{
			System.out.println("Podaj " + (i + 1) + " liczbê: ");
			tab[i] = keyboard.nextInt();
			if (i == 0) 
				min = max = tab[i];
			if (tab[i] < min) 
				min = tab[i];
			else if (tab[i] > max)
				max = tab[i];
			sum += tab[i];
		}
		double mean = sum / x;
		System.out.println("\nmin = "+min);
		System.out.println("max = "+max);
		System.out.println("srednia = "+mean);
		System.out.println("ilosc liczb = "+x);
		
		keyboard.close();
	}
}
