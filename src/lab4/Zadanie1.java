package lab4;
import static java.lang.System.*;

public class Zadanie1 
{
	public static void main(String[] args) 
	{
		int[] tablica1 = new int[52];
		int i = 99;
		for (int j = 0; j < tablica1.length; j++)
			tablica1[j]  = i++;
		int[] tablica2 = (int[]) tablica1.clone();
		out.print("Tablica nr 1: [ ");
		for (int element : tablica1)
			out.print(element + " ");
		out.println("]");		
		out.print("Tablica nr 2: [ ");
		for (int element : tablica2)
			out.print(element + " ");
		out.println("]");			
	}
}
