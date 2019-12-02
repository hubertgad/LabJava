package lab4;
import static java.lang.System.*;
public class Zadanie4
{
    public static void main(String args[])
    {
        int[][] tabliczkaMnozenia = new int[15][15];
        int[] wartosciSrednie = new int[15];
        for (int w = 0; w < tabliczkaMnozenia.length; w++)
        {
            for (int k = 0; k < tabliczkaMnozenia[w].length; k++)
                {
                    tabliczkaMnozenia[k][w] = (k + 1) * (w + 1);
                    wartosciSrednie[k] += tabliczkaMnozenia[k][w];
                }
        }
        for (int i = 0; i < wartosciSrednie.length; i++)
        {
        	wartosciSrednie[i] /= 15;
        }
        System.out.println((new Macierz(tabliczkaMnozenia)).toString());
        out.println("Wartosci srednie kazdej kolumny: ");
        Tablica wartSr = new Tablica(wartosciSrednie);
        out.println(wartSr.toString());
    }
}