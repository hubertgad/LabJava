package lab9.Zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie2
{
    public static void main(String[] args)
    {
        Path path = Paths.get("src/lab9/Zadanie2/logi.txt");
        if (!Files.exists(path))
        {
            try
            {
                Files.createFile(path);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            for (int i = 0; i < 50; i++)
            {
                new GeneratorOcen().start();
            }
        }
        String wczytaj = "";
        try (Scanner kb = new Scanner(System.in))
        {
            while (!wczytaj.toLowerCase().contains("wczytaj"))
            {
                System.out.println("Aby wczytac oczeny, wpisz polecenie \"wczytaj\"");
                wczytaj = kb.nextLine();
            }
        }
        List<String> bufor = new ArrayList<String>();
        try (BufferedReader reader = Files.newBufferedReader(path))
        {
            while (reader.ready()) bufor.add(reader.readLine());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        bufor.parallelStream().forEach(s -> System.out.println(new OcenaFilmu(s)));
    }
}