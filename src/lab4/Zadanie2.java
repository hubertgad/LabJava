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
		for (int i = 0; i < tablica.length; i++)
		{
			for (int j = 0; j < tablica[i].length; j++)
			{
				tablica[i][j] = Math.abs(rand.nextInt()%10);
				if (j == 0)
					min[i] = tablica[i][j];
				else if (tablica[i][j] < min[i])
					min[i] = tablica[i][j];
				if (j == 0)
					max[i] = tablica[i][j];
				else if (tablica[i][j] > max[i])
					max[i] = tablica[i][j];
			}
		}
		out.println("Tablica: ");
		for (int i = 0; i < tablica.length; i++)
		{
			for (int j = 0; j < tablica[i].length; j++)
			{
				out.print(tablica[j][i] + " ");
			}
			out.println();
		}
		out.println("Minimum: ");
		for (int i = 0; i < min.length; i++)
		{
			out.print(min[i] + " ");
		}
		out.println();
		out.println("Maksimum: ");
		for (int i = 0; i < max.length; i++)
		{
			out.print(max[i] + " ");
		}
	}
}
