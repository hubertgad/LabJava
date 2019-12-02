package lab4;
import java.util.Random;
import static java.lang.System.*;
public class Zadanie9a
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[][] tablica = new int[12][12];
       for (int w = 0; w < tablica.length; w++)
       {
           for (int k = 0; k < tablica[w].length; k++)
           {
               tablica[k][w] = rand.nextInt() % 100;
           }
       }
       Macierz macierz = new Macierz(tablica);
       out.println(macierz.toString());
       Macierz macierzBabelkowoPosortowana = new Macierz(macierz.sortujBabelkowo());
       out.println(macierzBabelkowoPosortowana.toString());
    }
}