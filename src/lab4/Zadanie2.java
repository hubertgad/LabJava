package lab4;
import static java.lang.System.*;
import java.util.Random;

public class Zadanie2 
{
	public static void main(String[] args) 
	{
		int[][] tablica = new int[7][7];
		int[] min = new int[7],
				max = new int[7];
		Random rand = new Random();
		for (int k = 0; k < tablica.length; k++)
		{
			for (int w = 0; w < tablica[k].length; w++)
			{
				tablica[k][w] = Math.abs(rand.nextInt()%10);
				if (w == 0)
					min[k] = tablica[k][w];
				else if (tablica[k][w] < min[k])
					min[k] = tablica[k][w];
				if (w == 0)
					max[k] = tablica[k][w];
				else if (tablica[k][w] > max[k])
					max[k] = tablica[k][w];
			}
		}
		out.println("Tablica: ");
		for (int w = 0; w < tablica.length; w++)
		{
			for (int k = 0; k < tablica[w].length; k++)
			{
				out.print(tablica[k][w] + " ");
			}
			out.println();
		}
		out.println("Minimum: ");
		for (int k = 0; k < min.length; k++)
		{
			out.print(min[k] + " ");
		}
		out.println();
		out.println("Maksimum: ");
		for (int k = 0; k < max.length; k++)
		{
			out.print(max[k] + " ");
		}
	}
}
