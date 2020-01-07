package lab5.Zadanie8;

import java.util.InputMismatchException;

public class BramkaNOT extends Bramka
{
    BramkaNOT()
    {
        ;
    }
    BramkaNOT(String input)
    {
        this.Output = "";
        this.Input = input;
        calculateOutput();
    }

    @Override
    protected void calculateOutput()
    {
        for (var znak : this.Input.toCharArray())
        {
            if (Character.valueOf(znak).equals('1'))
            {
                this.Output += '0';
            }
            else if (Character.valueOf(znak).equals('0'))
            {
                this.Output += '1';
            }
            else
            {
                throw new InputMismatchException();
            }
        }
    }
}