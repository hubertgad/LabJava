package lab4;
import java.util.Arrays;

import static java.lang.System.arraycopy;
import static java.lang.System.out;
public class Zadanie1 
{
	public static void main(String[] args) 
	{
		int[]	tab1 = new int[52],
				tab2 = new int[tab1.length];
		for (int i = 0; i < tab1.length; i++) 
			tab1[i]  = i + 99;
		arraycopy(tab1, 0, tab2, 0, tab1.length);
		out.println("Tablica 1: " + Arrays.toString(tab1));
		out.println("Tablica 2: " + Arrays.toString(tab2));
	}
}