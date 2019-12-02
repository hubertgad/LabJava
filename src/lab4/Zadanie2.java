package lab4;
import java.util.Random;
import static java.lang.System.out;
public class Zadanie2 
{
	public static void main(String[] args) 
	{
		int[][]	tab = new int[7][7];
		int[]	min = new int[7],
				max = new int[7];
		Random rand = new Random();
		for (int w = 0; w < tab.length; w++)
		{	
			for (int k = 0; k < tab[w].length; k++)
			{
				tab[k][w] = Math.abs(rand.nextInt() % 10);
				if (w == 0)
				{
					min[k] = max[k] = tab[k][w];
				}
				else if (tab[k][w] < min[k])
				{
					min[k] = tab[k][w];				
				}
				else if (tab[k][w] > max[k])
				{
					max[k] = tab[k][w];
				}
			}
		}
		Macierz macierz = new Macierz(tab);
		Tablica tabMin = new Tablica(min);
		Tablica tabMax = new Tablica(max);
		out.println(macierz.toString());
		out.println("Minimum: \n" + tabMin.toString());
		out.println("Maksimum: \n" + tabMax.toString());
	}
}