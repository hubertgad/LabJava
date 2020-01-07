package lab6.Zadanie1_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kalkulator
{
    List<Double> liczby;
    public double wynik;

    Kalkulator(double a)
    {
        this.liczby = new ArrayList<Double>();
        this.liczby.add(a);
    }
    public Kalkulator(double a, double b, double c)
    {
        this.liczby = new ArrayList<Double>();
        this.liczby.add(a);
        this.liczby.add(b);
        this.liczby.add(c);
    }
    public Kalkulator(double a, double b, double c, double d, double e, double f, double g)
    {
        this.liczby = new ArrayList<Double>();
        this.liczby.add(a);
        this.liczby.add(b);
        this.liczby.add(c);
        this.liczby.add(d);
        this.liczby.add(e);
        this.liczby.add(f);
        this.liczby.add(g);
    }
    public Kalkulator (Kalkulator that)
    {
        this.liczby = that.liczby;
    }
    public double licz()
    {
        this.wynik = 0;
        for (double liczba : this.liczby)
        {
            this.wynik += liczba;
        }
        return this.wynik;
    }
    public void zapiszDaneWPliku()
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/lab6/Zadanie1_3/Kalkulator.txt")))
        {
            writer.write("Uzyte liczby: " + this.liczby.toString());
            writer.newLine();
            writer.write("Wynik: " + this.wynik);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}