package lab5.Zadanie8;
import java.util.Scanner;
import static java.lang.System.out;
public class Main
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        out.println("Bramka AND: ");
        BramkaAND bramkaAND = new BramkaAND(Long.toString(kb.nextLong()));
        out.println(bramkaAND.getOutput());

        out.println("Bramka OR: ");
        BramkaOR bramkaOR = new BramkaOR(Long.toString(kb.nextLong()));
        out.println(bramkaOR.getOutput());

        out.println("Bramka NOT: ");
        BramkaNOT bramkaNOT = new BramkaNOT(Long.toString(kb.nextLong()));
        out.println(bramkaNOT.getOutput());

        kb.close();
    }
}
