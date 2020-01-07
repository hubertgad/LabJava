package lab6.Zadanie4_5;

import java.io.*;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[][] array = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                array[j][i] = Math.abs(random.nextInt()) % 100;
            }
        }
        zapiszDoPlikuCSV(array);
        odczytajZPlikuCSV();
    }
    private static void zapiszDoPlikuCSV(int[][] array)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/lab6/Zadanie4_5/Array.csv")))
        {
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    writer.write(String.format("%3s", Integer.toString(array[j][i])));
                }
                writer.write('\n');
            }
        }
        catch (IOException e)
        {
            System.out.println("Blad podczas zapisywania pliku.");
        }
    }
    private static void odczytajZPlikuCSV()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/lab6/Zadanie4_5/Array.csv")))
        {
            var array = reader.readLine();
            while (array != null)
            {
                System.out.println(array);
                array = reader.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku");
        }
        catch (IOException e)
        {
            System.out.println("Nie mozna otworzyc pliku.");
        }
    }
}