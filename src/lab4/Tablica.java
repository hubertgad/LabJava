package lab4;
public class Tablica
{
    private int tablica[];
    Tablica(int tablica[])
    {
        this.tablica = tablica.clone();
    }
    public String toString()
    {
        String output = "";
        output += "|";
        for (int k = 0; k < tablica.length; k++)
        {
            output += String.format("%4d  ", tablica[k]);
        }
        output += "|\n";
        return output;
    }
}