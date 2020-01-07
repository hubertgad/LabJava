package lab6.Zadanie1_3;

public class Main
{
    public static void main(String[] args)
    {
        Kalkulator kalkulator = new Kalkulator(100034, 555, 9759, 84746, 4678, 321, 666);
        kalkulator.licz();
        kalkulator.zapiszDaneWPliku();
    }
}