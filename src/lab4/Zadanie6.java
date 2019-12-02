package lab4;
import java.util.Arrays;
public class Zadanie6
{
    public static void main(String[] args)
    {
    	char[] alfabet = new char['z'-'a' + 1];
    	for (char litera = 'a'; litera <= 'z'; litera++)
    	{
    		alfabet[litera-'a'] = litera;
    	}
    	System.out.println("Dlugosc tablicy: " + alfabet.length);
    	System.out.print(Arrays.toString(alfabet));
    }
}