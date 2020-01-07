package lab6.Zadanie2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/lab6/Zadanie2/Tekst.txt")))
        {
            String line = line = reader.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku.");
        }
        catch (IOException e)
        {
            System.out.println("Błąd podczas odczytywania pliku.");
        }
    }
}