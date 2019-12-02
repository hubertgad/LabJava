package lab4;
import java.util.Random;
import static java.lang.System.*;
public class Zadanie8
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[][] tablica1 = new int[12][12],
                tablica2 = new int[12][12];
        for (int w = 0; w < tablica1.length; w++)
        {
            for (int k = 0; k < tablica1[w].length; k++)
            {
                if (w == 0)
                {
                    tablica1[k][w] = k;
                }
                else if (k == 0)
                {
                    tablica1[k][w] = w;
                }
                else if (k == w)
                {
                    tablica1[k][w] = k;
                }
                else
                {
                    tablica1[k][w] = rand.nextInt() % 100;
                }
            }
        }
        for (int w = 0; w < tablica2.length; w++)
        {
            for (int k = 0; k < tablica2[w].length; k++)
            {
                tablica2[k][w] = rand.nextInt() % 100;
            }
        }
        Macierz macierz1 = new Macierz(tablica1);
        Macierz macierz2 = new Macierz(tablica2);
        Macierz macierz3 = new Macierz(macierz1.dodajMacierz(macierz2));
        out.println(macierz1.toString());
        out.println("\n                                   + \n");
        out.println(macierz2.toString());
        out.println("\n                                   = \n");
        out.println(macierz3.toString());
    }
}