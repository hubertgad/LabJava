package lab4;
import static java.lang.System.*;
public class Zadanie3 
{
	public static void main(String[] args) 
	{
		boolean[] tablica = new boolean[40];
		for(int i = 0; i < tablica.length; i++) {
			tablica[i] = (i % 2 == 0) ? false : true;
			out.println("Element[" + i + "]: " + tablica[i]);
		}
	}
}