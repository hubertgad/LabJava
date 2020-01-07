package lab5.Zadanie8;

public class BramkaXOR extends Bramka
{
    BramkaXOR(String input)
    {
        this.Output = "";
        this.Input = input;
        calculateOutput(Input.toCharArray(), inputs);
    }

    @Override
    protected void calculateOutput()
    {
        ;
    }
    protected void calculateOutput(char[] liczby, int dlugosc)
    {
        compareFirstAndSecond(liczby, dlugosc);
    }
    private char compareFirstAndSecond(char[] liczby, int dlugosc)
    {
        if ((dlugosc > 1) && (liczby[0] != liczby[1]))
        {
            liczby[1] = '1';
            liczby = new char[liczby.length-1];
            return '1';
        }
        else
        {
            return '0';
        }
    }
}
