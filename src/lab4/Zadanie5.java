package lab4;
import java.util.Random;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Zadanie5
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        int[] tablica = new int[40];
        int k = 0;
        for ( ; k < 11; k++)	tablica[k] = abs(rand.nextInt() % 4) + 1;
        for ( ; k < 21; k++)	tablica[k] = abs(rand.nextInt() % 4) + 6;
        for ( ; k < 31; k++)	tablica[k] = abs(rand.nextInt() % 45) + 11;
        for ( ; k < 40; k++)	tablica[k] = abs(rand.nextInt() % 15) + 60;
        out.print("|Indeksy:           |");
        for (int i = 0; i < 40; i++)	{ out.format("%2d|", i); }
        out.println();
        out.print("|Wylosowane liczby: |");
        for (int element : tablica)		{ out.format("%2d|", element); }
    }
}