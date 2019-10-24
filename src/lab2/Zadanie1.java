// Napisz program, który narysuje choinkê o wysokoœci podanej przez u¿ytkownika np. 5

package lab2;

public class Zadanie1
{
	public static void main(String[] args) 
	{
		int wysokosc = 15;
		for (int i = 0; i < wysokosc+1; i++)
			System.out.print(" ");
		System.out.println("$");
		for (int i = 0; i < wysokosc; i++)
		{
			for (int k = wysokosc; k > i; k--)
				System.out.print(" ");
			System.out.print("$");
			for (int j = 0; j < i+1; j++)
			{				
				System.out.print("*");
				if (j!=i)
				{
					if ((j+1)%3!=0)
						System.out.print(" ");
					else
						System.out.print("$");
				}	
			}		
			System.out.println("$");
		}
		for (int i = 0; i < (wysokosc+1)*2; i++)
			System.out.print("$");
		System.out.println("$");
		for (int i = 0; i < wysokosc+1; i++)
			System.out.print(" ");
		System.out.print("#");
	}
}