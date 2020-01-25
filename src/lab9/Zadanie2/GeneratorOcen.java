package lab9.Zadanie2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

public class GeneratorOcen extends Thread
{
    @Override
    public void run()
    {
        int id_filmu = Math.abs((new Random()).nextInt() % 100);
        int id_uzytkowanika = Math.abs((new Random()).nextInt() % 10);
        int ocena = Math.abs((new Random()).nextInt() % 10);
        OcenaFilmu ocenaFilmu = new OcenaFilmu(id_filmu, id_uzytkowanika, ocena, new Date());
        try (   FileWriter fw = new FileWriter("src/lab9/Zadanie2/logi.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pWriter = new PrintWriter(bw))
        {
                pWriter.println(ocenaFilmu.toCSV());
        }
        catch (IOException e)
        {
            System.out.println("Blad podczas zapisywania pliku.");
        }
    }
}
