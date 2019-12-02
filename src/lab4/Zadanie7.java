package lab4;
import java.util.Random;
public class Zadanie7 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int[][] tabWW = new int[12][12];
		Macierz macierz = new Macierz(tabWW);
		for (int w = 0; w < tabWW.length; w++)
		{
			for (int k = 0; k < tabWW[w].length; k++)
			{
				if (w == 0) 
				{
					tabWW[k][w] = k;
				}
				else if (k == 0) 
				{
					tabWW[k][w] = w;
				}
				else if (k == w) 
				{
					tabWW[k][w] = k;
				}
				else
				{
					tabWW[k][w] = rand.nextInt() % 1000;
				}
			}
		}
		System.out.println(macierz.toString());
	}
}